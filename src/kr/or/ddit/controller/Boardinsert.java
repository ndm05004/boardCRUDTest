package kr.or.ddit.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.service.BaordServiceImpl;
import kr.or.ddit.service.IBoardService;
import kr.or.ddit.service.ImemberService;
import kr.or.ddit.service.memberServiceImpl;
import kr.or.ddit.vo.BoardVO;
import kr.or.ddit.vo.MemberVO;


@WebServlet("/boardinsert.do")
public class Boardinsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/board/boardInsert.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String writer = request.getParameter("id");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		BoardVO BaordVo = new BoardVO();
		BaordVo.setBo_writer(writer);
		BaordVo.setBo_title(title);
		BaordVo.setBo_content(content);
				
		IBoardService service = BaordServiceImpl.getInstance();
		
		int check = service.boardInsert(BaordVo);
		
		response.sendRedirect("/boardList.do");		
		
	}

}
