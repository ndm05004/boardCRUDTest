package kr.or.ddit.service;

import kr.or.ddit.vo.MemberVO;

public interface ImemberService {
	int memLogin(MemberVO vo);
	
	int memSignUp(MemberVO vo);
}
