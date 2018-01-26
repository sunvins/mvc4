package com.sunvins.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunvins.dao.UserDao;
import com.sunvins.model.User;
import com.sunvins.service.UserService;

@Service  
public class UserServiceImpl implements UserService {  
    @Autowired    
    private UserDao userDao;    
    
    public User selectUserById(Integer userId) {    
        return userDao.selectUserById(userId);    
    } 
} 
