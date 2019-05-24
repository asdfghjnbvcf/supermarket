package com.etc.utils;

import com.alibaba.druid.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 文件名:com.etc.utils.ValidatorUtil
 * 描述：校验器
 * 作者:吴仕泉
 * 时间:2019/5/24 1:22
 */
public class ValidatorUtil {

    //手机正则
    private static final Pattern telPattern = Pattern.compile("^1([38]\\d|5[0-35-9]|7[3678])\\d{8}$");

    //校验手机
    public static boolean isTel(String src) {
        if(StringUtils.isEmpty(src)) {
            return false;
        }
        Matcher m = telPattern.matcher(src);
        return m.matches();
    }



}
