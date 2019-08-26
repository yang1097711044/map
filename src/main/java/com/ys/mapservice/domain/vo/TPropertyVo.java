package com.ys.mapservice.domain.vo;

import com.ys.mapservice.domain.entity.TProperty;
import com.ys.mapservice.domain.entity.TPropertyValue;
import lombok.Data;

import java.util.List;

/**
 * @author liuya
 * 服务属性对应的服务属性值
 * 一对一的关系
 */
@Data
public class TPropertyVo extends TProperty {
    TPropertyValue tPropertyValue;
}
