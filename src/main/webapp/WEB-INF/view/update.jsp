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
	$.ajax({
		type:"post",
		url:"${pageContext.request.contextPath}/selectType",
		success:function(list){
			for(var i in list){
				$("#ztype").append("<option value="+list[i].tid+">"+list[i].tname+"</option>");
			}
			var id='${z.tid}';
			$("select").find("option[value='"+id+"']").prop("selected",true);
		}
	})
})
function update() {
	$.ajax({
		type:"post",
		data:$("form").serialize(),
		url:"${pageContext.request.contextPath}/update",
		success:function(obj){
			if (obj) {
				alert("修改成功");
				location.href="${pageContext.request.contextPath}/list";
			}else{
				alert("修改失败");
				location.reload();
			}
		}
	})
}


</script>
</head>
<body>
<form action="">
<input type="hidden" name="id" value="${z.id}">
植物名称：<input type="text" name="name" value="${z.name}"><br>
植物描述：<input type="text" name="miao" value="${z.miao}"><br>
植物类型：<select name="tid" id="ztype">
<option value="0">---请选择---</option>
</select>
<input type="button" value="修改"  onclick="update()">
</form>
</body>
</html>