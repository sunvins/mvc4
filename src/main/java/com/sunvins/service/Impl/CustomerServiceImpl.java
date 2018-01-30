package com.sunvins.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunvins.bean.SearchBean;
import com.sunvins.dao.CustomerDao;
import com.sunvins.model.CustomerVO;
import com.sunvins.service.CustomerService;

@Service  
public class CustomerServiceImpl implements CustomerService {  
    @Autowired    
    private CustomerDao CustomerDao;    
    
	public List<CustomerVO> getSearchList(SearchBean searchBean) {
		return CustomerDao.getSearchList(searchBean);
	}

	public CustomerVO getByCid(int cid) {
		return CustomerDao.getByCid(cid);
	}

	public void insert(CustomerVO CustomerVO) {
		CustomerDao.insert(CustomerVO);
	}

	public void update(CustomerVO CustomerVO) {
		CustomerDao.update(CustomerVO);
	}

	public void delete(int cid) {
		CustomerDao.delete(cid);
	} 
} 
