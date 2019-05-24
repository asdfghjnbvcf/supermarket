package com.etc.rabbitmq;

import com.etc.redis.RedisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 文件名:com.etc.rabbitmq.MQSender
 * 描述：消息队列发送者
 * 作者:吴仕泉
 * 时间:2019/5/24 0:45
 */
@Service
public class MQSender {

    //消息发送与接收者的操作模板
    @Autowired
    AmqpTemplate amqpTemplate ;

    //发送秒杀信息
    public void sendFlashMessage(FlashMessage mm) {
        //将秒杀信息转化为（Jsong格式）String
        String msg = RedisService.beanToString(mm);

        amqpTemplate.convertAndSend(MQExchang.Flash_QUEUE, msg);
    }
}
