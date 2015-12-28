package com.oceanus.demo.service.impl;

import com.oceanus.demo.dao.OrderInfoMapper;
import com.oceanus.demo.model.OrderInfo;
import com.oceanus.demo.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lilianqiang on 2015-12-11.
 */
@Service
public class OrderInfoServiceImpl implements OrderInfoService {

    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Override
    public Integer save(OrderInfo orderInfo) {
        return orderInfoMapper.save(orderInfo);
    }

    @Override
    public List<OrderInfo> findByTenantAndSerialNumber(OrderInfo orderInfo) {
        List<OrderInfo> list=orderInfoMapper.findByTenantAndSerialNumber(orderInfo);
        return orderInfoMapper.findByTenantAndSerialNumber(orderInfo);
    }

}
