package com.hunau.controller;

import com.hunau.mapper.SpringbootMapper;
import com.hunau.mapper.SpringbootMapperImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by MI on 2019/1/16.
 */
@Controller
public class SpringbootController {
    SpringbootMapper springbootMapper = new SpringbootMapperImpl();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String hello(Model model) {
        List<Map<String, Object>> mapList = new ArrayList<>();
        springbootMapper.show(mapList);
        model.addAttribute("mapList",mapList);
        return "hello";
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "hello2", method = RequestMethod.GET)
    @ResponseBody
    public List<Map<String, Object>> hello2() {
        List<Map<String, Object>> mapList = new ArrayList<>();
        springbootMapper.show(mapList);
        return mapList;
    }
}
