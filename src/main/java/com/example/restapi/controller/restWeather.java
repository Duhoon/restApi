package com.example.restapi.controller;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController

public class restWeather {
    @RequestMapping(value = "/weather")
    public Object actionMethod(){
        RestTemplate restTemplate = new RestTemplate();
        Object tempObject = new Object();
        String apiID = "a91a40ff6f14cc255d72ec7689dce371";
        String targetUrl = "https://api.openweathermap.org/data/2.5/forecast?id=524901&appid="+apiID;
        Map<String, Object> resultObject = new HashMap<String, Object>();
        resultObject = (Map<String, Object>) restTemplate.getForObject(targetUrl, Object.class);
        ArrayList<Object> timelist = new ArrayList<Object>();
        timelist = (ArrayList<Object>) resultObject.get("list");
        return timelist;
    }
}