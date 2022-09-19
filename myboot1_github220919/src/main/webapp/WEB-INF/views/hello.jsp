<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="js/jquery-3.6.0.min.js"></script>
<script>
$(document).ready(function() {
	$("#ajaxbtn").on('click', function(){
		$.ajax({
			url:"helloajax",
			type: 'get',
			dataType:'json',
			success:function(server){
				$("#result").html(server.response);
			}
		});
	});
});//ready end
</script>
</head>
<body>
<h1> hello.jsp입니다 </h1>
<h1> ${model} </h1>
<h1 id=result></h1>
<input type=button value="ajax 요청" id="ajaxbtn">
</body>
</html>
