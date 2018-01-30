package com.sunvins.dao;

import java.util.List;

import com.sunvins.bean.SearchBean;
import com.sunvins.model.CustomerVO;

public interface CustomerDao {  
	
    public List<CustomerVO> getSearchList(SearchBean searchBean);
    
    public CustomerVO getByCid(int cid);
    
    public void insert(CustomerVO CustomerVO);
    
    public void update(CustomerVO CustomerVO);
    
    public void delete(int cid);
} 
