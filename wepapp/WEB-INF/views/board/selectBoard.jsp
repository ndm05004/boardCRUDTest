<%@page import="kr.or.ddit.vo.BoardVO"%>
<%@page import="kr.or.ddit.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>

<%
BoardVO board = (BoardVO)request.getAttribute("select");
%>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>게시판 상세정보</h2>

	<table border='1'>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>내용</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
		<tr>
			<td><%=board.getBo_no() %></td>
			<td><%=board.getBo_title()%></td>
			<td><%=board.getBo_content()%></td>
			<td><%=board.getBo_writer() %></td>
			<td><%=board.getBo_regdate() %></td>
			<td><%=board.getBo_hit() %></td>
		</tr>
	</table>

<% 
MemberVO mem = (MemberVO)session.getAttribute("loginVo");

if(mem.getMem_id().equals(board.getBo_writer())){
	
%>

	<input type="button" value="수정" onclick="location.href='<%=request.getContextPath()%>/boardUpdate.do?bo_no=<%=board.getBo_no()%>'">
	<input type="button" value="삭제" onclick="location.href='<%=request.getContextPath()%>/boardDelete.do?bo_no=<%=board.getBo_no()%>'">
	<input type="button" value="목록" onclick="location.href='<%=request.getContextPath()%>/boardList.do'">		
<%
}else{
%> 
<input type="button" value="목록" onclick="location.href='<%=request.getContextPath()%>/boardList.do'">	
<%
}
%>
</body>



</html>