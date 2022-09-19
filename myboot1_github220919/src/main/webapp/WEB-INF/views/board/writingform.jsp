<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="js/jquery-3.6.0.min.js" ></script>
<script>
$(document).ready(function(){

});
</script>
</head>
<body>
<h1> 글쓰기 폼 </h1>
<form action="boardwrite" method=post>
제목:<input type=text name="title" ><br>
내용:<textarea rows=10 cols=100 name="contents" >여기에 내용을 입력합니다 </textarea><br>
작성자:<input type=text name="writer" value="${sessionid }" readonly ><br>
글암호:<input type=text name="pw" ><br>
<input type=submit value="글쓰기">
</form>
</body>
</html>







