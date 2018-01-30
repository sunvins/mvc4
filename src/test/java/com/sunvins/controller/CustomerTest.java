package com.sunvins.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

import java.util.Date;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.sunvins.model.CustomerVO;
import com.sunvins.service.CustomerService;

@FixMethodOrder(MethodSorters.JVM) 
public class CustomerTest extends BaseJunit4Test{  
    @Autowired //自动注入  
    private CustomerService customerService;    
//    private int cid=14;
    private String userId="天子";
    
    @Test
    public void search() {
    	
    }
    
    @Test
    @Transactional
    @Rollback(false)
    public void insert() throws Exception {
        CustomerVO customerVO=doInsert();
        assertEquals(customerVO.getUserId(), userId);
    } 
    
    private CustomerVO doInsert() {
    	 CustomerVO customerVO=new CustomerVO();
         customerVO.setBirthDay(new Date());
//         customerVO.setCid(cid);
         customerVO.setUserId(userId);
         customerVO.setUserName("八情了");
         customerVO.setUserPass("mm2");
         customerService.insert(customerVO);
         System.out.println("----------nice");
         return customerVO;
    }
    
    @Test
    @Transactional
    @Rollback(true)
    public void update(){ 
    	CustomerVO c1=doInsert();
        CustomerVO c2=customerService.getByCid(c1.getCid());
        c2.setUserName("是啊");
        customerService.update(c2);
        CustomerVO c3=customerService.getByCid(c1.getCid());
        assertEquals(c1.getCid(), c3.getCid());
        assertNotEquals(c1.getUserName(), c3.getUserName());
    } 
    
    @Test
    @Transactional
    @Rollback(true)
    public void delete(){ 
    	CustomerVO c1=doInsert();
        customerService.delete(c1.getCid());
        CustomerVO c2=customerService.getByCid(c1.getCid());
        assertNull(c2);
    }
} 
