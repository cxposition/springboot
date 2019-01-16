package com.hunau.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by MI on 2019/1/16.
 */
@Controller
public class springbootController {

    @RequestMapping("test")
    public String test() {
        return "index";
    }
}
