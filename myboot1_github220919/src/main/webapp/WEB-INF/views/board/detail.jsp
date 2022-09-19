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
	$("#deletebtn").on('click' , function(){
		let inputpw = prompt("암호 입력하세요");
		let dbpw = ${detail.pw } ;
		if(inputpw == dbpw){
			location.href="boarddelete?seq=${detail.seq }";
		}
		else{
			alert("암호를 확인하세요");
		}
	});//on end
	$("#updatebtn").on('click' , function(){
		let inputpw = prompt("암호 입력하세요");
		let dbpw = ${detail.pw } ;
		if(inputpw == dbpw){
			location.href="boardupdate?seq=${detail.seq }";
		}
		else{
			alert("암호를 확인하세요");
		}
	});//on end	
});//ready end
</script>
</head>
<body>

<h1> 선택한 게시물 정보는 다음과 같습니다. </h1>
<table border=3>
<tr><td>번호</td><td>${detail.seq }</td></tr> 
<tr><td>제목</td><td>${detail.title }</td></tr> 
<tr><td>내용</td><td>${detail.contents }</td></tr> 
<tr><td>작성자</td><td>${detail.writer }</td></tr> 
<tr><td>조회수</td><td>${detail.viewcount }</td></tr> 
<tr><td>작성시간</td><td>${detail.writingtime }</td></tr> 
<tr><td colspan=2 >
<input type=button id="updatebtn" value="수정버튼" >
<input type=button id= "deletebtn" value="삭제버튼" >
</td></tr> 
</table>
</body>
</html>



