package kr.or.ddit.service;

import java.util.List;

import kr.or.ddit.vo.BoardVO;

public interface IBoardService {
	
	List<BoardVO> viewBoard();
	
	int boardInsert(BoardVO vo);
	
	
	BoardVO selectBoard(String bo_no);
	
	
	int updateBoard(BoardVO vo);
	
	
	int deleteBoard(String bo_no);

}
