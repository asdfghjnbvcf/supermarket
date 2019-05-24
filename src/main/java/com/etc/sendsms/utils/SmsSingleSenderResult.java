package com.etc.sendsms.utils;
/*
 * 文件名：com.etc.sendsms.utils.SmsSingleSenderResult
 * 描述：发送短信接口请求的返回值
 * 作者：黄志鹏
 * 时间：2019-5-24 08:56:55
 */

public class SmsSingleSenderResult {
/*
{
    "result": 0,
    "errmsg": "OK", 
    "ext": "", 
    "sid": "xxxxxxx", 
    "fee": 1
}
 */
	public int result;
	public String errMsg = "";
	public String ext = "";
	public String sid = "";
	public int fee;
	
	public String toString() {
		return String.format(
				"SmsSingleSenderResult\nresult %d\nerrMsg %s\next %s\nsid %s\nfee %d",
				result, errMsg, ext, sid, fee);		
	}
}
