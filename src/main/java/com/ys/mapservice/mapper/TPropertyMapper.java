package com.ys.mapservice.mapper;

import com.ys.mapservice.domain.entity.TProperty;

public interface TPropertyMapper {
    int deleteByPrimaryKey(Integer propertyId);

    int insert(TProperty record);

    int insertSelective(TProperty record);

    TProperty selectByPrimaryKey(Integer propertyId);

    int updateByPrimaryKeySelective(TProperty record);

    int updateByPrimaryKey(TProperty record);
}