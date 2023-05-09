package kr.or.ddit.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.dao.MemberDaoImpl;
import kr.or.ddit.service.ImemberService;
import kr.or.ddit.service.memberServiceImpl;
import kr.or.ddit.vo.MemberVO;


@WebServlet("/login.do")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/board/boardLogin.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		MemberVO loginVo = new MemberVO();
		loginVo.setMem_id(id);
		loginVo.setMem_pw(pw);
				
		ImemberService service = memberServiceImpl.getInstance();
		
		MemberVO vo = service.memLogin(loginVo);
				
		if(vo != null) {
			HttpSession session = request.getSession();
			session.setAttribute("loginVo", vo);
			response.sendRedirect("/boardList.do?page=1");
			
		}else {
			response.sendRedirect("/login.do?flag=1");
		}
		
	}

}
