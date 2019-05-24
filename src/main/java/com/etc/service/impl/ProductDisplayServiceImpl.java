package com.etc.service.impl;/*
 * 文件名：com.etc.service.impl
 * 描述：
 * 作者：蒋丽娟
 * 时间：2019/5/23 16:08
 */

import com.etc.dao.ProductDisplayDao;
import com.etc.entity.ProductDisplay;
import com.etc.service.ProductDisplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDisplayServiceImpl implements ProductDisplayService {
    @Autowired
    private ProductDisplayDao productDisplayDao;

    /**
     *
     * @return 返回二级分类下所有的商品信息
     */
    @Override
    public List<ProductDisplay> listProductDisplayById (Integer twolevelid) {
        return productDisplayDao.listProductDisplayById(twolevelid);
}

    @Override
    public Integer getTotal ( Integer twolevelid ) {
        return productDisplayDao.getTotal(twolevelid);
    }
}
