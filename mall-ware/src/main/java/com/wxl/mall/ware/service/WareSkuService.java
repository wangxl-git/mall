package com.wxl.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wxl.common.utils.PageUtils;
import com.wxl.mall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author wangxl
 * @email 1919543837@qq.com
 * @date 2022-04-30 15:30:26
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
