package com.leimingtech.service.module.search.service;

import java.util.List;

import org.apache.lucene.analysis.Analyzer;

import com.leimingtech.core.entity.base.StoreWords;

/**
 * 店铺关键词
 * @author cgl
 * 2015年08月31日15:04:12
 */
public interface StoreWordsService {
	
	/**
	 * 将店铺名称,进行分词,存入数据库
	 * @param storeName 店铺名称
	 */
	void saveKeywordToDatabase(Analyzer analyzer, String storeName);
	
	/**
	 * 关键词匹配
	 */
	public List<StoreWords> keywordMatch(String keyword);
	
	/**
	 * 初始化
	 */
	public void deleteAndInitStoreWord();
}
