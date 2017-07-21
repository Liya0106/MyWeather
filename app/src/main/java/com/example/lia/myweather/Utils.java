package com.example.lia.myweather;

/**
 * Created by lia on 21.07.17.
 */

public class Utils {
    public static final float getTemperatureFromString (String s) throws Exception{
        float tempKelvin = Float.parseFloat(s);
        return tempKelvin - 273.15f;
    }


}
