<%@page import="kr.or.ddit.vo.BoardVO"%>
<%@page import="kr.or.ddit.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<% 
MemberVO mem = (MemberVO)session.getAttribute("loginVo"); 
BoardVO vo = (BoardVO)request.getAttribute("vo");
%>

</head>
<body>
<h2>수정폼</h2>
<form id="boardUpdate" name="login" action="/boardUpdate.do?id=<%=vo.getBo_no()%>" method="post">
제목: <input type="text" name="title" value=<%=vo.getBo_title() %>><br>
내용: <input type="text" name="content" value=<%=vo.getBo_content() %>><br>
<input type="submit" value="수정" id="insertBtn">
<input type="button" value="목록" onclick="location.href='<%=request.getContextPath()%>/boardList.do'">	
</form>

</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>

</html>