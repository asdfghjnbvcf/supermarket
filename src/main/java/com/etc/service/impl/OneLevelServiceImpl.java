package com.etc.service.impl;/*
 * 文件名：com.etc.service.impl
 * 描述：
 * 作者：蒋丽娟
 * 时间：2019/5/23 10:25
 */

import com.etc.dao.OneLevelDao;
import com.etc.entity.OneLevel;
import com.etc.service.OneLevelService;
import org.springframework.beans.factory.annotation.Autowired;
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
}
