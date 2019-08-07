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
package com.likequan.service;

import java.util.List;

import com.likequan.domain.Zhiwu;



/** 
 * @ClassName: ZhiwuMapper 
 * @Description: TODO
 * @author: 李科泉
 * @date: 2019年8月6日 上午8:55:44  
 */

public interface Zhiwuservice {


	/**
	 * 
	 * @Title: selects 
	 * @Description: 列表展示
	 * @return
	 * @return: List<Zhiwu>
	 */
	List<Zhiwu> selects(int startPage,int pageSize,Zhiwu z);
	
	int count(Zhiwu z);
	
	Zhiwu  selectById(int id);
	
	List<Zhiwu >selectType();
	
	int insert(Zhiwu z);
	
	boolean update(Zhiwu z);
	
	void dels(String id);
}
