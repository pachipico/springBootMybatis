package com.myweb.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myweb.board.dto.BoardDTO;
import com.myweb.board.repository.BoardMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BoardServiceImple implements BoardService {
	
	@Autowired
	private BoardMapper mapper;
	@Override
	public void register(BoardDTO bdto) throws Exception {
		mapper.insert(bdto);
	}

	@Override
	public List<BoardDTO> getList() throws Exception {

		return mapper.selectList();
	}

	@Override
	public BoardDTO getOne(Long bno) throws Exception {

		return mapper.selectOne(bno);
	}

	@Override
	public void modify(BoardDTO bdto) throws Exception {
		mapper.update(bdto);
	}

	@Override
	public void remove(Long bno) throws Exception {
		mapper.delete(bno);
	}

	@Override
	public void modifyRC(Long bno) throws Exception {
		mapper.updateRC(bno);
	}

}
