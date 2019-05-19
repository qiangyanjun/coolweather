package com.coolweather.android.gson;

/**
 * Created by QIANG on 2019/5/19.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
