package com.sunvins.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sunvins.bean.SearchBean;
import com.sunvins.model.UserVO;
import com.sunvins.service.UserService;

@Controller  
public class UserController {  
      
    @Resource    
    private UserService userService;    
        
    @RequestMapping("/showUserInfo")      
    public ModelAndView getIndex(){        
        ModelAndView mav = new ModelAndView("index");     
//        User user = userService.selectUserById(2);    
        SearchBean searchBean=new SearchBean();
        List<UserVO>list=userService.getSearchList(searchBean);
        System.out.println("----list size:"+list.size());
        UserVO user0=new UserVO();
        user0.setCid(6);
        user0.setUserName("我为六");
        user0.setUserPassword("我为密六");
        userService.insert(user0);
        searchBean.setCriteria1("我为六");
        List<UserVO>list2=userService.getSearchList(searchBean);
        System.out.println("----list size:"+list2.size());
        UserVO user1=userService.getByCid(1);
        System.out.println(user1);
        if(user1!=null) {
        	System.out.println(user1.getUserName());
        	userService.delete(user1.getCid());
        }
        UserVO user2=userService.getByCid(2);
        mav.addObject("user", user2);     
        return mav;      
    } 
} 
