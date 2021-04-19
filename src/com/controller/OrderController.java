package com.controller;

import com.po.Orders;
import com.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {

    @RequestMapping("/tofindOrdersWithUser")
    public String tofindOrdersWithUser(){
        return "orders";
    }

    @RequestMapping("/findOrdersWithUser")
    public String findOrderWithUser(Orders orders){
        Integer orderId = orders.getOrdersId();
        User user =orders.getUser();
        String username = user.getUsername();
        System.out.println("orderId="+orderId);
        System.out.println("username="+username);
        return "success";


    }
}
