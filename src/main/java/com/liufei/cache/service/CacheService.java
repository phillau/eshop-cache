package com.liufei.cache.service;

import com.liufei.cache.model.ProductInfo;

public interface CacheService {
    ProductInfo saveLocalCache(ProductInfo productInfo);

    ProductInfo getLocalCache(Long id);
}
