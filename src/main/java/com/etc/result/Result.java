package com.etc.result;

/**
 * 文件名:com.etc.result.Result
 * 描述：请求结果的返回信息
 * 作者:吴仕泉
 * 时间:2019/5/24 1:14
 */
public class Result<T> {
    //参数
    private int code;

    //返回信息
    private String msg;

    //数据
    private T data;

    //成功时候调用
    public static  <T> Result<T> success(T data){
        return new Result<T>(data);
    }

    //失败时候调用
    public static  <T> Result<T> error(CodeMsg codeMsg){
        return new Result<T>(codeMsg);
    }

    private Result(T data) {
        this.data = data;
    }

    private Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private Result(CodeMsg codeMsg) {
        if(codeMsg != null) {
            this.code = codeMsg.getCode();
            this.msg = codeMsg.getMsg();
        }
    }


    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
}
