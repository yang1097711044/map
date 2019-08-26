package com.ys.mapservice.mapper;

import com.ys.mapservice.domain.entity.TCar;

public interface TCarMapper {
    int deleteByPrimaryKey(Integer carId);

    int insert(TCar record);

    int insertSelective(TCar record);

    TCar selectByPrimaryKey(Integer carId);

    int updateByPrimaryKeySelective(TCar record);

    int updateByPrimaryKey(TCar record);
}