package com.etc.service.impl;/*
 * 文件名：com.etc.service.impl
 * 描述：
 * 作者：蒋丽娟
 * 时间：2019/5/23 10:25
 */

import com.etc.dao.OneLevelDao;
import com.etc.entity.OneLevel;
import com.etc.service.OneLevelService;
import com.etc.utils.PageData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * 一级分类下的service的实现类
 */
@Service
public class OneLevelServiceImpl implements OneLevelService {
    @Autowired
    private OneLevelDao oneLavelDao;
    /**
     * 得到所有的一级分类
     * @return 返回一级分类的集合
     */
    @Override
    public List<OneLevel> listOneLevel () {

        return oneLavelDao.listOneLevel();
    }

    /**
     *
     * @param page 第几页
     * @param pageSize 一页显示多少条
     * @param content 模糊查询的内容
     * @return 返回分页对象
     */
    @Override
    public PageData<OneLevel> listOneLevelByPage ( Integer page, Integer pageSize, String content ) {
        int start=(page-1)*pageSize;
        List<OneLevel> data=oneLavelDao.listOneLevelByPage(start,pageSize,content);
        int count=oneLavelDao.getTotal(content);
        PageData<OneLevel> pd=new PageData<>(data, count, pageSize, page);
        return pd;
    }

    @Override
    public boolean updateByPrimaryKey ( OneLevel oneLevel ) {
        return oneLavelDao.updateByPrimaryKey(oneLevel)>0;
    }


}
