package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class DateController {
    @RequestMapping("/customDate")
    public String CustomerDate(Date date){
        System.out.println("date="+date);
        return "success";

    }
}
