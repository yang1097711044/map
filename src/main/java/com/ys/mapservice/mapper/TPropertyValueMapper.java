package com.ys.mapservice.mapper;

import com.ys.mapservice.domain.entity.TPropertyValue;

public interface TPropertyValueMapper {
    int deleteByPrimaryKey(Integer propertyValueId);

    int insert(TPropertyValue record);

    int insertSelective(TPropertyValue record);

    TPropertyValue selectByPrimaryKey(Integer propertyValueId);

    int updateByPrimaryKeySelective(TPropertyValue record);

    int updateByPrimaryKey(TPropertyValue record);
}