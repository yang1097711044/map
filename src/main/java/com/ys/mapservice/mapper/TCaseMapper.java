package com.ys.mapservice.mapper;

import com.ys.mapservice.domain.entity.TCase;

public interface TCaseMapper {
    int deleteByPrimaryKey(Integer caseId);

    int insert(TCase record);

    int insertSelective(TCase record);

    TCase selectByPrimaryKey(Integer caseId);

    int updateByPrimaryKeySelective(TCase record);

    int updateByPrimaryKey(TCase record);
}