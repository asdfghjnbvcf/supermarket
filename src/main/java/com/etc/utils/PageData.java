package com.etc.utils;

import java.util.List;

/**
 * 分页数据类
 */
public class PageData<T> {
	private List<T> data; // 查找[页面上显示]的数据

	private Integer count; // 总记录数

	private Integer limit;// 每页几行

	private Integer page;// 页数
	private Integer code;//根据layUI文档的来命名/返回操作是否成功
	private String msg;//根据layUI文档的来命名/返回操作是否成功

	public PageData() {
		super();
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * 
	 * @param data
	 * @param count
	 * @param limit
	 * @param page
	 */
	public PageData(List<T> data, Integer count, Integer limit, Integer page) {
		super();
		this.data = data;
		this.count = count;
		this.limit = limit;
		this.page = page;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getlimit() {
		return limit;
	}

	public void setlimit(Integer limit) {
		this.limit = limit;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	/**
	 * 总页数
	 * 
	 * @return
	 */
	public int getcountPage() {
		// count是总记录数 100/10 101/10
		int num = count / limit;
		if (count % limit != 0) {
			num++;
		}
		return num;
	}

	@Override
	public String toString() {
		return "{count:" + count + ",data:" + data + "}";
	}
}
