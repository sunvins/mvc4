package com.sunvins.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunvins.bean.SearchBean;
import com.sunvins.dao.UserDao;
import com.sunvins.model.UserVO;
import com.sunvins.service.UserService;

@Service  
public class UserServiceImpl implements UserService {  
    @Autowired    
    private UserDao userDao;    
    
	public List<UserVO> getSearchList(SearchBean searchBean) {
		return userDao.getSearchList(searchBean);
	}

	public UserVO getByCid(int cid) {
		return userDao.getByCid(cid);
	}

	public void insert(UserVO userVO) {
		userDao.insert(userVO);
	}

	public void update(UserVO userVO) {
		userDao.update(userVO);
	}

	public void delete(int cid) {
		userDao.delete(cid);
	} 
} 
