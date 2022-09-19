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
<h3>
 ${dto.name} 작성자가 
 ${dto.file1.originalFilename} 파일과
 ${dto.file2.originalFilename} 파일을
 전송하였습니다. <br>
 ${dto.description} 의 설명을 포함합니다.
</h3>
<h3> 서버에 저장된 파일명은 ${dto.filename1}, ${dto.filename2}입니다. </h3>
</body>
</html>