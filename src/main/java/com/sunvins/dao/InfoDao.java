package com.sunvins.dao;

import java.util.List;

import com.sunvins.bean.SearchBean;
import com.sunvins.model.InfoVO;

public interface InfoDao {  
	
    public List<InfoVO> getSearchList(SearchBean searchBean);
    
    public InfoVO getByCid(int cid);
    
    public void insert(InfoVO InfoVO);
    
    public void update(InfoVO InfoVO);
    
    public void delete(int cid);
} 
