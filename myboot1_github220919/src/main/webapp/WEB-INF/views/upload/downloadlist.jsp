<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="resources/js/jquery-3.6.0.min.js" ></script>
<script>
$(document).ready(function(){

});
</script>
</head>
<body>
<h1> 다운로드 목록을 보여드립니다. </h1>
<c:forEach items="${filearray }" var="onefile">
 <h3>  <a href="filedownloadresult?filename=${onefile }">${onefile } 파일 다운로드 </a></h3>
</c:forEach>

</body>
</html>










