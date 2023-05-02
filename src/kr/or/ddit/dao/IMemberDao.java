package kr.or.ddit.dao;

import kr.or.ddit.vo.MemberVO;

public interface IMemberDao {

	int memLogin(MemberVO vo);
	
	int memSignUp(MemberVO vo);
	
}
