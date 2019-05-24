package com.etc.rabbitmq;

import com.etc.entity.User;

/**
 * 文件名:com.etc.rabbitmq
 * 描述：MQ队列所需的秒杀商品的信息
 * 作者:吴仕泉
 * 时间:2019/5/24 0:33
 */
public class FlashMessage {
    //秒杀的用户
    private User user;
    //秒杀商品
    private int flashGoodsId;
    //收货地址ID
    private int userAddressId;

    public FlashMessage() {
    }

    public FlashMessage(User user, int flashGoodsId, int userAddressId) {
        this.user = user;
        this.flashGoodsId = flashGoodsId;
        this.userAddressId = userAddressId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getFlashGoodsId() {
        return flashGoodsId;
    }

    public void setFlashGoodsId(int flashGoodsId) {
        this.flashGoodsId = flashGoodsId;
    }

    public int getUserAddressId() {
        return userAddressId;
    }

    public void setUserAddressId(int userAddressId) {
        this.userAddressId = userAddressId;
    }

    @Override
    public String toString() {
        return "FlashMessage{" +
                "user=" + user +
                ", flashGoodsId=" + flashGoodsId +
                ", userAddressId=" + userAddressId +
                '}';
    }
}
