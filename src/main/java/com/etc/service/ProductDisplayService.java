package com.etc.service;/*
 * 文件名：com.etc.service
 * 描述：
 * 作者：蒋丽娟
 * 时间：2019/5/23 16:07
 */

import com.etc.entity.ProductDisplay;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductDisplayService {

    List<ProductDisplay> listProductDisplayById(Integer twolevelid);
    Integer getTotal(Integer twolevelid);
}
