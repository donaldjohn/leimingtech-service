package com.leimingtech.service.module.doc.dao;

import java.util.List;

import com.leimingtech.core.entity.base.DocEnEntity;
import com.leimingtech.service.utils.page.Pager;

/**
 *    
 * 项目名称：leimingtech-admin   
 * 类名称：DocEntityDao   
 * 类描述：文档实体管理
 * 创建人：lkang   
 * 创建时间：2015年5月04日 10:52:19   
 */
public interface DocEntityDao {
	/**
	 * 获取引用实体总数
	 * @param pager
	 * @return
	 */
	int getDocEntityTotal(DocEnEntity docEntity);
	
	/**
	 * 获取引用实体分页数据
	 * @param pager
	 * @return
	 */
	List<DocEnEntity> getDocEntityList(Pager pager);
	
	/**
	 * 根据id获取引用实体
	 * @param entityId
	 * @return
	 */
	DocEnEntity getDocEntityById(int entityId);
	
	/**
	 * 保存引用实体
	 * @param docEntity
	 */
	void saveDocEntity(DocEnEntity docEntity);
	
	/**
	 * 修改引用实体
	 * @param docEntity
	 */
	void updateDocEntity(DocEnEntity docEntity);
	
	/**
	 *根据id删除引用实体
	 * @param entityId
	 */
	void deleteDocEntity(int entityId);
	
	/**
	 * 获取所有的实体
	 * @return
	 */
	List<DocEnEntity> getAllDocEntityList();
	
	/**
	 * 根据名字获取引用实体
	 * @param entityName
	 * @return
	 */
	DocEnEntity getDocEntityByName(String entityName);
}
