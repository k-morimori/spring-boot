package com.example.its.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    // GET のトップページと紐付け
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
