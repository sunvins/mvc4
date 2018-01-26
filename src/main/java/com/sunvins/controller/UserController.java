package com.sunvins.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sunvins.model.User;
import com.sunvins.service.UserService;

@Controller  
public class UserController {  
      
    @Resource    
    private UserService userService;    
        
    @RequestMapping("/showUserInfo")      
    public ModelAndView getIndex(){        
        ModelAndView mav = new ModelAndView("index");     
        User user = userService.selectUserById(2);    
        mav.addObject("user", user);     
        return mav;      
    } 
} 
