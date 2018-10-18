package com.example.qhc61.theweather;


import java.util.List;

public class Data {


    private List<HeWeather6Bean> HeWeather6;

    public List<HeWeather6Bean> getHeWeather6() {
        return HeWeather6;
    }

    public void setHeWeather6(List<HeWeather6Bean> HeWeather6) {
        this.HeWeather6 = HeWeather6;
    }

    public static class HeWeather6Bean {
        /**
         * basic : {"cid":"CN101301301","location":"北海","parent_city":"北海","admin_area":"广西","cnty":"中国","lat":"21.4733429","lon":"109.11925507","tz":"+8.00"}
         * update : {"loc":"2018-06-21 19:51","utc":"2018-06-21 11:51"}
         * status : ok
         * now : {"cloud":"44","cond_code":"101","cond_txt":"多云","fl":"33","hum":"80","pcpn":"0.0","pres":"1002","tmp":"30","vis":"19","wind_deg":"179","wind_dir":"南风","wind_sc":"3","wind_spd":"14"}
         * daily_forecast : [{"cond_code_d":"101","cond_code_n":"101","cond_txt_d":"多云","cond_txt_n":"多云","date":"2018-06-21","hum":"82","mr":"13:28","ms":"01:09","pcpn":"0.0","pop":"25","pres":"1004","sr":"06:02","ss":"19:29","tmp_max":"33","tmp_min":"29","uv_index":"5","vis":"7","wind_deg":"208","wind_dir":"西南风","wind_sc":"4-5","wind_spd":"28"},{"cond_code_d":"101","cond_code_n":"101","cond_txt_d":"多云","cond_txt_n":"多云","date":"2018-06-22","hum":"83","mr":"14:22","ms":"01:48","pcpn":"0.0","pop":"24","pres":"1003","sr":"06:02","ss":"19:29","tmp_max":"33","tmp_min":"29","uv_index":"3","vis":"18","wind_deg":"228","wind_dir":"西南风","wind_sc":"4-5","wind_spd":"31"},{"cond_code_d":"104","cond_code_n":"101","cond_txt_d":"阴","cond_txt_n":"多云","date":"2018-06-23","hum":"80","mr":"15:16","ms":"02:26","pcpn":"0.0","pop":"25","pres":"1002","sr":"06:02","ss":"19:29","tmp_max":"32","tmp_min":"29","uv_index":"5","vis":"18","wind_deg":"258","wind_dir":"西南风","wind_sc":"4-5","wind_spd":"32"},{"cond_code_d":"101","cond_code_n":"101","cond_txt_d":"多云","cond_txt_n":"多云","date":"2018-06-24","hum":"79","mr":"16:08","ms":"03:06","pcpn":"0.0","pop":"25","pres":"1002","sr":"06:03","ss":"19:29","tmp_max":"33","tmp_min":"28","uv_index":"6","vis":"20","wind_deg":"256","wind_dir":"西南风","wind_sc":"4-5","wind_spd":"26"},{"cond_code_d":"101","cond_code_n":"101","cond_txt_d":"多云","cond_txt_n":"多云","date":"2018-06-25","hum":"79","mr":"17:01","ms":"03:46","pcpn":"0.0","pop":"25","pres":"1004","sr":"06:03","ss":"19:30","tmp_max":"33","tmp_min":"28","uv_index":"7","vis":"19","wind_deg":"182","wind_dir":"南风","wind_sc":"3-4","wind_spd":"23"},{"cond_code_d":"101","cond_code_n":"101","cond_txt_d":"多云","cond_txt_n":"多云","date":"2018-06-26","hum":"78","mr":"17:53","ms":"04:27","pcpn":"0.0","pop":"25","pres":"1004","sr":"06:03","ss":"19:30","tmp_max":"33","tmp_min":"28","uv_index":"6","vis":"19","wind_deg":"189","wind_dir":"南风","wind_sc":"3-4","wind_spd":"21"},{"cond_code_d":"101","cond_code_n":"101","cond_txt_d":"多云","cond_txt_n":"多云","date":"2018-06-27","hum":"78","mr":"18:44","ms":"05:12","pcpn":"0.0","pop":"25","pres":"1005","sr":"06:03","ss":"19:30","tmp_max":"33","tmp_min":"28","uv_index":"10","vis":"18","wind_deg":"173","wind_dir":"南风","wind_sc":"3-4","wind_spd":"20"}]
         * hourly : [{"cloud":"99","cond_code":"104","cond_txt":"阴","dew":"27","hum":"87","pop":"7","pres":"1002","time":"2018-06-21 22:00","tmp":"29","wind_deg":"219","wind_dir":"西南风","wind_sc":"3-4","wind_spd":"13"},{"cloud":"96","cond_code":"101","cond_txt":"多云","dew":"26","hum":"90","pop":"7","pres":"1001","time":"2018-06-22 01:00","tmp":"29","wind_deg":"203","wind_dir":"西南风","wind_sc":"4-5","wind_spd":"32"},{"cloud":"97","cond_code":"101","cond_txt":"多云","dew":"25","hum":"91","pop":"7","pres":"1001","time":"2018-06-22 04:00","tmp":"29","wind_deg":"250","wind_dir":"西南风","wind_sc":"4-5","wind_spd":"25"},{"cloud":"98","cond_code":"101","cond_txt":"多云","dew":"25","hum":"91","pop":"7","pres":"1002","time":"2018-06-22 07:00","tmp":"29","wind_deg":"207","wind_dir":"西南风","wind_sc":"4-5","wind_spd":"27"},{"cloud":"98","cond_code":"101","cond_txt":"多云","dew":"26","hum":"90","pop":"7","pres":"1003","time":"2018-06-22 10:00","tmp":"31","wind_deg":"258","wind_dir":"西南风","wind_sc":"4-5","wind_spd":"32"},{"cloud":"98","cond_code":"101","cond_txt":"多云","dew":"26","hum":"88","pop":"7","pres":"1002","time":"2018-06-22 13:00","tmp":"31","wind_deg":"226","wind_dir":"西南风","wind_sc":"4-5","wind_spd":"26"},{"cloud":"99","cond_code":"101","cond_txt":"多云","dew":"26","hum":"87","pop":"7","pres":"999","time":"2018-06-22 16:00","tmp":"32","wind_deg":"228","wind_dir":"西南风","wind_sc":"4-5","wind_spd":"27"},{"cloud":"98","cond_code":"101","cond_txt":"多云","dew":"26","hum":"84","pop":"7","pres":"1000","time":"2018-06-22 19:00","tmp":"30","wind_deg":"256","wind_dir":"西南风","wind_sc":"3-4","wind_spd":"20"}]
         * lifestyle : [{"type":"comf","brf":"较不舒适","txt":"今天夜间天气多云，并且空气湿度偏大，在这种天气条件下，您会感到有些闷热，不很舒适。"},{"type":"drsg","brf":"炎热","txt":"天气炎热，建议着短衫、短裙、短裤、薄型T恤衫等清凉夏季服装。"},{"type":"flu","brf":"少发","txt":"各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。"},{"type":"sport","brf":"较适宜","txt":"天气较好，但因气温较高且风力较强，请适当降低运动强度并注意户外防风。推荐您进行室内运动。"},{"type":"trav","brf":"较适宜","txt":"天气较好，较热，但风稍大，能缓解较热的天气。较适宜旅游，您仍可陶醉于大自然的美丽风光中。"},{"type":"uv","brf":"中等","txt":"属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"},{"type":"cw","brf":"较不宜","txt":"较不宜洗车，未来一天无雨，风力较大，如果执意擦洗汽车，要做好蒙上污垢的心理准备。"},{"type":"air","brf":"良","txt":"气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。"}]
         */

