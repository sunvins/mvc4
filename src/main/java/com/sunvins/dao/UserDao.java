package com.sunvins.dao;

import com.sunvins.model.User;

public interface UserDao {  
    public User selectUserById(Integer userId);    
}  
