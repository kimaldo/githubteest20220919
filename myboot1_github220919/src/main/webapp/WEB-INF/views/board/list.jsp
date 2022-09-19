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
<h1>${param.page }  페이지 게시물 리스트 출력 </h1>
<table border=4>
	<tr><th>번호</th><th>제목</th><th>작성자</th></tr>
	<c:forEach items="${boardlist }" var="board">
		<tr><td>${board.seq }</td>
		<td><a href="boarddetail?seq=${board.seq }">${board.title }</a></td>
		<td>${board.writer }</td></tr>
	</c:forEach>
</table>

<% 
int totalcount = (Integer)request.getAttribute("totalcount"); 
int totalpage = 0;
if(totalcount % 3 == 0){
	totalpage = totalcount / 3;
}
else{
	totalpage = totalcount / 3 + 1;
}
for(int i = 1; i <=totalpage ; i++){
%>
<a href="boardlist?page=<%=i%>"> <%=i %>페이지 </a>
<%} %>
</body>
</html>





