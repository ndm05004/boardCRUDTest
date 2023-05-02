package kr.or.ddit.service;

import kr.or.ddit.dao.MemberDaoImpl;
import kr.or.ddit.vo.MemberVO;

public class memberServiceImpl implements ImemberService {
	
	private static ImemberService service;
	private MemberDaoImpl dao;
	
	private memberServiceImpl() {
		dao.getInstance();
	}
	
	public static ImemberService getInstance() {
		if(service==null) service = new memberServiceImpl();
		return service;
	}
	
	
	@Override
	public int memLogin(MemberVO vo) {
		return dao.memLogin(vo);
	}

	@Override
	public int memSignUp(MemberVO vo) {
		return dao.memSignUp(vo);
	}

	
}
