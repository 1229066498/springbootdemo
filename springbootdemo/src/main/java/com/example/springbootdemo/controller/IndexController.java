package com.example.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/springboot")
public class IndexController {

    ModelAndView modelAndView;

    @RequestMapping(value = "/index")
    public ModelAndView userList(Model model){

        modelAndView = new ModelAndView("header");
        return modelAndView;
    }
}
