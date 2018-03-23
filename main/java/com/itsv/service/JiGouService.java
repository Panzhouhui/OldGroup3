package com.itsv.service;

import com.github.pagehelper.PageInfo;
import com.itsv.domain.JiGou;

public interface JiGouService {
	void addJiGou(JiGou jiGou);
	void updateJiGouById(JiGou jiGou);
	void deleteJiGouById(Integer id);
	PageInfo<JiGou> getJiGouList(JiGou jiGou,int pageNum, int pageSize);
	PageInfo<JiGou> getJiGouAll(JiGou jiGou,int pageNum, int pageSize);
	JiGou getJiGouById(Integer id);
}
