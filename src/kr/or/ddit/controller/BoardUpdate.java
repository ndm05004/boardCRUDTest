package kr.or.ddit.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.service.BaordServiceImpl;
import kr.or.ddit.service.IBoardService;
import kr.or.ddit.vo.BoardVO;

/**
 * Servlet implementation class BoardUpdate
 */
@WebServlet("/boardUpdate.do")
public class BoardUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bo_no = request.getParameter("bo_no");
		
		IBoardService service = BaordServiceImpl.getInstance();
		
		BoardVO vo = service.selectBoard(bo_no);
		request.setAttribute("vo", vo);
		request.getRequestDispatcher("/WEB-INF/views/board/updateBoard.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		int bo_no = Integer.parseInt(request.getParameter("id"));
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		BoardVO BaordVo = new BoardVO();
		BaordVo.setBo_no(bo_no);
		BaordVo.setBo_title(title);
		BaordVo.setBo_content(content);
				
		IBoardService service = BaordServiceImpl.getInstance();
		service.updateBoard(BaordVo);
		
		response.sendRedirect("/boardList.do");
	}

}
