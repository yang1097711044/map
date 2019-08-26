package com.ys.mapservice.mapper;

import com.ys.mapservice.domain.entity.TNews;

public interface TNewsMapper {
    int deleteByPrimaryKey(Integer newsId);

    int insert(TNews record);

    int insertSelective(TNews record);

    TNews selectByPrimaryKey(Integer newsId);

    int updateByPrimaryKeySelective(TNews record);

    int updateByPrimaryKey(TNews record);
}