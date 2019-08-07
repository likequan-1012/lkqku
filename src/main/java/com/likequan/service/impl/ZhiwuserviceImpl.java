/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: ZhiwuserviceImpl.java 
 * @Prject: likequan-week1
 * @Package: com.likequan.week1.service.impl 
 * @Description: TODO
 * @author: 李科泉   
 * @date: 2019年8月6日 上午8:59:43 
 * @version: V1.0   
 */
package com.likequan.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.likequan.dao.ZhiwuMapper;
import com.likequan.domain.Zhiwu;
import com.likequan.service.Zhiwuservice;


/** 
 * @ClassName: ZhiwuserviceImpl 
 * @Description: TODO
 * @author: 李科泉
 * @date: 2019年8月6日 上午8:59:43  
 */
@Service
public class ZhiwuserviceImpl implements Zhiwuservice {

	@Resource
	private ZhiwuMapper mapper;
	
	/* (non Javadoc) 
	 * @Title: selects
	 * @Description: 展示
	 * @return 
	 * @see com.likequan.week1.service.Zhiwuservice#selects() 
	 */
	@Override
	public List<Zhiwu> selects(int startPage,int pageSize,Zhiwu z) {
		// TODO Auto-generated method stub
		return mapper.selects(startPage, pageSize,z);
	}

	/* (non Javadoc) 
	 * @Title: count
	 * @Description: 查询总记录数
	 * @return 
	 * @see com.likequan.week.service.Zhiwuservice#count() 
	 */
	@Override
	public int count(Zhiwu z) {
		// TODO Auto-generated method stub
		return mapper.count(z);
	}

	/* (non Javadoc) 
	 * @Title: selectById
	 * @Description: 通过id单查
	 * @param id
	 * @return 
	 * @see com.likequan.week.service.Zhiwuservice#selectById(int) 
	 */
	@Override
	public Zhiwu selectById(int id) {
		// TODO Auto-generated method stub
		return mapper.selectById(id);
	}

	/* (non Javadoc) 
	 * @Title: selectType
	 * @Description: 查询类型
	 * @return 
	 * @see com.likequan.week.service.Zhiwuservice#selectType() 
	 */
	@Override
	public List<Zhiwu> selectType() {
		// TODO Auto-generated method stub
		return mapper.selectType();
	}

	/* (non Javadoc) 
	 * @Title: insert
	 * @Description: 添加
	 * @param z
	 * @return 
	 * @see com.likequan.week.service.Zhiwuservice#insert(com.likequan.week.domain.Zhiwu) 
	 */
	@Override
	public int insert(Zhiwu z) {
		// TODO Auto-generated method stub
		return mapper.insert(z);
	}

	/* (non Javadoc) 
	 * @Title: update
	 * @Description:修改
	 * @param z
	 * @return 
	 * @see com.likequan.week.service.Zhiwuservice#update(com.likequan.week.domain.Zhiwu) 
	 */
	@Override
	public boolean update(Zhiwu z) {
		try {
			mapper.update(z);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	/* (non Javadoc) 
	 * @Title: dels
	 * @Description: 删除
	 * @param id 
	 * @see com.likequan.week.service.Zhiwuservice#dels(java.lang.String) 
	 */
	@Override
	public void dels(String id) {
		mapper.dels(id);
		
	}

}
