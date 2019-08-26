package com.ys.mapservice.domain.vo;

import com.ys.mapservice.domain.entity.TPropertyValue;
import com.ys.mapservice.domain.entity.TServe;
import lombok.Data;

import java.util.List;
/**
 * @author liuya
 * 一对多查询时用
 * 一个服务对应多种属性
 */
@Data
public class TServeVo extends TServe{
    List<TPropertyValue> tPropertyValueList;
}
