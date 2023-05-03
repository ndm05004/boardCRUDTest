package kr.or.ddit.service;

import kr.or.ddit.vo.MemberVO;

public interface ImemberService {
	MemberVO memLogin(MemberVO vo);
	
	int memSignUp(MemberVO vo);
}
