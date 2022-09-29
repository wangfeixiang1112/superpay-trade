package com.tradecenter.facade.service.impl;

import com.tradecenter.facade.dto.PayRequestDto;
import com.tradecenter.facade.dto.PayResponseDto;
import com.tradecenter.facade.service.PayTradeFacade;

//@DubboService
public class PayTradeFacadeImpl implements PayTradeFacade {
    @Override
    public PayResponseDto payRequest(PayRequestDto payRequestDto) {
        PayResponseDto payResponseDto = new PayResponseDto();
        payResponseDto.setReturnCode("200");
        return payResponseDto;
    }
}
