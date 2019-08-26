package com.ys.mapservice.service;

import com.ys.mapservice.domain.entity.TServe;
import com.ys.mapservice.domain.vo.TServeVo;

import java.util.List;

/**
 * @author ly
 */
public interface IndexService {
    /**
     * 所有的服务
     * @return
     */
    List<TServeVo> findAllServe();

}
