package com.tradecenter.facade.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
//96
public class PayRequestDto implements Serializable {

    //商户订单号
    private Long merchantOrderNo;
    //用户电话
    private String phone;
    //用户姓名
    private String userName;
    //支付金额
    private BigDecimal payAmount;
    //商户号
    private String merchantNo;
    //商户请求时间
    private Date merchantReqTime;
    //订单币种
    private String orderCurrency;

    public Long getMerchantOrderNo() {
        return merchantOrderNo;
    }

    public void setMerchantOrderNo(Long merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public Date getMerchantReqTime() {
        return merchantReqTime;
    }

    public void setMerchantReqTime(Date merchantReqTime) {
        this.merchantReqTime = merchantReqTime;
    }

    public String getOrderCurrency() {
        return orderCurrency;
    }

    public void setOrderCurrency(String orderCurrency) {
        this.orderCurrency = orderCurrency;
    }
}
