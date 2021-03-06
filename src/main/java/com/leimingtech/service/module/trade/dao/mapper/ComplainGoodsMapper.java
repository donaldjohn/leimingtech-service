package com.leimingtech.service.module.trade.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.leimingtech.core.entity.base.ComplainGoods;
import com.leimingtech.core.orm.mybatis.SqlMapper;

/**
 * Created by rabook on 2014/12/21.
 */
@SqlMapper
public interface ComplainGoodsMapper {

    List<ComplainGoods> findByComplainId(@Param("id") int id);
}
