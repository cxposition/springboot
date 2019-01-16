package com.hunau.service;

import com.hunau.mapper.SpringbootMapper;

import java.util.Map;

/**
 * Created by MI on 2019/1/16.
 */
public class SpringbootService {
    Map<String, Object> map;

    public SpringbootService() {
    }

    public SpringbootService(String message, Map<String, Object> Map) {
        this.map = Map;
        map.put(message,new SpringbootMapper().select());
    }

}
