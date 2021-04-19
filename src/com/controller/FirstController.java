package com.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value="/hello")
public class FirstController {
    @RequestMapping(value = "/first")
    public String handleRequest(HttpServletRequest request, HttpServletResponse response, Model model){
        model.addAttribute("msg","kkkksss");
        return "liao";
    }

}