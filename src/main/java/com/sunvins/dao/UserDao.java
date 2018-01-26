package com.sunvins.dao;

import java.util.List;

import com.sunvins.bean.SearchBean;
import com.sunvins.model.UserVO;

public interface UserDao {  
	
    public List<UserVO> getSearchList(SearchBean searchBean);
    
    public UserVO getByCid(int cid);
    
    public void insert(UserVO userVO);
    
    public void update(UserVO userVO);
    
    public void delete(int cid);
} 
