<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String flag = request.getParameter("flag");
%>
<c:set value="<%=flag%>" var="flag"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>로그인</h2>
<form id="loginForm" name="login" action="<%=request.getContextPath()%>/login.do" method="post">
아이디: <input type="text" id="id" name="id"><br>
비밀번호: <input type="text" id="pw" name="pw"><br>
<input type="button" value="로그인" id="loginBtn">
<input type="button" value="회원가입" id="sighUpBtn" onclick="location.href='<%=request.getContextPath()%>/memSignUp.do'">
</form>

</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script>



$(function(){
	
	if("${flag}" == "1"){
		alert("등록되지 않은 회원입니다.");
	}
	
	if("${flag}" == "2"){
		alert("회원가입 성공입니다.");
	}
	
	loginBtn = $("#loginBtn");
	sighUpBtn =$("#sighUpBtn");
	
	loginBtn.on("click", function(){
		
		var id = $("#id").val();
		var pw = $("#pw").val();
		
		if(id==""){
			alert("아이디가 누락되었습니다!");
			return false;
		}
		
		if(pw==""){
			alert("비밀번호가 누락되었습니다!");
			return false;
		}
		loginForm.submit();
	})
	
	
})

</script>
</html>