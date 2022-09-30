package com.tradecenter.facade.rocketmq.producer;

import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;
import org.apache.rocketmq.remoting.exception.RemotingException;

import java.io.UnsupportedEncodingException;

/**
 * 单向模式
 * 一般用来对可靠性有一定要求的消息发送，例如日志系统
 * 不同于同步的唯一之处在于: 调用的是sendOneway方法，且方法不返回任何值，即调用者不需要关心成功或失败
 */
public class OnewayProducer {
    public static final String NAME_SERVER_ADDR = "127.0.0.1:9876";

    public static void main(String[] args) throws MQClientException, UnsupportedEncodingException, InterruptedException, RemotingException {
        //1.创建生产者对象，并指定组名
        DefaultMQProducer producer = new DefaultMQProducer("GROUP_TEST");

        //2.设置NameServer的地址，如果设置了环境变量NAMESRV_ADDR，可以省略此步
        producer.setNamesrvAddr(NAME_SERVER_ADDR);

        //3.启动生产者
        producer.start();

        //4.发送消息
        for (int i = 0; i < 10; i++) {
            Message msg = new Message("TopicTest","TagC","ID110", ("Hello MQ:" + i ).getBytes(RemotingHelper.DEFAULT_CHARSET));
            producer.sendOneway(msg);
        }
        System.out.println("消息已发送");

        //5.关闭生产者
        producer.shutdown();
    }
}
