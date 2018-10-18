package com.example.qhc61.theweather;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class WeatherActivity extends Activity {
    Data root;
    String result;
    String url;
    String strpar = "";

    ImageView tvCond_img_d01,tvCond_img_d02,tvCond_img_d03,tvCond_img_d04,tvCond_img_d05,tvCond_img_d06,tvCond_img_d07,
              img_001,img_002,img_003,img_004,img_005,img_006,img_007,tvBrf_img;

    TextView tvTmp,tvCity,tvDate,tvCond_txt_d,tvCond_txt_d01,tvCond_txt_d02,tvCond_txt_d03,tvCond_txt_d04,
            tvCond_txt_d05,tvCond_txt_d06,tv_wind_deg,tv_Hum,tv_Pcpn,tv_txt,
            week6,week7,week1,week2,week3,week4,
            tvWind_sc,tvWind_sc01,tvWind_sc02,tvWind_sc03,tvWind_sc04,tvWind_sc05,tvWind_sc06,
            tvWind_sc001,tvWind_sc002,tvWind_sc003,tvWind_sc004,tvWind_sc005,tvWind_sc006,tvWind_sc007,
            tvWind_dir,tvWind_dir01,tvWind_dir02,tvWind_dir03,tvWind_dir04,tvWind_dir05,tvWind_dir06,
            tvTmp_min01,tvTmp_max01,tvBrf,tvTmp_min02,tvTmp_max02,tvTmp_min03,tvTmp_max03,tvTmp_min04,tvTmp_max04,tvTmp_min05,tvTmp_max05,tvTmp_min06,tvTmp_max06,tvTmp_min07,tvTmp_max07;

    LinearLayout cly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        Intent data = getIntent();
        String name = data.getExtras().getString("cityname");
        /* String name=data.getStringExtra("name");*/

        url = "https://free-api.heweather.com/s6/weather?location="+name+"&key=a6de09ea128f4f4d858459ef8bed154d";

        week6=(TextView)findViewById(R.id.week6);
        week7=(TextView)findViewById(R.id.week7);
        week1=(TextView)findViewById(R.id.week1);
        week2=(TextView)findViewById(R.id.week2);
        week3=(TextView)findViewById(R.id.week3);
        week4=(TextView)findViewById(R.id.week4);

        tv_txt=(TextView)findViewById(R.id.tv_txt);//生活详解
        tvBrf_img=(ImageView)findViewById(R.id.tvBrf_img);//表情图片
        tvTmp = (TextView) findViewById(R.id.tvTmp);//温度
        tvCity=(TextView)findViewById(R.id.tvCity);//城市
        tvDate=(TextView)findViewById(R.id.tvDate);//时间
        tv_wind_deg=(TextView)findViewById(R.id.tv_wind_deg);//风向角度
        tv_Hum=(TextView)findViewById(R.id.tv_Hum);//相对湿度
        tv_Pcpn=(TextView)findViewById(R.id.tv_Pcpn); //降水量
        tvWind_dir=(TextView)findViewById(R.id.tvWind_dir);

        tvBrf=(TextView)findViewById(R.id.tvBrf);

        //小时图片更新图
        img_001=(ImageView)findViewById(R.id.img_001);
        img_002=(ImageView)findViewById(R.id.img_002);
        img_003=(ImageView)findViewById(R.id.img_003);
        img_004=(ImageView)findViewById(R.id.img_004);
        img_005=(ImageView)findViewById(R.id.img_005);
        img_006=(ImageView)findViewById(R.id.img_006);
        img_007=(ImageView)findViewById(R.id.img_007);

        //小时时间更新信息
        tvWind_sc001=(TextView)findViewById(R.id.tvWind_sc001);
        tvWind_sc002=(TextView)findViewById(R.id.tvWind_sc002);
        tvWind_sc003=(TextView)findViewById(R.id.tvWind_sc003);
        tvWind_sc004=(TextView)findViewById(R.id.tvWind_sc004);
        tvWind_sc005=(TextView)findViewById(R.id.tvWind_sc005);
        tvWind_sc006=(TextView)findViewById(R.id.tvWind_sc006);
        tvWind_sc007=(TextView)findViewById(R.id.tvWind_sc007);


        tvWind_sc=(TextView)findViewById(R.id.tvWind_sc);//风力
        tvWind_sc01=(TextView)findViewById(R.id.tvWind_sc01);//风力
        tvWind_sc02=(TextView)findViewById(R.id.tvWind_sc02);//风力
        tvWind_sc03=(TextView)findViewById(R.id.tvWind_sc03);//风力
        tvWind_sc04=(TextView)findViewById(R.id.tvWind_sc04);//风力
        tvWind_sc05=(TextView)findViewById(R.id.tvWind_sc05);//风力
        tvWind_sc06=(TextView)findViewById(R.id.tvWind_sc06);//风力


        //天气情况
        tvCond_txt_d=(TextView)findViewById(R.id.tvCond_txt_d);
        tvCond_txt_d01=(TextView)findViewById(R.id.tvCond_txt_d01);
        tvCond_txt_d02=(TextView)findViewById(R.id.tvCond_txt_d02);
        tvCond_txt_d03=(TextView)findViewById(R.id.tvCond_txt_d03);
        tvCond_txt_d04=(TextView)findViewById(R.id.tvCond_txt_d04);
        tvCond_txt_d05=(TextView)findViewById(R.id.tvCond_txt_d05);
        tvCond_txt_d06=(TextView)findViewById(R.id.tvCond_txt_d06);

        //天气情况图
        tvCond_img_d01=(ImageView)findViewById(R.id.tvCond_img_d01);
        tvCond_img_d02=(ImageView)findViewById(R.id.tvCond_img_d02);
        tvCond_img_d03=(ImageView)findViewById(R.id.tvCond_img_d03);
        tvCond_img_d04=(ImageView)findViewById(R.id.tvCond_img_d04);
        tvCond_img_d05=(ImageView)findViewById(R.id.tvCond_img_d05);
        tvCond_img_d06=(ImageView)findViewById(R.id.tvCond_img_d06);
        tvCond_img_d07=(ImageView)findViewById(R.id.tvCond_img_d07);

        //风向
        tvWind_dir01=(TextView)findViewById(R.id.tvWind_dir01);
        tvWind_dir02=(TextView)findViewById(R.id.tvWind_dir02);
        tvWind_dir03=(TextView)findViewById(R.id.tvWind_dir03);
        tvWind_dir04=(TextView)findViewById(R.id.tvWind_dir04);
        tvWind_dir05=(TextView)findViewById(R.id.tvWind_dir05);
        tvWind_dir06=(TextView)findViewById(R.id.tvWind_dir06);


        tvTmp_min01=(TextView)findViewById(R.id.tvTmp_Min);
        tvTmp_max01=(TextView)findViewById(R.id.tvTmp_Max);

        tvTmp_min02=(TextView)findViewById(R.id.tvTmp_min02);
        tvTmp_max02=(TextView)findViewById(R.id.tvTmp_max02);

        tvTmp_min03=(TextView)findViewById(R.id.tvTmp_min03);
        tvTmp_max03=(TextView)findViewById(R.id.tvTmp_max03);

        tvTmp_min04=(TextView)findViewById(R.id.tvTmp_min04);
        tvTmp_max04=(TextView)findViewById(R.id.tvTmp_max04);

        tvTmp_min05=(TextView)findViewById(R.id.tvTmp_min05);
        tvTmp_max05=(TextView)findViewById(R.id.tvTmp_max05);

        tvTmp_min06=(TextView)findViewById(R.id.tvTmp_min06);
        tvTmp_max06=(TextView)findViewById(R.id.tvTmp_max06);

        tvTmp_min07=(TextView)findViewById(R.id.tvTmp_min07);
        tvTmp_max07=(TextView)findViewById(R.id.tvTmp_max07);


        week6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_Hum.setText("相对湿度:"+root.getHeWeather6().get(0).getDaily_forecast().get(1).getHum());//相对湿度
                tvCond_txt_d.setText(root.getHeWeather6().get(0).getDaily_forecast().get(1).getCond_txt_d());
                tvWind_dir.setText(root.getHeWeather6().get(0).getDaily_forecast().get(1).getWind_dir());
                tvWind_sc.setText(root.getHeWeather6().get(0).getDaily_forecast().get(1).getWind_sc()+"级");
                tvTmp_min01.setText(root.getHeWeather6().get(0).getDaily_forecast().get(1).getTmp_min()+"~");//最小温度
                tvTmp_max01.setText(root.getHeWeather6().get(0).getDaily_forecast().get(1).getTmp_max()+"°");//最大温度
                tvBrf.setText(root.getHeWeather6().get(0).getLifestyle().get(1).getBrf());//生活指数
                tvWind_sc.setText(root.getHeWeather6().get(0).getDaily_forecast().get(1).getWind_sc()+"级");
                tv_Pcpn.setText("降水量:"+root.getHeWeather6().get(0).getDaily_forecast().get(1).getPcpn());//降水量;

            }
        });

        week7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_Hum.setText("相对湿度:"+root.getHeWeather6().get(0).getDaily_forecast().get(2).getHum());//相对湿度
                tvCond_txt_d.setText(root.getHeWeather6().get(0).getDaily_forecast().get(2).getCond_txt_d());
                tvWind_dir.setText(root.getHeWeather6().get(0).getDaily_forecast().get(2).getWind_dir());
                tvWind_sc.setText(root.getHeWeather6().get(0).getDaily_forecast().get(2).getWind_sc()+"级");
                tvTmp_min01.setText(root.getHeWeather6().get(0).getDaily_forecast().get(2).getTmp_min()+"~");//最小温度
                tvTmp_max01.setText(root.getHeWeather6().get(0).getDaily_forecast().get(2).getTmp_max()+"°");//最大温度
                tvBrf.setText(root.getHeWeather6().get(0).getLifestyle().get(2).getBrf());//生活指数
                tvWind_sc.setText(root.getHeWeather6().get(0).getDaily_forecast().get(2).getWind_sc()+"级");
                tv_Pcpn.setText("降水量:"+root.getHeWeather6().get(0).getDaily_forecast().get(2).getPcpn());//降水量;
            }
        });

        week1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_Hum.setText("相对湿度:"+root.getHeWeather6().get(0).getDaily_forecast().get(3).getHum());//相对湿度
                tvCond_txt_d.setText(root.getHeWeather6().get(0).getDaily_forecast().get(3).getCond_txt_d());
                tvWind_dir.setText(root.getHeWeather6().get(0).getDaily_forecast().get(3).getWind_dir());
                tvWind_sc.setText(root.getHeWeather6().get(0).getDaily_forecast().get(3).getWind_sc()+"级");
                tvTmp_min01.setText(root.getHeWeather6().get(0).getDaily_forecast().get(3).getTmp_min()+"~");//最小温度
                tvTmp_max01.setText(root.getHeWeather6().get(0).getDaily_forecast().get(3).getTmp_max()+"°");//最大温度
                tvBrf.setText(root.getHeWeather6().get(0).getLifestyle().get(3).getBrf());//生活指数
                tvWind_sc.setText(root.getHeWeather6().get(0).getDaily_forecast().get(3).getWind_sc()+"级");
                tv_Pcpn.setText("降水量:"+root.getHeWeather6().get(0).getDaily_forecast().get(3).getPcpn());//降水量;
            }
        });
        week2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_Hum.setText("相对湿度:"+root.getHeWeather6().get(0).getDaily_forecast().get(4).getHum());//相对湿度
                tvCond_txt_d.setText(root.getHeWeather6().get(0).getDaily_forecast().get(4).getCond_txt_d());
                tvWind_dir.setText(root.getHeWeather6().get(0).getDaily_forecast().get(4).getWind_dir());
                tvWind_sc.setText(root.getHeWeather6().get(0).getDaily_forecast().get(4).getWind_sc()+"级");
                tvTmp_min01.setText(root.getHeWeather6().get(0).getDaily_forecast().get(4).getTmp_min()+"~");//最小温度
                tvTmp_max01.setText(root.getHeWeather6().get(0).getDaily_forecast().get(4).getTmp_max()+"°");//最大温度
                tvBrf.setText(root.getHeWeather6().get(0).getLifestyle().get(3).getBrf());//生活指数
                tvWind_sc.setText(root.getHeWeather6().get(0).getDaily_forecast().get(4).getWind_sc()+"级");
                tvWind_sc.setText(root.getHeWeather6().get(0).getDaily_forecast().get(4).getWind_sc()+"级");
                tv_Pcpn.setText("降水量:"+root.getHeWeather6().get(0).getDaily_forecast().get(4).getPcpn());//降水量;
            }
        });
        week3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_Hum.setText("相对湿度:"+root.getHeWeather6().get(0).getDaily_forecast().get(5).getHum());//相对湿度
                tvCond_txt_d.setText(root.getHeWeather6().get(0).getDaily_forecast().get(5).getCond_txt_d());
                tvWind_dir.setText(root.getHeWeather6().get(0).getDaily_forecast().get(5).getWind_dir());
                tvWind_sc.setText(root.getHeWeather6().get(0).getDaily_forecast().get(5).getWind_sc()+"级");
                tvTmp_min01.setText(root.getHeWeather6().get(0).getDaily_forecast().get(5).getTmp_min()+"~");//最小温度
                tvTmp_max01.setText(root.getHeWeather6().get(0).getDaily_forecast().get(5).getTmp_max()+"°");//最大温度
                tvBrf.setText(root.getHeWeather6().get(0).getLifestyle().get(5).getBrf());//生活指数
                tvWind_sc.setText(root.getHeWeather6().get(0).getDaily_forecast().get(5).getWind_sc()+"级");
            }
        });
        week4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_Hum.setText("相对湿度:"+root.getHeWeather6().get(0).getDaily_forecast().get(6).getHum());//相对湿度
                tvCond_txt_d.setText(root.getHeWeather6().get(0).getDaily_forecast().get(6).getCond_txt_d());
                tvWind_dir.setText(root.getHeWeather6().get(0).getDaily_forecast().get(6).getWind_dir());
                tvWind_sc.setText(root.getHeWeather6().get(0).getDaily_forecast().get(6).getWind_sc()+"级");
                tvTmp_min01.setText(root.getHeWeather6().get(0).getDaily_forecast().get(6).getTmp_min()+"~");//最小温度
                tvTmp_max01.setText(root.getHeWeather6().get(0).getDaily_forecast().get(6).getTmp_max()+"°");//最大温度
                tvBrf.setText(root.getHeWeather6().get(0).getLifestyle().get(6).getBrf());//生活指数
                tvWind_sc.setText(root.getHeWeather6().get(0).getDaily_forecast().get(6).getWind_sc()+"级");
            }
        });



        cly = (LinearLayout) findViewById(R.id.cly);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    strpar = util.getJosonString(url);
                } catch (Exception e) {
                    e.printStackTrace();
                    strpar = "null";
                }
                cly.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        root = util.resolveRoot(strpar);

                        //封装图片
                        String text=root.getHeWeather6().get(0).getDaily_forecast().get(1).getCond_txt_d();
                        Wether(text,tvCond_img_d01);

                        String text2=root.getHeWeather6().get(0).getDaily_forecast().get(2).getCond_txt_d();
                        Wether(text2,tvCond_img_d02);

                        String text3=root.getHeWeather6().get(0).getDaily_forecast().get(3).getCond_txt_d();
                        Wether(text3,tvCond_img_d03);

                        String text4=root.getHeWeather6().get(0).getDaily_forecast().get(4).getCond_txt_d();
                        Wether(text4,tvCond_img_d04);

                        String text5=root.getHeWeather6().get(0).getDaily_forecast().get(5).getCond_txt_d();
                        Wether(text5,tvCond_img_d05);

                        String text6=root.getHeWeather6().get(0).getDaily_forecast().get(6).getCond_txt_d();
                        Wether(text6,tvCond_img_d06);

                        String text7=root.getHeWeather6().get(0).getDaily_forecast().get(0).getCond_txt_d();
                        Wether(text7,tvCond_img_d07);

                       //封装小时图片
                        String text8=root.getHeWeather6().get(0).getHourly().get(1).getCond_txt();
                        Wether(text8,img_001);

                        String text9=root.getHeWeather6().get(0).getHourly().get(2).getCond_txt();
                        Wether(text9,img_002);

                        String text10=root.getHeWeather6().get(0).getHourly().get(3).getCond_txt();
                        Wether(text10,img_003);

                        String text11=root.getHeWeather6().get(0).getHourly().get(4).getCond_txt();
                        Wether(text11,img_004);

                        String text12=root.getHeWeather6().get(0).getHourly().get(5).getCond_txt();
                        Wether(text12,img_005);

                        String text13=root.getHeWeather6().get(0).getHourly().get(6).getCond_txt();
                        Wether(text13,img_006);

                        String text14=root.getHeWeather6().get(0).getHourly().get(7).getCond_txt();
                        Wether(text14,img_007);


                        String text15=root.getHeWeather6().get(0).getLifestyle().get(0).getBrf();
                        Wether(text15,tvBrf_img);


                        //将数据显示在控件上
                        /*    assert root != null;*/
                        tv_txt.setText(root.getHeWeather6().get(0).getLifestyle().get(0).getTxt());
                        tv_Pcpn.setText("降水量:"+root.getHeWeather6().get(0).getDaily_forecast().get(0).getPcpn());//降水量;
                        tv_Hum.setText("相对湿度:"+root.getHeWeather6().get(0).getDaily_forecast().get(0).getHum());//相对湿度
                        tv_wind_deg.setText("风向角度:"+root.getHeWeather6().get(0).getNow().getWind_deg());//风向角度
                        tvTmp.setText(root.getHeWeather6().get(0).getNow().getTmp()+"°");//温度
                        tvCity.setText(root.getHeWeather6().get(0).getBasic().getParent_city()+"市");//城市
                        tvDate.setText(root.getHeWeather6().get(0).getDaily_forecast().get(0).getDate());//日期
                        tvBrf.setText(root.getHeWeather6().get(0).getLifestyle().get(0).getBrf());//生活指数


                        //逐小时预报天气情况
                        tvWind_sc001.setText(root.getHeWeather6().get(0).getHourly().get(1).getCond_txt());
                        tvWind_sc002.setText(root.getHeWeather6().get(0).getHourly().get(2).getCond_txt());
                        tvWind_sc003.setText(root.getHeWeather6().get(0).getHourly().get(3).getCond_txt());
                        tvWind_sc004.setText(root.getHeWeather6().get(0).getHourly().get(4).getCond_txt());
                        tvWind_sc005.setText(root.getHeWeather6().get(0).getHourly().get(5).getCond_txt());
                        tvWind_sc006.setText(root.getHeWeather6().get(0).getHourly().get(6).getCond_txt());
                        tvWind_sc007.setText(root.getHeWeather6().get(0).getHourly().get(7).getCond_txt());



                        tvWind_sc.setText(root.getHeWeather6().get(0).getDaily_forecast().get(0).getWind_sc()+"级");//风力
                        tvWind_sc01.setText(root.getHeWeather6().get(0).getDaily_forecast().get(1).getWind_sc()+"级");
                        tvWind_sc02.setText(root.getHeWeather6().get(0).getDaily_forecast().get(2).getWind_sc()+"级");
                        tvWind_sc03.setText(root.getHeWeather6().get(0).getDaily_forecast().get(3).getWind_sc()+"级");
                        tvWind_sc04.setText(root.getHeWeather6().get(0).getDaily_forecast().get(4).getWind_sc()+"级");
                        tvWind_sc05.setText(root.getHeWeather6().get(0).getDaily_forecast().get(5).getWind_sc()+"级");
                        tvWind_sc06.setText(root.getHeWeather6().get(0).getDaily_forecast().get(6).getWind_sc()+"级");


                        tvWind_dir.setText(root.getHeWeather6().get(0).getDaily_forecast().get(0).getWind_dir());//风向
                        tvWind_dir01.setText(root.getHeWeather6().get(0).getDaily_forecast().get(1).getWind_dir());//风向
                        tvWind_dir02.setText(root.getHeWeather6().get(0).getDaily_forecast().get(2).getWind_dir());//风向
                        tvWind_dir03.setText(root.getHeWeather6().get(0).getDaily_forecast().get(3).getWind_dir());
                        tvWind_dir04.setText(root.getHeWeather6().get(0).getDaily_forecast().get(4).getWind_dir());
                        tvWind_dir05.setText(root.getHeWeather6().get(0).getDaily_forecast().get(5).getWind_dir());
                        tvWind_dir06.setText(root.getHeWeather6().get(0).getDaily_forecast().get(6).getWind_dir());


                        tvCond_txt_d.setText(root.getHeWeather6().get(0).getDaily_forecast().get(0).getCond_txt_d());//天气情况
                        tvCond_txt_d01.setText(root.getHeWeather6().get(0).getDaily_forecast().get(1).getCond_txt_d());
                        tvCond_txt_d02.setText(root.getHeWeather6().get(0).getDaily_forecast().get(2).getCond_txt_d());
                        tvCond_txt_d03.setText(root.getHeWeather6().get(0).getDaily_forecast().get(3).getCond_txt_d());
                        tvCond_txt_d04.setText(root.getHeWeather6().get(0).getDaily_forecast().get(4).getCond_txt_d());
                        tvCond_txt_d05.setText(root.getHeWeather6().get(0).getDaily_forecast().get(5).getCond_txt_d());
                        tvCond_txt_d06.setText(root.getHeWeather6().get(0).getDaily_forecast().get(6).getCond_txt_d());


                        tvTmp_min01.setText(root.getHeWeather6().get(0).getDaily_forecast().get(0).getTmp_min()+"~");//最小温度
                        tvTmp_max01.setText(root.getHeWeather6().get(0).getDaily_forecast().get(0).getTmp_max()+"°");//最大温度

                        tvTmp_min02.setText(root.getHeWeather6().get(0).getDaily_forecast().get(1).getTmp_min()+"~");//最小温度
                        tvTmp_max02.setText(root.getHeWeather6().get(0).getDaily_forecast().get(1).getTmp_max()+"℃");//最大温度

                        tvTmp_min03.setText(root.getHeWeather6().get(0).getDaily_forecast().get(2).getTmp_min()+"~");//最小温度
                        tvTmp_max03.setText(root.getHeWeather6().get(0).getDaily_forecast().get(2).getTmp_max()+"℃");//最大温度

                        tvTmp_min04.setText(root.getHeWeather6().get(0).getDaily_forecast().get(3).getTmp_min()+"~");//最小温度
                        tvTmp_max04.setText(root.getHeWeather6().get(0).getDaily_forecast().get(3).getTmp_max()+"℃");//最大温度

                        tvTmp_min05.setText(root.getHeWeather6().get(0).getDaily_forecast().get(4).getTmp_min()+"~");//最小温度
                        tvTmp_max05.setText(root.getHeWeather6().get(0).getDaily_forecast().get(4).getTmp_max()+"℃");//最大温度

                        tvTmp_min06.setText(root.getHeWeather6().get(0).getDaily_forecast().get(5).getTmp_min()+"~");//最小温度
                        tvTmp_max06.setText(root.getHeWeather6().get(0).getDaily_forecast().get(5).getTmp_max()+"℃");//最大温度

                        tvTmp_min07.setText(root.getHeWeather6().get(0).getDaily_forecast().get(6).getTmp_min()+"~");//最小温度
                        tvTmp_max07.setText(root.getHeWeather6().get(0).getDaily_forecast().get(6).getTmp_max()+"℃");//最大温度


                        if (root.getHeWeather6().get(0).getDaily_forecast().get(0).getCond_txt_d()=="多云"){
                            tvCond_img_d07.setImageResource(R.drawable.img001);
                        }

                    }
                }, 1000);
            }
        }).start();
    }
    protected  void Wether(String text ,ImageView imageView ){
        switch (text){
            case "多云":
                imageView.setImageResource(R.drawable.img002);
                break;
            case "晴":
                imageView.setImageResource(R.drawable.img003);
                break;
            case "阴":
                imageView.setImageResource(R.drawable.img001);
                break;
            case "小雨":
                imageView.setImageResource(R.drawable.img008);
                break;
            case "中雨":
                imageView.setImageResource(R.drawable.img005);
                break;

            case "雷阵雨":
                imageView.setImageResource(R.drawable.img007);
                break;
            case "暴雨":
                imageView.setImageResource(R.drawable.img010);
                break;
            case "阵雨":
                imageView.setImageResource(R.drawable.img009);
                break;
            case "大雨":
                imageView.setImageResource(R.drawable.img006);
                break;
            case "较不舒适":
                imageView.setImageResource(R.drawable.img012);
                break;
            case "较舒适":
                imageView.setImageResource(R.drawable.img013);
                break;

        }

    }
}

