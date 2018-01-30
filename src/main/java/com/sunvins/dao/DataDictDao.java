package com.sunvins.dao;

import java.util.List;

import com.sunvins.bean.SearchBean;
import com.sunvins.model.DataDictVO;

public interface DataDictDao {  
	
    public List<DataDictVO> getSearchList(SearchBean searchBean);
    
    public DataDictVO getByCid(int cid);
    
    public void insert(DataDictVO DataDictVO);
    
    public void update(DataDictVO DataDictVO);
    
    public void delete(int cid);
} 
