package kr.or.ddit.dao;

import java.util.List;

import kr.or.ddit.vo.BoardVO;

public interface IBoardDao {

	
	List<BoardVO> viewBoard();
	
	int boardInsert(BoardVO vo);
	
	
	BoardVO selectBoard(int bo_no);
	
	
	int updateBoard(BoardVO vo);
	
	
	int deleteBoard(int bo_no);
	
}
