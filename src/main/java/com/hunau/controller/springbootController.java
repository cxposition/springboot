package com.hunau.controller;

import com.hunau.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by MI on 2019/1/16.
 */
@Controller
public class springbootController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Map<String, Object> map) {
        return "index";
    }

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String hello(Map <String, Object> map) {
        User user = new User(1, 123);
        map.put("user", user);
        return "hello";
    }
}
