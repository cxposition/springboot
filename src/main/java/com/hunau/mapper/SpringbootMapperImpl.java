package com.hunau.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by MI on 2019/1/16.
 */
public class SpringbootMapperImpl implements SpringbootMapper {

    @Override
    public void show(List<Map<String, Object>> mapList) {
        Map<String, Object>[] maps = new HashMap[5];
        for(int i = 0; i < 5; i++) {
            maps[i] = new HashMap<>();
            maps[i].put("A", "123");
            maps[i].put("B", "456");
            maps[i].put("C", "789");
            maps[i].put("D", "000");
            mapList.add(maps[i]);
        }
    }
}
