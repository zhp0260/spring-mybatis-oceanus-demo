package com.oceanus.demo.restful.api.controller;


import com.bj58.oceanus.core.utils.RandomUtil;
import com.oceanus.demo.model.OrderInfo;
import com.oceanus.demo.restful.api.model.ResultModel;
import com.oceanus.demo.service.OrderInfoService;
import com.wordnik.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 上传扫描日志信息
 *
 * @author lilianqiang
 * @date 2015/11/23.
 */
@RestController
@RequestMapping("/order")
public class OrderInfoController {
    Logger log = Logger.getLogger(this.getClass());
    @Autowired
    private OrderInfoService orderInfoService;


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ApiOperation(value = "上传货运单数据信息")
    public ResponseEntity<ResultModel> save(@RequestParam(value = "tenant") String tenant,@RequestParam(value = "data") String data) {
        log.info("tenant:" + tenant + " data:" + data);

        Long id = RandomUtil.nextLong(1,1000000000);
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setId(id);
        orderInfo.setTenant("haerb");
        orderInfo.setOrderNumber("111");
        orderInfo.setGoodsNumber("11");
        orderInfo.setManualNumber("1110");
        orderInfo.setSerialNumber("11111");
        orderInfo.setPlaceOfLoading("11");
        orderInfo.setSendCompany("11");
        orderInfo.setReceiveCompany("11");
        orderInfo.setUnloadPlace("11");
        orderInfo.setTotalNumber(100);
        orderInfo.setOrderCreateTime(new Date());
        orderInfo.setCreateTime(new Date());
        orderInfoService.save(orderInfo);
        return new ResponseEntity(ResultModel.ok(), HttpStatus.OK);
    }
}

