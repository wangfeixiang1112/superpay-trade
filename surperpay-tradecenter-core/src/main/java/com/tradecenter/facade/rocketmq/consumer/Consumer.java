package com.tradecenter.facade.rocketmq.consumer;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.message.MessageExt;
import org.apache.rocketmq.remoting.common.RemotingHelper;

import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * 普通消息消费者
 *  */
public class Consumer {
    public static final String NAME_SERVER_ADDR = "127.0.0.1:9876";

    public static void main(String[] args) throws MQClientException {
        //1.创建消费者(Push)对象
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("GROUP_TEST");

        //2.设置NameServer的地址，如果设置了环境变量NAMESRV_ADDR，可以省略此步
        consumer.setNamesrvAddr(NAME_SERVER_ADDR);

        //3订阅对应的主题和Tag
        consumer.subscribe("TopicTest","*");

        //4.注册消息接收到Broker消息后的处理接口
        consumer.registerMessageListener(new MessageListenerConcurrently() {
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list, ConsumeConcurrentlyContext consumeConcurrentlyContext) {
                try{
                    MessageExt messageExt = list.get(0);
                    System.out.printf("线程：%-25s 接收到新消息 %s --- %s %n\n",Thread.currentThread().getName(),messageExt.getTags(),new String(messageExt.getBody(), RemotingHelper.DEFAULT_CHARSET));
                }catch (UnsupportedEncodingException e){
                    e.printStackTrace();
                }
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });

        //5.启动消费者（必须在注册完消息监听器后启动，否则会报错）
        consumer.start();
        System.out.println("已启动消费者");
    }
}
