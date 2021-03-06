package com.leimingtech.service.module.product.service;

import com.leimingtech.core.entity.GoodsSpec;
import com.leimingtech.core.entity.base.Goods;

public interface ProductService {

	/**
	 * 保存goods
	 * cgl
	 * 2015年06月17日11:50:08
	 * 返回 0 则保存失败
	 * 否则返回goodsId
	 */
	public Integer saveGoods(Goods goods, String goodsSpecJson);
	
	
	/**
	 * 修改goods
	 * @param goods
	 * @param goodsSpecJson
	 * 返回 0 则保存失败
	 * 返回 1 则保存成功
	 */
	public Integer updateGoods(Goods goods, String goodsSpecJson);
	
    
    /**
     * 修改库存
     * @parm GoodsSpec 需要2个参数 specId 以及出售数量 specSalenum(这个出售数量是本次的出售数量)
     * 返回 0 则保存失败
	 * 返回 1 则保存成功
     */
    public Integer updateStorage(GoodsSpec goodsSpec);
	
}
