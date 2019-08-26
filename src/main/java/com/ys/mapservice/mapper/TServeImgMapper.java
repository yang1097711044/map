package com.ys.mapservice.mapper;

import com.ys.mapservice.domain.entity.TServeImg;

public interface TServeImgMapper {
    int deleteByPrimaryKey(Integer imgId);

    int insert(TServeImg record);

    int insertSelective(TServeImg record);

    TServeImg selectByPrimaryKey(Integer imgId);

    int updateByPrimaryKeySelective(TServeImg record);

    int updateByPrimaryKey(TServeImg record);
}