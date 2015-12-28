package com.oceanus.demo.dao;

import com.oceanus.demo.model.OrderInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderInfoMapper {
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
