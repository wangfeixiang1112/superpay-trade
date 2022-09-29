package com.tradecenter.facade.consumer.service.impl;

import com.tradecenter.facade.consumer.service.PayGatewayBiz;
import com.tradecenter.facade.dto.PayRequestDto;
import com.tradecenter.facade.dto.PayResponseDto;
import com.tradecenter.facade.service.PayTradeFacade;
import org.springframework.beans.factory.annotation.Autowired;

public class PayGatewayBizImpl implements PayGatewayBiz {
    @Autowired
    private PayTradeFacade payTradeFacade;
    @Override
    public void payRequest(PayRequestDto payRequestDto) {
        PayResponseDto payResponseDto = payTradeFacade.payRequest(payRequestDto);
        System.out.println("打印Dubbo返回响应编码:"+payResponseDto.getReturnCode());
    }
}
