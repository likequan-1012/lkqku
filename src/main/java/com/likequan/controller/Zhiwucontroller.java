/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: ZhiwuController.java 
 * @Prject: likequan-week1
 * @Package: com.likequan.week1.controller 
 * @Description: TODO
 * @author: 李科泉   
 * @date: 2019年8月6日 上午9:00:44 
 * @version: V1.0   
 */
package com.likequan.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.likequan.domain.Zhiwu;
import com.likequan.service.Zhiwuservice;


/** 
 * @ClassName: ZhiwuController 
 * @Description: TODO
 * @author: 李科泉
 * @date: 2019年8月6日 上午9:00:44  
 */
@Controller
public class Zhiwucontroller {

	@Resource
	private Zhiwuservice service;
	//列表展示
	@RequestMapping("list")
	public List<Zhiwu> selects(HttpServletRequest request,
			@RequestParam(defaultValue = "1")int pageNum,Zhiwu z){
		int pageSize=3;
		int startPage = (pageNum-1)*pageSize;
		int count = service.count(z);
		int total = (count/pageSize)+(count%pageSize==0?0:1);
		List<Zhiwu> list = service.selects(startPage, pageSize,z);
		request.setAttribute("list", list);
		request.setAttribute("pageNum", pageNum);
		request.setAttribute("count", count);
		request.setAttribute("total", total);
		request.setAttribute("z", z);
		return list;
		
	}
	//展示详情
	@RequestMapping("toshow")
	public String toshow(int id,HttpServletRequest request) {
		Zhiwu zhiwu = service.selectById(id);
		request.setAttribute("zhiwu", zhiwu);
		return "show";		
	}
	
	//去添加
	@RequestMapping("toadd")
	public String toadd(HttpServletRequest request) {
		List<Zhiwu> tlist = service.selectType();
		request.setAttribute("tlist", tlist);
		return "add";		
	}
	//添加
	@RequestMapping("add")
	@ResponseBody
	public boolean add(Zhiwu z) {
		
		
		return service.insert(z)>0;
		
	}
	
	//去修改
	@RequestMapping("toupdate")
	public String toupdate(HttpServletRequest request,int id) {
		
		
		Zhiwu zhiwu = service.selectById(id);
		request.setAttribute("z", zhiwu);
		
		return "update";		
	}
	
	
	@RequestMapping("selectType")
	@ResponseBody
	public List<Zhiwu> selectType(){
		List<Zhiwu> list = service.selectType();
		
		return list;
		
	}
	
	
	
	
	
	//修改
	@RequestMapping("update")
	@ResponseBody
	public boolean update(Zhiwu z) {
		
		
		return service.update(z);
		
	}
	//单删/批删
	@RequestMapping("del")
	@ResponseBody
	public void del(String id) {
		service.dels(id);
		
	}
	
	
	
	
}
