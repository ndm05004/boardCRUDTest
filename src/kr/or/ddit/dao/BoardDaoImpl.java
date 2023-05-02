package kr.or.ddit.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.util.MybatisSqlSessionFactory;
import kr.or.ddit.vo.BoardVO;

public class BoardDaoImpl implements IBoardDao {
	
	private static BoardDaoImpl dao;
	
	private BoardDaoImpl() {
		
	}
	
	public static BoardDaoImpl getInstance() {
		if(dao==null) dao = new BoardDaoImpl();
		return dao;
	}

	@Override
	public List<BoardVO> viewBoard() {
		
		List<BoardVO> boardList = null;
		
		SqlSession session = null;
		
		try {
			session = MybatisSqlSessionFactory.getSqlSession();
			boardList = session.selectList("board.viewBoard");
			
		} finally {
			session.close();
		}
		
		return boardList;
	}

	@Override
	public int boardInsert(BoardVO vo) {
		
		SqlSession session = null;
		int cnt=0;
		try {
			session = MybatisSqlSessionFactory.getSqlSession();
			cnt = session.insert("board.boardInsert", vo);
			
		} finally {
			session.close();
		}
		
		return cnt;
	}

	@Override
	public BoardVO selectBoard(int bo_no) {
		
		BoardVO boardvo = null;
		
		SqlSession session = null;
		
		try {
			session = MybatisSqlSessionFactory.getSqlSession();
			boardvo = session.selectOne("board.selectBoard", bo_no);
			
		} finally {
			session.close();
		}
		
		return boardvo;
	}

	@Override
	public int updateBoard(BoardVO vo) {
		
		SqlSession session = null;
		int cnt=0;
		try {
			session = MybatisSqlSessionFactory.getSqlSession();
			cnt = session.update("board.updateBoard", vo);
			
		} finally {
			session.close();
		}
		
		return cnt;
	}

	@Override
	public int deleteBoard(int bo_no) {
		
		SqlSession session = null;
		int cnt=0;
		try {
			session = MybatisSqlSessionFactory.getSqlSession();
			cnt = session.delete("board.deleteBoard", bo_no);
			
		} finally {
			session.close();
		}
		
		return cnt;
	}
	
	

}
