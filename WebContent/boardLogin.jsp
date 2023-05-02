<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form id="loginForm" name="login" action="/login.do" method="post">
아이디: <input type="text" id="id" name="id"><br>
비밀번호: <input type="text" id="pw" name="pw"><br>
<input type="button" value="로그인" id="loginBtn"> <button>회원가입</button>
</form>

</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script>


$(function(){
	
	loginBtn = $("#loginBtn");
	loginForm2 = $('#loginForm');
	
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