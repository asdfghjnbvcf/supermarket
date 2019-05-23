package com.etc.service.impl;/*
 * 文件名：com.etc.service.impl
 * 描述：
 * 作者：蒋丽娟
 * 时间：2019/5/23 10:25
 */

import com.etc.dao.OneLevelDao;
import com.etc.dao.TwoLevelDao;
import com.etc.entity.OneLevel;
import com.etc.entity.TwoLevel;
import com.etc.service.OneLevelService;
import com.etc.service.TwoLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 一级分类下的service的实现类
 */
@Service
public class TwoLevelServiceImpl implements TwoLevelService{
    @Autowired
    private TwoLevelDao twoLevelDao;
    /**
     * 得到所有的二级分类
     * @return 返回二级分类的集合
     */
    @Override
    public List<TwoLevel> listTwoLevel () {
        return twoLevelDao.listTwoLevel();
    }


}
