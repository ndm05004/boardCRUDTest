<%@page import="kr.or.ddit.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<% MemberVO mem = (MemberVO)session.getAttribute("loginVo"); %>
</head>
<body>
<%=mem.getMem_id() %>

<form id="boardInsert" name="login" action="<%=request.getContextPath()%>/boardInsert.do" method="post">
제목: <input type="text" id="title" name="title"><br>
내용: <input type="text" id="content" name="content"><br>
<input type="submit" value="등록" id="insertBtn">
<input type="button" value="목록" onclick="location.href='<%=request.getContextPath()%>/boardList.do'">	
</form>

</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>

</html>