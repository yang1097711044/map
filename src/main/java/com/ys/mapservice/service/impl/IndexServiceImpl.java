package com.ys.mapservice.service.impl;

import com.ys.mapservice.domain.entity.TServe;
import com.ys.mapservice.domain.vo.TServeVo;
import com.ys.mapservice.mapper.TServeMapper;
import com.ys.mapservice.service.IndexService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author liuya
 * 查询所有服务的服务层实现类
 */
@Service
public class IndexServiceImpl implements IndexService {
    @Resource
    TServeMapper serveMapper;
    @Override
    public List<TServeVo> findAllServe() {
        List<TServeVo> allServe = serveMapper.findAll();
        return allServe;
    }
}
