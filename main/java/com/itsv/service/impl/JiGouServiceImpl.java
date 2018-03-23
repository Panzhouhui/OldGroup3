package com.itsv.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itsv.dao.JiGouDao;
import com.itsv.domain.JiGou;
import com.itsv.service.JiGouService;


@Service
public class JiGouServiceImpl implements JiGouService{

	@Autowired
	private JiGouDao jiGouDao;
	
	public void addJiGou(JiGou jiGou) {
		// TODO Auto-generated method stub
		jiGouDao.addJiGou(jiGou);
	}

	public void updateJiGouById(JiGou jiGou) {
		// TODO Auto-generated method stub
		jiGouDao.updateJiGouById(jiGou);
	}

	public void deleteJiGouById(Integer id) {
		// TODO Auto-generated method stub
		jiGouDao.deleteJiGouById(id);
	}

	@Override
	public PageInfo<JiGou> getJiGouList(JiGou jiGou, int pageNum,int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		List<JiGou> jiGous = jiGouDao.getJiGouList(jiGou);
		PageInfo<JiGou> pageInfo = new PageInfo<>(jiGous);
		return pageInfo;
	}

	@Override
	public PageInfo<JiGou> getJiGouAll(JiGou jiGou, int pageNum,int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum,pageSize);
		List<JiGou> jiGous = jiGouDao.getJiGouAll(jiGou);
		PageInfo<JiGou> pageInfo = new PageInfo<>(jiGous);
		return pageInfo;
	}

	@Override
	public JiGou getJiGouById(Integer id) {
		JiGou jiGou = jiGouDao.getJiGouById(id);
		return jiGou;
	}

}
