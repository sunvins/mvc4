package com.sunvins.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunvins.bean.SearchBean;
import com.sunvins.dao.DataDictDao;
import com.sunvins.model.DataDictVO;
import com.sunvins.service.DataDictService;

@Service  
public class DataDictServiceImpl implements DataDictService {  
    @Autowired    
    private DataDictDao DataDictDao;    
    
	public List<DataDictVO> getSearchList(SearchBean searchBean) {
		return DataDictDao.getSearchList(searchBean);
	}

	public DataDictVO getByCid(int cid) {
		return DataDictDao.getByCid(cid);
	}

	public void insert(DataDictVO DataDictVO) {
		DataDictDao.insert(DataDictVO);
	}

	public void update(DataDictVO DataDictVO) {
		DataDictDao.update(DataDictVO);
	}

	public void delete(int cid) {
		DataDictDao.delete(cid);
	} 
} 
