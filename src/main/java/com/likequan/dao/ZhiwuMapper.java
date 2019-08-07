/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: ZhiwuMapper.java 
 * @Prject: likequan-week1
 * @Package: com.likequan.week1.dao 
 * @Description: TODO
 * @author: 李科泉   
 * @date: 2019年8月6日 上午8:55:44 
 * @version: V1.0   
 */
package com.likequan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.likequan.domain.Zhiwu;


/** 
 * @ClassName: ZhiwuMapper 
 * @Description: TODO
 * @author: 李科泉
 * @date: 2019年8月6日 上午8:55:44  
 */
public interface ZhiwuMapper {

	/**
	 * 
	 * @Title: selects 
	 * @Description: 列表展示
	 * @return
	 * @return: List<Zhiwu>
	 */
	List<Zhiwu> selects(@Param("startPage")int startPage,@Param("pageSize")int pageSize,@Param("z")Zhiwu z);
	/**
	 * 
	 * @Title: count 
	 * @Description: 查询总记录数
	 * @param z
	 * @return
	 * @return: int
	 */
	int count(@Param("z")Zhiwu z);
	/**
	 * 
	 * @Title: selectById 
	 * @Description: 通过id单查
	 * @param id
	 * @return
	 * @return: Zhiwu
	 */
	Zhiwu  selectById(int id);
	/**
	 * 
	 * @Title: selectType 
	 * @Description: 查询类型表
	 * @return
	 * @return: List<Zhiwu>
	 */
	List<Zhiwu >selectType();
	/**
	 * 
	 * @Title: insert 
	 * @Description: 添加
	 * @param z
	 * @return
	 * @return: int
	 */
	int insert(Zhiwu z);
	/**
	 * 
	 * @Title: update 
	 * @Description: 修改
	 * @param z
	 * @return
	 * @return: int
	 */
	int update(Zhiwu z);
	/**
	 * 
	 * @Title: dels 
	 * @Description: 批量删除
	 * @param id
	 * @return: void
	 */
	void dels(String id);
	
}
