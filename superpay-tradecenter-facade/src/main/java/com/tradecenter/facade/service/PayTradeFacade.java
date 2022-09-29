package com.tradecenter.facade.service;

import com.tradecenter.facade.dto.PayRequestDto;
import com.tradecenter.facade.dto.PayResponseDto;

public interface PayTradeFacade {
    /**
     * 支付请求
     * @param payRequestDto
     * @return
     */
    public PayResponseDto payRequest(PayRequestDto payRequestDto);
}
