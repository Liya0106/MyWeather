package com.example.lia.myweather;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Created by lia on 21.07.17.
 */

public class NetworkUtils {
    private static final String API_KEY = "dbbd0d57a6340bdb22a18a8c025d339a";
    private static final String API_URL= "http://api.openweathermap.org/data/2.5/weather?";

    public static String generateApiLink(String lat, String lon) {
        return new StringBuilder(API_URL)
                .append("lat=")
                .append(lat)
                .append("&lon=")
                .append(lon)
                .append("&appid=")
                .append(API_KEY).toString();
    }

    public static WeatherData parseWeatherData(String json) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode rootNode = mapper.readTree(generateApiLink("100.1", "100.1"));
            JsonNode mainNode = rootNode.path("main");

        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
