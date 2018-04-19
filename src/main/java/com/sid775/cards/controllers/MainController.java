package com.sid775.cards.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ModelAndView getMain(ModelAndView model){

        model.setViewName("index");

        return model;
    }
}
