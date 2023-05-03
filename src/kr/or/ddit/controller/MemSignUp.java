package kr.or.ddit.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.service.ImemberService;
import kr.or.ddit.service.memberServiceImpl;
import kr.or.ddit.vo.MemberVO;

/**
 * Servlet implementation class memSignUp
 */
@WebServlet("/memSignUp.do")
public class MemSignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/board/memSignUp.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		
		MemberVO signUpVo = new MemberVO();
		signUpVo.setMem_id(id);
		signUpVo.setMem_pw(pw);
		signUpVo.setMem_name(name);
				
		ImemberService service = memberServiceImpl.getInstance(); 
		
		int check = service.memSignUp(signUpVo);
		
		if(check == 1) {
			response.sendRedirect("/login.do");
		}else {
			response.sendRedirect("/memSignUp.do");
		}
		
	}

}
