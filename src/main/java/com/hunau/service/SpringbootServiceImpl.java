package com.hunau.service;

import com.hunau.mapper.SpringbootMapper;
import com.hunau.mapper.SpringbootMapperImpl;

import java.util.Map;

/**
 * Created by MI on 2019/1/16.
 */
public class SpringbootServiceImpl implements SpringbootService{
    Map<String, Object> map;
    SpringbootMapper springbootMapper;

    public SpringbootServiceImpl() {
    }

    public SpringbootServiceImpl(String message, Map<String, Object> Map) {
        this.map = Map;
        springbootMapper = new SpringbootMapperImpl();
        mapper(message);

    }

    public void mapper(String message) {
        map.put(message,springbootMapper.select());
    }

}
