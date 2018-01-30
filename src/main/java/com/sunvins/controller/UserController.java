package com.sunvins.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sunvins.bean.SearchBean;
import com.sunvins.helper.JsonHelper;
import com.sunvins.model.CustomerVO;
import com.sunvins.service.CustomerService;
import com.sunvins.service.DataDictService;
import com.sunvins.service.InfoService;
import com.sunvins.service.UserService;

@Controller  
public class UserController {  
      
    @Resource    
    private UserService userService;    
    @Resource    
    private CustomerService customerService;    
    @Resource    
    private DataDictService dataDictService;    
    @Resource    
    private InfoService infoService;    
        
    @RequestMapping("/showUserInfo")      
    public ModelAndView getIndex(){        
        ModelAndView mav = new ModelAndView("index");
//        User user = userService.selectUserById(2);    
//        SearchBean searchBean=new SearchBean();
//        List<UserVO>list=userService.getSearchList(searchBean);
//        System.out.println("----list size:"+list.size());
//        UserVO user0=new UserVO();
//        user0.setCid(6);
//        user0.setUserName("我为六");
//        user0.setUserPassword("我为密六");
//        userService.insert(user0);
//        searchBean.setCriteria1("我为六");
//        List<UserVO>list2=userService.getSearchList(searchBean);
//        System.out.println("----list size:"+list2.size());
//        UserVO user1=userService.getByCid(1);
//        System.out.println(user1);
//        if(user1!=null) {
//        	System.out.println(user1.getUserName());
//        	userService.delete(user1.getCid());
//        }
//        UserVO user2=userService.getByCid(2);
//        mav.addObject("user", user2); 
        CustomerVO customerVO=new CustomerVO();
        customerVO.setBirthDay(new Date());
        customerVO.setCid(1);
        customerVO.setUserId("旬子");
        customerVO.setUserName("发情了");
        customerVO.setUserPass("mm");
        customerService.insert(customerVO);
        
        List<CustomerVO> custList=customerService.getSearchList(new SearchBean());
        if(custList!=null) {
        	System.out.println("----数量："+custList.size());
        	CustomerVO c1=custList.get(0);
        	c1.setUserId("藤子");
        	customerService.update(c1);
        	CustomerVO c2=customerService.getByCid(1);
        	System.out.println(c2.getUserId());
        	JsonHelper.show(c2);
//        	customerService.delete(1);
        	List<CustomerVO> custList2=customerService.getSearchList(new SearchBean());
        	if(custList2!=null)System.out.println(custList2.size());
        }
        
        return mav;      
    } 
} 
