package com.tradecenter.facade.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MainProvider {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext("spring-dubbo-provider.xml");
        springContext.start();//启动容器

        System.out.println("dubbo service started");
        //为了不让进程结束，用read阻塞进程，这样spring容器就一直处于生效状态
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
