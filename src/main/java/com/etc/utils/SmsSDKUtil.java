package com.etc.utils;

import com.etc.sendsms.utils.SmsSingleSender;
import com.etc.sendsms.utils.SmsSingleSenderResult;

public class SmsSDKUtil {
		/**
		 * 发送短信的方法
		 * @param phoneNumber 要发送的手机号
		 * @return 短信发送是否成功
		 */
	public static boolean SendSms(String phoneNumber,String code) {
		try {
    		//请根据实际 accesskey 和 secretkey 进行开发，以下只作为演示 sdk 使用
    		String accesskey = "5cdf7d7b87b65f098a29e226";
    		String secretkey ="b93aab2be3164838a787bdd84f8175bd";
    		 //初始化单发
	    	SmsSingleSender singleSender = new SmsSingleSender(accesskey, secretkey);
	    	SmsSingleSenderResult singleSenderResult;
	    	 //普通单发,注意前面必须为【】符号包含，置于头或者尾部。
	    singleSenderResult = singleSender.send(0, "86", phoneNumber,
                "【小馋猫零食铺】您的验证码是"+code+"。在3分钟内有效。如非本人操作，请忽略本短信。", "", "");
	    	System.out.println(singleSenderResult);
    	} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
}
