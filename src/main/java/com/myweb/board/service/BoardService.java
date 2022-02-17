package com.myweb.board.service;

import java.util.List;

import com.myweb.board.dto.BoardDTO;

import lombok.extern.slf4j.Slf4j;


public interface BoardService {
	void register(BoardDTO bdto) throws Exception;
	List<BoardDTO> getList() throws Exception;
	BoardDTO getOne(Long bno) throws Exception;
	void modify(BoardDTO bdto) throws Exception;
	void remove(Long bno) throws Exception;
	void modifyRC(Long bno) throws Exception;
}
