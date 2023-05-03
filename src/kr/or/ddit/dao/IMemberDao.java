package kr.or.ddit.dao;

import kr.or.ddit.vo.MemberVO;

public interface IMemberDao {

	MemberVO memLogin(MemberVO vo);
	
	int memSignUp(MemberVO vo);
	
}
