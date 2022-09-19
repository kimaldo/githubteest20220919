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
	
});//ready end
</script>
</head>
<body>
<h1> 이름 입력하면 업로드한 이미지 파일을 출력합니다. </h1>
<form action= "outputimage">
이름: <input type=text name="name">
<input type=submit value="이미지 주세요">
</form>
</body>
</html>
