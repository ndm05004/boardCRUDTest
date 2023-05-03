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


@WebServlet("/selectBoard.do")
public class SelectBoard extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bo_no = request.getParameter("bo_no");
		
		
		IBoardService service = BaordServiceImpl.getInstance();
		BoardVO vo = service.selectBoard(bo_no);
		
		System.out.println(vo.getBo_title());
		
		request.setAttribute("select", vo);
		request.getRequestDispatcher("/WEB-INF/views/board/selectBoard.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	}

}
