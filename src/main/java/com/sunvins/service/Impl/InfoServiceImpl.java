package com.sunvins.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunvins.bean.SearchBean;
import com.sunvins.dao.InfoDao;
import com.sunvins.model.InfoVO;
import com.sunvins.service.InfoService;

@Service  
public class InfoServiceImpl implements InfoService {  
    @Autowired    
    private InfoDao InfoDao;    
    
	public List<InfoVO> getSearchList(SearchBean searchBean) {
		return InfoDao.getSearchList(searchBean);
	}

	public InfoVO getByCid(int cid) {
		return InfoDao.getByCid(cid);
	}

	public void insert(InfoVO InfoVO) {
		InfoDao.insert(InfoVO);
	}

	public void update(InfoVO InfoVO) {
		InfoDao.update(InfoVO);
	}

	public void delete(int cid) {
		InfoDao.delete(cid);
	} 
} 
