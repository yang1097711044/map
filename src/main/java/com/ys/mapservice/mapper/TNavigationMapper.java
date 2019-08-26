package com.ys.mapservice.mapper;

import com.ys.mapservice.domain.entity.TNavigation;

import java.util.List;

/**
 * @author liuya
 */
public interface TNavigationMapper {
    List<TNavigation> findAllNavigation();
}