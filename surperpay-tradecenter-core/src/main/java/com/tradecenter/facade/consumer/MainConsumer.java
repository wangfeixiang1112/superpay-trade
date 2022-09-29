package com.tradecenter.facade.consumer;

import com.tradecenter.facade.consumer.service.PayGatewayBiz;
import com.tradecenter.facade.dto.PayRequestDto;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainConsumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext("spring-dubbo-consumer.xml");
        springContext.start();
        PayGatewayBiz payGatewayBiz =  springContext.getBean("payGatewayBiz",PayGatewayBiz.class);
        PayRequestDto payRequestDto = new PayRequestDto();
        payGatewayBiz.payRequest(payRequestDto);
    }
}
