package com.ys.mapservice.controller;

import com.ys.mapservice.domain.entity.TServe;
import com.ys.mapservice.domain.vo.TServeVo;
import com.ys.mapservice.service.IndexService;
import com.ys.mapservice.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ly
 */
@RestController
@RequestMapping("/ys")
public class IndexController {
    @Resource
    IndexService indexService;




    @RequestMapping("/findAllServe")
    public Result findAllServe(){
        List<TServeVo> allServe = indexService.findAllServe();
        return Result.success(allServe);
    }
}
