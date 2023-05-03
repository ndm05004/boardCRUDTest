package kr.or.ddit.dao;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.util.MybatisSqlSessionFactory;
import kr.or.ddit.vo.BoardVO;
import kr.or.ddit.vo.MemberVO;

public class MemberDaoImpl implements IMemberDao {

	private static MemberDaoImpl dao;
	
	private MemberDaoImpl() {
		
	}
	
	public static MemberDaoImpl getInstance() {
		if(dao==null) dao = new MemberDaoImpl();
		return dao;
	}
	
	@Override
	public MemberVO memLogin(MemberVO vo) {

		SqlSession session = null;
		MemberVO loginvo = null;
		try {
			session = MybatisSqlSessionFactory.getSqlSession();
			loginvo = session.selectOne("member.memLogin", vo);
		} finally {
			session.close();
		}
		
		return loginvo;
	}

	@Override
	public int memSignUp(MemberVO vo) {
		
		int cnt=0;
		SqlSession session = null;
		
		try {
			session = MybatisSqlSessionFactory.getSqlSession();
			cnt = session.insert("member.memSignUp", vo);
			System.out.println(cnt);
			
		} finally {
			session.commit();
			session.close();
		}
		
		return cnt;
	}

	
	

}
