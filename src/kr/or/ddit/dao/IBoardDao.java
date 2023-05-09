package kr.or.ddit.dao;

import java.util.List;

import kr.or.ddit.vo.BoardVO;

public interface IBoardDao {

	
	List<BoardVO> viewBoard();
	
	int boardInsert(BoardVO vo);
	
	
	BoardVO selectBoard(String bo_no);
	
	
	int updateBoard(BoardVO vo);
	
	
	int deleteBoard(String bo_no);

	int updateHit(String bo_no);
	
}
