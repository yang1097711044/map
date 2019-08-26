package com.ys.mapservice.mapper;

import com.ys.mapservice.domain.entity.TBanner;

public interface TBannerMapper {
    int deleteByPrimaryKey(Integer bannerId);

    int insert(TBanner record);

    int insertSelective(TBanner record);

    TBanner selectByPrimaryKey(Integer bannerId);

    int updateByPrimaryKeySelective(TBanner record);

    int updateByPrimaryKey(TBanner record);
}