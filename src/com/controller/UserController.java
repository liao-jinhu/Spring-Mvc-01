package com.controller;
import javax.servlet.http.HttpServletRequest;

import com.ov.UserOV;
import com.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserController {
    @RequestMapping("/selectUser")
    public String selectUser(HttpServletRequest request){
        String id =request.getParameter("id");
        System.out.println("id="+id);
        return  "success";
        //http://localhost:8080/Spring-Mvc-01/selectUser/?id=1

    }

    @RequestMapping("/selectUser2")
    public String selectUser2(Integer id){
        System.out.println("id="+id);
        return  "success";
        //http://localhost:8080/Spring-Mvc-01/selectUser2/?id=1

    }


    @RequestMapping("/selectUser3")
    public String selectUser3(@RequestParam(value="user_id") Integer id){
        System.out.println("id="+id);
        return  "success";
        //http://localhost:8080/Spring-Mvc-01/selectUser3/?id=1

    }

    /*
    向用户注册页面跳转
     */
    @RequestMapping("/toRegister")
    public String toRegister(){
        return  "register";
    }

    @RequestMapping("/registerUser")
    public String registerUser(User user){
        String username = user.getUsername();
        Integer password = user.getPassword();
        System.out.println("username="+username);
        System.out.println("password="+password);
        System.out.println(System.getProperty("file.encoding"));
        return "success";
    }


    /*绑定数组*/
    /*
    向用户列表页面跳转
     */

    @RequestMapping("/toUser")
    public String toUSer(){
        return "User";
    }


    /*
    批量删除用户的方法
     */
    @RequestMapping("/deleteUsers")
    public String deleteUsers(Integer[] ids){
        if ((ids != null)) {

            for (Integer id : ids) {
                System.out.println("删除了id为" + id + "用户！");
            }
        }

        else {
            System.out.println("id为空");
        }
        return  "success";
    }



    /*
    向用户批量修改页面跳转
     */
    @RequestMapping("/toUserEdit")
    public String toUserEdit(){
        return "user_edit";
    }

    @RequestMapping("/editUsers")
    public String  editUsers(UserOV userList){
        List<User> users = userList.getUsers();
        for(User user:users){
            if(user.getId()!=null){
                System.out.println("修改了id为"+user.getId()+"的用户名为:" +user.getUsername());
            }
            else {
                System.out.println("id为空");
            }
        }
        return "success";
    }


}
