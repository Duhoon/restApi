package com.example.restapi.controller;

import java.util.ArrayList;
import java.util.HashMap;

import com.example.restapi.service.restService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController

public class restWeather {
    @Autowired
    restService restservice;
    @RequestMapping(value = "/weather")
    public Object actionMethod(){
        HashMap<String, Object> tempObject = new HashMap<String, Object>();
        tempObject = (HashMap<String, Object>)restservice.actionMethod();
        ArrayList<Object> timelist = new ArrayList<Object>();
        timelist = (ArrayList<Object>) tempObject.get("list");
        return timelist;
    }
}