package com.liufei.cache.controller;

import com.liufei.cache.model.ProductInfo;
import com.liufei.cache.service.CacheService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;

@Controller
public class CacheController {
    @Resource
    private CacheService cacheService;

    @RequestMapping("/saveLocalCache")
    @ResponseBody
    public ProductInfo saveLocalCache(@RequestBody ProductInfo productInfo){
        return cacheService.saveLocalCache(productInfo);
    }

    @RequestMapping("/getLocalCache")
    @ResponseBody
    public ProductInfo getLocalCache(@RequestBody Long id){
        return cacheService.getLocalCache(id);
    }
}
