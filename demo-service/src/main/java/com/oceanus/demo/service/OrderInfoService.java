package com.oceanus.demo.service;


import com.oceanus.demo.model.OrderInfo;

import java.util.List;

/**
 * Created by lilianqiang on 2015-12-09.
 */
public interface OrderInfoService {
    /**
     * 保存货运单信息
     * @param orderInfo
     * @return
     */
    Integer save(OrderInfo orderInfo);


    /**
     * 根据租户id和流水号查询货运单信息
     * @param orderInfo
     * @return
     */
    List<OrderInfo> findByTenantAndSerialNumber(OrderInfo orderInfo);
}
