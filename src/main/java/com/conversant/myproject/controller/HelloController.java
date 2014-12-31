package com.conversant.myproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("key", "value");
        return "index";
    }
}
