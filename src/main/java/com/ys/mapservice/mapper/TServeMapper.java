package com.ys.mapservice.mapper;

import com.ys.mapservice.domain.entity.TServe;
import com.ys.mapservice.domain.vo.TServeVo;

import java.util.List;


/**
 * @author LY
 */
public interface TServeMapper {
    /**
     * 查询所有的服务名
     * @return
     */
   List<TServeVo> findAll();



}