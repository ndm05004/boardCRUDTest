package kr.or.ddit.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.service.BaordServiceImpl;
import kr.or.ddit.service.IBoardService;


@WebServlet("/boardDelete.do")
public class BoardDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bo_no = request.getParameter("bo_no");
		
		IBoardService service = BaordServiceImpl.getInstance();
		
		service.deleteBoard(bo_no);
		
		response.sendRedirect("/boardList.do");
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
