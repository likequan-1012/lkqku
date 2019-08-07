/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: Zhiwu.java 
 * @Prject: likequan-week1
 * @Package: com.likequan.week1.domain 
 * @Description: TODO
 * @author: 李科泉   
 * @date: 2019年8月6日 上午8:52:34 
 * @version: V1.0   
 */
package com.likequan.domain;

/** 
 * @ClassName: Zhiwu 
 * @Description: TODO
 * @author: 李科泉
 * @date: 2019年8月6日 上午8:52:34  
 */
public class Zhiwu {

	private Integer id;
	private String name;//植物名
	private String miao;//植物描述
	private Integer tid;//类型id
	private String tname;//类型名称
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the miao
	 */
	public String getMiao() {
		return miao;
	}
	/**
	 * @param miao the miao to set
	 */
	public void setMiao(String miao) {
		this.miao = miao;
	}
	/**
	 * @return the tid
	 */
	public Integer getTid() {
		return tid;
	}
	/**
	 * @param tid the tid to set
	 */
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	/**
	 * @return the tname
	 */
	public String getTname() {
		return tname;
	}
	/**
	 * @param tname the tname to set
	 */
	public void setTname(String tname) {
		this.tname = tname;
	}
	
}
