package com.ys.mapservice.mapper;

import com.ys.mapservice.domain.entity.TTimeline;

public interface TTimelineMapper {
    int deleteByPrimaryKey(Integer timeId);

    int insert(TTimeline record);

    int insertSelective(TTimeline record);

    TTimeline selectByPrimaryKey(Integer timeId);

    int updateByPrimaryKeySelective(TTimeline record);

    int updateByPrimaryKey(TTimeline record);
}