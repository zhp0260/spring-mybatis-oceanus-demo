package com.oceanus.demo.model;

import com.bj58.oceanus.client.orm.annotation.Column;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by lilianqiang on 2015-12-09.
 */
public class OrderInfo implements Serializable {
    @Column(name="id")
    private long id;

    @Column(name="tenant")
    private String tenant;//租户ID

    @Column(name="order_number")
    private String orderNumber;//票号

    @Column(name="goods_number")
    private String goodsNumber;//货号

    @Column(name="manual_number")
    private String manualNumber;//手工单号

    @Column(name="serial_number")
    private String serialNumber;//流水号

    @Column(name="place_loading")
    private String placeOfLoading;//开票地点

    @Column(name="send_company")
    private String sendCompany;//发货公司

    @Column(name="receive_company")
    private String receiveCompany;//到货公司

    @Column(name="unload_place")
    private String unloadPlace;//卸货地点

    @Column(name="total_number")
    private Integer totalNumber;//件数合计

    @Column(name="order_create_time")
    private Date orderCreateTime;//开票时间

    @Column(name="create_time")
    private Date createTime;//上传时间

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public String getManualNumber() {
        return manualNumber;
    }

    public void setManualNumber(String manualNumber) {
        this.manualNumber = manualNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getPlaceOfLoading() {
        return placeOfLoading;
    }

    public void setPlaceOfLoading(String placeOfLoading) {
        this.placeOfLoading = placeOfLoading;
    }

    public String getSendCompany() {
        return sendCompany;
    }

    public void setSendCompany(String sendCompany) {
        this.sendCompany = sendCompany;
    }

    public String getReceiveCompany() {
        return receiveCompany;
    }

    public void setReceiveCompany(String receiveCompany) {
        this.receiveCompany = receiveCompany;
    }

    public String getUnloadPlace() {
        return unloadPlace;
    }

    public void setUnloadPlace(String unloadPlace) {
        this.unloadPlace = unloadPlace;
    }

    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
