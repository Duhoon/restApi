package com.example.restapi.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class restService {
    public Object actionMethod(){
        RestTemplate restTemplate = new RestTemplate();
        Object tempObject = new Object();
        String apiID = "a91a40ff6f14cc255d72ec7689dce371";
        String targetUrl = "https://api.openweathermap.org/data/2.5/forecast?id=524901&appid="+apiID;
        Map<String, Object> resultObject = new HashMap<String, Object>();
        resultObject = (Map<String, Object>) restTemplate.getForObject(targetUrl, Object.class);
        return resultObject;
    }
}