package com.etc.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 文件名:com.etc.rabbitmq
 * 描述：MQ交换机
 * 作者:吴仕泉
 * 时间:2019/5/24 0:40
 */
@Configuration
public class MQExchang {
    public static final String Flash_QUEUE = "flash.queue";


     //Direct模式 交换机Exchange

    @Bean
    public Queue queue() {
        return new Queue(Flash_QUEUE, true);
    }

}
