package com.example.qhc61.theweather;

import android.app.Activity;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.baidu.location.BDAbstractLocationListener;
import com.baidu.location.BDLocation;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    public Button btn;
    public LocationClient mLocationClient = null;
    int rate;
    SensorManager sm;//感应器
    Vibrator v;//振动器
    SensorEventListener listener;
    Sensor sensor;
    ListView listViewp, listViewc;
    ArrayAdapter<Province> adapterp;
    ArrayAdapter<City> adapterc;
    List<Province> listp = new ArrayList<Province>();
    List<City> listc = new ArrayList<City>();
    private EditText ed1;
    private BDAbstractLocationListener myListner = new BDAbstractLocationListener() {
        @Override
        public void onReceiveLocation(BDLocation bdLocation) {
            String city = bdLocation.getCity();//获取城市
            ed1.setText(city);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.ed1);
        listViewp = findViewById(R.id.list1);
        listViewc = findViewById(R.id.list2);
        btn = (Button) findViewById(R.id.btn);

        sm = (SensorManager) getSystemService(SENSOR_SERVICE);          //初始化
        v = (Vibrator) getSystemService(VIBRATOR_SERVICE);              //初始化
        sensor = sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);        //获取重力感应
        rate = SensorManager.SENSOR_DELAY_NORMAL;                       //正常震动频率

        mLocationClient = new LocationClient(this);  //声明LocationClient类

        LocationClientOption option = new LocationClientOption();
        option.setOpenGps(true);// 打开GPS
        option.setCoorType("bd09ll"); // 设置返回值的坐标类型。
        option.setLocationMode(LocationClientOption.LocationMode.Battery_Saving);//设置定位模式
        option.setScanSpan(5000); // 设置发起定位请求的间隔时间为5000ms
        option.setIsNeedAddress(true);//设置需要具体地址

        mLocationClient.setLocOption(option);
        mLocationClient.registerLocationListener(myListner);

        initlistp();


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                String cityname = ed1.getText().toString();
                intent.putExtra("cityname", cityname);
                intent.setClass(MainActivity.this, WeatherActivity.class);
                MainActivity.this.startActivity(intent);
            }

        });

        listener = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent sensorEvent) {

                float x = sensorEvent.values[0];
                float y = sensorEvent.values[1];
                float z = sensorEvent.values[2];

                float f = 15;

                int i = (int) (Math.random() * 100) % 5;
                if (Math.abs(x) > f || Math.abs(y) > f || Math.abs(z) > f) {
                    v.vibrate(1000);

                    if (!mLocationClient.isStarted()) {
                        String key = mLocationClient.getAccessKey();
                        mLocationClient.start();//开始定位
                    }
                }
            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int i) {

            }
        };
        sm.registerListener(listener, sensor, rate);//注册

    }

    @Override
    protected void onResume() {
        super.onResume();
        sm.registerListener(listener, sensor, rate);//注册
    }

    @Override
    protected void onStop() {
        super.onStop();
        v.cancel();//取消震动
        sm.unregisterListener(listener, sensor);//注销
    }

    @Override
    protected void onDestroy() {
        mLocationClient.stop();
        v.cancel();//取消震动
        sm.unregisterListener(listener, sensor);//注销
        super.onDestroy();
    }

    private void initlistp() {
        try {
            InputStreamReader inputReader = new InputStreamReader(getResources().getAssets().open("province.txt"), "gbk");
            BufferedReader bufReader = new BufferedReader(inputReader);
            String line = "";

            while ((line = bufReader.readLine()) != null) {
                if (!line.trim().equals("")) {
                    Province province = new Province();
                    int index = line.indexOf('=');
                    province.setName(line.substring(index + 1));
                    province.setCode(line.substring(0, index));

                    listp.add(province);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        adapterp = new ArrayAdapter<Province>(this, R.layout.listitem_style, listp);
        listViewp.setAdapter((ListAdapter) adapterp);
        listViewp.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                initlistc(listp.get(position).getCode());
            }
        });
    }

    private void initlistc(String provincecode) {
        try {
            InputStreamReader inputReader = new InputStreamReader(getResources().getAssets().open("cities.txt"), "gbk");
            BufferedReader bufReader = new BufferedReader(inputReader);
            String line = "";

            listc.removeAll(listc);

            while ((line = bufReader.readLine()) != null) {

                if (!line.trim().equals("") && line.startsWith(provincecode)) {
                    City city = new City();
                    int index = line.indexOf('=');
                    city.setName(line.substring(index + 1));
                    city.setCode(line.substring(0, index));

                    listc.add(city);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        adapterc = new ArrayAdapter<City>(this, R.layout.listitem_style, listc);
        listViewc.setAdapter(adapterc);

        listViewc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String result = listc.get(position).getName() + "\r\n" + listc.get(position).getCode();
                Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent();
                intent.putExtra("cityname", listc.get(position).getName());
                intent.setClass(MainActivity.this, WeatherActivity.class);//指定要intent要启动的类
                MainActivity.this.startActivity(intent);//启动一个新的Activity
            }
        });
    }
}