        private BasicBean basic;
        private UpdateBean update;
        private String status;
        private NowBean now;
        private List<DailyForecastBean> daily_forecast;
        private List<HourlyBean> hourly;
        private List<LifestyleBean> lifestyle;

        public BasicBean getBasic() {
            return basic;
        }

        public void setBasic(BasicBean basic) {
            this.basic = basic;
        }

        public UpdateBean getUpdate() {
            return update;
        }

        public void setUpdate(UpdateBean update) {
            this.update = update;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public NowBean getNow() {
            return now;
        }

        public void setNow(NowBean now) {
            this.now = now;
        }

        public List<DailyForecastBean> getDaily_forecast() {
            return daily_forecast;
        }

        public void setDaily_forecast(List<DailyForecastBean> daily_forecast) {
            this.daily_forecast = daily_forecast;
        }

        public List<HourlyBean> getHourly() {
            return hourly;
        }

        public void setHourly(List<HourlyBean> hourly) {
            this.hourly = hourly;
        }

        public List<LifestyleBean> getLifestyle() {
            return lifestyle;
        }

        public void setLifestyle(List<LifestyleBean> lifestyle) {
            this.lifestyle = lifestyle;
        }

        public static class BasicBean {
            /**
             * cid : CN101301301
             * location : 北海
             * parent_city : 北海
             * admin_area : 广西
             * cnty : 中国
             * lat : 21.4733429
             * lon : 109.11925507
             * tz : +8.00
             */

            private String cid;
            private String location;
            private String parent_city;
            private String admin_area;
            private String cnty;
            private String lat;
            private String lon;
            private String tz;

            public String getCid() {
                return cid;
            }

            public void setCid(String cid) {
                this.cid = cid;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public String getParent_city() {
                return parent_city;
            }

            public void setParent_city(String parent_city) {
                this.parent_city = parent_city;
            }

            public String getAdmin_area() {
                return admin_area;
            }

            public void setAdmin_area(String admin_area) {
                this.admin_area = admin_area;
            }

            public String getCnty() {
                return cnty;
            }

            public void setCnty(String cnty) {
                this.cnty = cnty;
            }

            public String getLat() {
                return lat;
            }

            public void setLat(String lat) {
                this.lat = lat;
            }

            public String getLon() {
                return lon;
            }

            public void setLon(String lon) {
                this.lon = lon;
            }

            public String getTz() {
                return tz;
            }

            public void setTz(String tz) {
                this.tz = tz;
            }
        }

        public static class UpdateBean {
            /**
             * loc : 2018-06-21 19:51
             * utc : 2018-06-21 11:51
             */

            private String loc;
            private String utc;

            public String getLoc() {
                return loc;
            }

            public void setLoc(String loc) {
                this.loc = loc;
            }

            public String getUtc() {
                return utc;
            }

            public void setUtc(String utc) {
                this.utc = utc;
            }
        }

        public static class NowBean {
            /**
             * cloud : 44
             * cond_code : 101
             * cond_txt : 多云
             * fl : 33
             * hum : 80
             * pcpn : 0.0
             * pres : 1002
             * tmp : 30
             * vis : 19
             * wind_deg : 179
             * wind_dir : 南风
             * wind_sc : 3
             * wind_spd : 14
             */

            private String cloud;
            private String cond_code;
            private String cond_txt;
            private String fl;
            private String hum;
            private String pcpn;
            private String pres;
            private String tmp;
            private String vis;
            private String wind_deg;
            private String wind_dir;
            private String wind_sc;
            private String wind_spd;

            public String getCloud() {
                return cloud;
            }

            public void setCloud(String cloud) {
                this.cloud = cloud;
            }

            public String getCond_code() {
                return cond_code;
            }

            public void setCond_code(String cond_code) {
                this.cond_code = cond_code;
            }

            public String getCond_txt() {
                return cond_txt;
            }

            public void setCond_txt(String cond_txt) {
                this.cond_txt = cond_txt;
            }

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String getHum() {
                return hum;
            }

            public void setHum(String hum) {
                this.hum = hum;
            }

            public String getPcpn() {
                return pcpn;
            }

            public void setPcpn(String pcpn) {
                this.pcpn = pcpn;
            }

            public String getPres() {
                return pres;
            }

            public void setPres(String pres) {
                this.pres = pres;
            }

            public String getTmp() {
                return tmp;
            }

            public void setTmp(String tmp) {
                this.tmp = tmp;
            }

            public String getVis() {
                return vis;
            }

            public void setVis(String vis) {
                this.vis = vis;
            }

            public String getWind_deg() {
                return wind_deg;
            }

            public void setWind_deg(String wind_deg) {
                this.wind_deg = wind_deg;
            }

            public String getWind_dir() {
                return wind_dir;
            }

            public void setWind_dir(String wind_dir) {
                this.wind_dir = wind_dir;
            }

            public String getWind_sc() {
                return wind_sc;
            }

            public void setWind_sc(String wind_sc) {
                this.wind_sc = wind_sc;
            }

            public String getWind_spd() {
                return wind_spd;
            }

            public void setWind_spd(String wind_spd) {
                this.wind_spd = wind_spd;
            }
        }

        public static class DailyForecastBean {
            /**
             * cond_code_d : 101
             * cond_code_n : 101
             * cond_txt_d : 多云
             * cond_txt_n : 多云
             * date : 2018-06-21
             * hum : 82
             * mr : 13:28
             * ms : 01:09
             * pcpn : 0.0
             * pop : 25
             * pres : 1004
             * sr : 06:02
             * ss : 19:29
             * tmp_max : 33
             * tmp_min : 29
             * uv_index : 5
             * vis : 7
             * wind_deg : 208
             * wind_dir : 西南风
             * wind_sc : 4-5
             * wind_spd : 28
             */

            private String cond_code_d;
            private String cond_code_n;
            private String cond_txt_d;
            private String cond_txt_n;
            private String date;
            private String hum;
            private String mr;
            private String ms;
            private String pcpn;
            private String pop;
            private String pres;
            private String sr;
            private String ss;
            private String tmp_max;
            private String tmp_min;
            private String uv_index;
            private String vis;
            private String wind_deg;
            private String wind_dir;
            private String wind_sc;
            private String wind_spd;

            public String getCond_code_d() {
                return cond_code_d;
            }

            public void setCond_code_d(String cond_code_d) {
                this.cond_code_d = cond_code_d;
            }

            public String getCond_code_n() {
                return cond_code_n;
            }

            public void setCond_code_n(String cond_code_n) {
                this.cond_code_n = cond_code_n;
            }

            public String getCond_txt_d() {
                return cond_txt_d;
            }

            public void setCond_txt_d(String cond_txt_d) {
                this.cond_txt_d = cond_txt_d;
            }

            public String getCond_txt_n() {
                return cond_txt_n;
            }

            public void setCond_txt_n(String cond_txt_n) {
                this.cond_txt_n = cond_txt_n;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getHum() {
                return hum;
            }

            public void setHum(String hum) {
                this.hum = hum;
            }

            public String getMr() {
                return mr;
            }

            public void setMr(String mr) {
                this.mr = mr;
            }

            public String getMs() {
                return ms;
            }

            public void setMs(String ms) {
                this.ms = ms;
            }

            public String getPcpn() {
                return pcpn;
            }

            public void setPcpn(String pcpn) {
                this.pcpn = pcpn;
            }

            public String getPop() {
                return pop;
            }

            public void setPop(String pop) {
                this.pop = pop;
            }

            public String getPres() {
                return pres;
            }

            public void setPres(String pres) {
                this.pres = pres;
            }

            public String getSr() {
                return sr;
            }

            public void setSr(String sr) {
                this.sr = sr;
            }

            public String getSs() {
                return ss;
            }

            public void setSs(String ss) {
                this.ss = ss;
            }

            public String getTmp_max() {
                return tmp_max;
            }

            public void setTmp_max(String tmp_max) {
                this.tmp_max = tmp_max;
            }

            public String getTmp_min() {
                return tmp_min;
            }

            public void setTmp_min(String tmp_min) {
                this.tmp_min = tmp_min;
            }

            public String getUv_index() {
                return uv_index;
            }

            public void setUv_index(String uv_index) {
                this.uv_index = uv_index;
            }

            public String getVis() {
                return vis;
            }

            public void setVis(String vis) {
                this.vis = vis;
            }

            public String getWind_deg() {
                return wind_deg;
            }

            public void setWind_deg(String wind_deg) {
                this.wind_deg = wind_deg;
            }

            public String getWind_dir() {
                return wind_dir;
            }

            public void setWind_dir(String wind_dir) {
                this.wind_dir = wind_dir;
            }

            public String getWind_sc() {
                return wind_sc;
            }

            public void setWind_sc(String wind_sc) {
                this.wind_sc = wind_sc;
            }

            public String getWind_spd() {
                return wind_spd;
            }

            public void setWind_spd(String wind_spd) {
                this.wind_spd = wind_spd;
            }
        }

        public static class HourlyBean {
            /**
             * cloud : 99
             * cond_code : 104
             * cond_txt : 阴
             * dew : 27
             * hum : 87
             * pop : 7
             * pres : 1002
             * time : 2018-06-21 22:00
             * tmp : 29
             * wind_deg : 219
             * wind_dir : 西南风
             * wind_sc : 3-4
             * wind_spd : 13
             */

            private String cloud;
            private String cond_code;
            private String cond_txt;
            private String dew;
            private String hum;
            private String pop;
            private String pres;
            private String time;
            private String tmp;
            private String wind_deg;
            private String wind_dir;
            private String wind_sc;
            private String wind_spd;

            public String getCloud() {
                return cloud;
            }

            public void setCloud(String cloud) {
                this.cloud = cloud;
            }

            public String getCond_code() {
                return cond_code;
            }

            public void setCond_code(String cond_code) {
                this.cond_code = cond_code;
            }

            public String getCond_txt() {
                return cond_txt;
            }

            public void setCond_txt(String cond_txt) {
                this.cond_txt = cond_txt;
            }

            public String getDew() {
                return dew;
            }

            public void setDew(String dew) {
                this.dew = dew;
            }

            public String getHum() {
                return hum;
            }

            public void setHum(String hum) {
                this.hum = hum;
            }

            public String getPop() {
                return pop;
            }

            public void setPop(String pop) {
                this.pop = pop;
            }

            public String getPres() {
                return pres;
            }

            public void setPres(String pres) {
                this.pres = pres;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getTmp() {
                return tmp;
            }

            public void setTmp(String tmp) {
                this.tmp = tmp;
            }

            public String getWind_deg() {
                return wind_deg;
            }

            public void setWind_deg(String wind_deg) {
                this.wind_deg = wind_deg;
            }

            public String getWind_dir() {
                return wind_dir;
            }

            public void setWind_dir(String wind_dir) {
                this.wind_dir = wind_dir;
            }

            public String getWind_sc() {
                return wind_sc;
            }

            public void setWind_sc(String wind_sc) {
                this.wind_sc = wind_sc;
            }

            public String getWind_spd() {
                return wind_spd;
            }

            public void setWind_spd(String wind_spd) {
                this.wind_spd = wind_spd;
            }
        }

        public static class LifestyleBean {
            /**
             * type : comf
             * brf : 较不舒适
             * txt : 今天夜间天气多云，并且空气湿度偏大，在这种天气条件下，您会感到有些闷热，不很舒适。
             */

            private String type;
            private String brf;
            private String txt;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }
        }
    }
}
