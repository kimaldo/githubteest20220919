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
<h1> 글수정 폼</h1>
<form action="boardupdate" method=post>
번호:<input type=text name="seq" value=${updateform.seq } readonly >
제목:<input type=text name="title" value="${updateform.title }" ><br>
내용:<textarea rows=10 cols=100 name="contents">${updateform.contents }</textarea><br>
작성자:<input type=text name="writer" value="${sessionid }" readonly ><br>
<input type=hidden name="pw" value=${updateform.pw } ><br>
조회수 :<input type=text name="viewcount" value="${updateform.viewcount }" readonly ><br>
<input type=submit value="수정">
</form>
</body>
</html>


