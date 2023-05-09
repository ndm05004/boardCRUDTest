<%@page import="org.apache.log4j.pattern.IntegerPatternConverter"%>
<%@page import="kr.or.ddit.vo.BoardVO"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<% MemberVO mem = (MemberVO)session.getAttribute("loginVo"); %>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>로그인성공</h2>
<h1><%=mem.getMem_id() %></h1>

<table border='1'>
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>작성자</th>
		<th>작성일</th>
		<th>조회수</th>
	</tr>
	
	<%
		List<BoardVO> boardList = (List<BoardVO>)request.getAttribute("boardList");
	
		if(boardList.size() > 0){
			for(BoardVO vo : boardList){
				%>	
						<tr>
							<td><%=vo.getBo_no() %></td>
							<td><a href="<%=request.getContextPath()%>/selectBoard.do?bo_no=<%=vo.getBo_no() %>"> <%=vo.getBo_title()%> </a></td>
							<td><%=vo.getBo_writer() %></td>
							<td><%=vo.getBo_regdate() %></td>
							<td><%=vo.getBo_hit()%></td>
						</tr>
				<%
			}
		}else{
			%>
				<tr><td colspan='5'>조회하실 게시글이 존재하지 않습니다.</td></tr>
			<%
		}
	%>

	
	
</table>
<input type="button" value="등록" onclick="location.href='<%=request.getContextPath()%>/boardinsert.do'">	

</body>
</html>