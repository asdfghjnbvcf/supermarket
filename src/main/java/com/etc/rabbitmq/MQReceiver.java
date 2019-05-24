package com.etc.rabbitmq;

import com.etc.entity.User;
import com.etc.redis.RedisService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * 文件名:com.etc.rabbitmq
 * 描述：消息的接受者，处理秒杀业务
 * 作者:吴仕泉
 * 时间:2019/5/24 0:57
 */
@Service
public class MQReceiver {

    @RabbitListener(queues=MQExchang.Flash_QUEUE)
    public void receive(String message) {

        FlashMessage mm = RedisService.stringToBean(message, FlashMessage.class);
        User user = mm.getUser();
        int flashGoodsId = mm.getFlashGoodsId();
        int userAddressId = mm.getUserAddressId();

        //判断库存

        //判断是否已秒杀到

        //下订单减库存写入秒杀订单
    }
    }
