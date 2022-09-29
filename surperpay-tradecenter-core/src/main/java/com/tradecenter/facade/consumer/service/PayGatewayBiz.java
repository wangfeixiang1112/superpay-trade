package com.tradecenter.facade.consumer.service;

import com.tradecenter.facade.dto.PayRequestDto;

public interface PayGatewayBiz {

    public void payRequest(PayRequestDto payRequestDto);
}
