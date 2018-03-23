package com.itsv.dao;

import com.itsv.domain.JiGou;

import java.util.List;

public interface JiGouDao {
	void addJiGou(JiGou jigou);
	List<JiGou> getJiGouList(JiGou jiGou);
	void updateJiGouById(JiGou jiGou);
	void deleteJiGouById(Integer id);
	List<JiGou> getJiGouAll(JiGou jiGou);
	JiGou getJiGouById(Integer id);
}
