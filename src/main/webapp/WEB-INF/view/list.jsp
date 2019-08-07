<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resource/css/list.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/resource/js/jquery-3.2.1.js"></script>
<script type="text/javascript">
$(function() {
	$("#qx").click(function() {
		$(".cb").prop("checked",this.checked);
	})
})
function del(id) {
	$.ajax({
		type:"post",
		data:{id:id},
		url:"${pageContext.request.contextPath}/del",
		success:function(obj){
			confirm("确认删除么？");
			location.reload();
		}
	})
}


function dels() {
	var ids="";
	$(".cb:checked").each(function() {
		ids+=","+$(this).val();
	})
	ids=ids.substring(1);
	del(ids);
}
</script>
</head>
<body>
<form action="list" method="post">
植物名称：<input type="text" name="name" value="${z.name}">
<input type="submit" value="搜索">
</form>
<table>
	<tr>
		<td>
		<input type="checkbox"  id="qx">全选
		</td>
		<td>序号</td>
		<td>植物名称 </td>
		<td>描述</td>
		<td>类别</td>
		<td>操作</td>
	</tr>
	<c:forEach items="${list}" var="l" varStatus="i">
	<tr>
		<td><input type="checkbox"   class="cb" value="${l.id}"></td>
		<td>${i.index+1 }</td>
		<td>${l.name}</td>
		<td>${l.miao}</td>
		<td>${l.tname}</td>
		<td>
		<a href="toshow?id=${l.id}"><input type="button" value="查看"></a>
		<a href="toupdate?id=${l.id}"><input type="button" value="编辑"></a>
		<input type="button" value="删除" onclick="del(${l.id})">
		</td>
	</tr>
	</c:forEach>
	<tr>
	<td colspan="10">
	当前是${pageNum}/${total}页
	<a href="list?pageNum=1&name=${z.name}">首页</a>
	<c:if test="${pageNum<=1}">
	上一页
	</c:if>
	<c:if test="${pageNum>1}">
	<a href="list?pageNum=${pageNum-1}&name=${z.name}">上一页</a>
	</c:if>
	<c:if test="${pageNum>=total}">
	下一页
	</c:if>
	<c:if test="${pageNum<total}">
	<a href="list?pageNum=${pageNum+1}&name=${z.name}">下一页</a>
	</c:if>
	
	<a href="list?pageNum=${total}&name=${z.name}">尾页</a>
	共${count}条数据
	<input type="button" value="批量删除"   onclick="dels()">
	<a href="toadd">添加</a>
	
	</td>
	</tr>
</table>
</body>
</html>