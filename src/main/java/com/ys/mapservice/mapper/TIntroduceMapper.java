package com.ys.mapservice.mapper;

import com.ys.mapservice.domain.entity.TIntroduce;

public interface TIntroduceMapper {
    int deleteByPrimaryKey(Integer introduceId);

    int insert(TIntroduce record);

    int insertSelective(TIntroduce record);

    TIntroduce selectByPrimaryKey(Integer introduceId);

    int updateByPrimaryKeySelective(TIntroduce record);

    int updateByPrimaryKey(TIntroduce record);
}