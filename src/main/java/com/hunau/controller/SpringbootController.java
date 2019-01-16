package com.hunau.controller;

import com.hunau.entity.User;
import com.hunau.service.SpringbootService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by MI on 2019/1/16.
 */
@Controller
public class SpringbootController {
    SpringbootService springbootService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Map<String, Object> map) {
        return "index";
    }

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String hello(Map <String, Object> map) {
        springbootService = new SpringbootService("user", map);
        return "hello";
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }
}
