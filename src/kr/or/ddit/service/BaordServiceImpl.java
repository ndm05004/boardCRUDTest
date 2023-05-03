package kr.or.ddit.service;

import java.util.List;

import kr.or.ddit.dao.BoardDaoImpl;
import kr.or.ddit.dao.IBoardDao;
import kr.or.ddit.vo.BoardVO;

public class BaordServiceImpl implements IBoardService {
	
	private static BaordServiceImpl service;
	private IBoardDao dao;
	
	private BaordServiceImpl() {
		dao = BoardDaoImpl.getInstance();
	}
	
	public static BaordServiceImpl getInstance() {
		if(service==null) service = new BaordServiceImpl();
		return service;
	}
	
	@Override
	public List<BoardVO> viewBoard() {
		return dao.viewBoard();
	}

	@Override
	public int boardInsert(BoardVO vo) {
		return dao.boardInsert(vo);
	}

	@Override
	public BoardVO selectBoard(String bo_no) {
		return dao.selectBoard(bo_no);
	}

	@Override
	public int updateBoard(BoardVO vo) {
		return dao.updateBoard(vo);
	}

	@Override
	public int deleteBoard(String bo_no) {
		return dao.deleteBoard(bo_no);
	}

	
	
	
}
