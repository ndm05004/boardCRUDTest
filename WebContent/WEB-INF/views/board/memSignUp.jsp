<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>

</head>
<body>
<h2>회원가입</h2>
<form id="signUpForm" name="signUp" action="<%=request.getContextPath()%>/memSignUp.do" method="post">
아이디: <input type="text" id="id" name="id"><br>
비밀번호: <input type="text" id="pw" name="pw"><br>
이름: <input type="text" id="name" name="name"><br>
<input type="button" value="등록" id="registrationBtn">
<input type="button" value="뒤로" id="back" onclick="location.href='<%=request.getContextPath()%>/boardStart.do'">
</form>s

</body>

<script type="text/javascript">

$(function(){

	registrationBtn = $("#registrationBtn");

	
	registrationBtn.on("click", function(){
		var id = $("#id").val();
		var pw = $("#pw").val();
		var name = $("#name").val();
		
		if(id==""){
			alert("아이디가 누락되었습니다!");
			return false;
		}
		
		if(pw==""){
			alert("비밀번호가 누락되었습니다!");
			return false;
		}
		
		if(name==""){
			alert("이름이 누락되었습니다!");
			return false;
		}
		signUpForm.submit();
		
	})
})


</script>



</html>