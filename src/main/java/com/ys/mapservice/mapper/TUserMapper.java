package com.ys.mapservice.mapper;

import com.ys.mapservice.domain.entity.TUser;

public interface TUserMapper {
    int deleteByPrimaryKey(Integer uId);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Integer uId);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
}