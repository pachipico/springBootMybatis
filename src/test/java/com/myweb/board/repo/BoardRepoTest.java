package com.myweb.board.repo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.myweb.board.dto.BoardDTO;
import com.myweb.board.repository.BoardMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class BoardRepoTest {
	
	@Autowired
	private BoardMapper mapper;
	
	@Test
	public void insertTest() throws Exception {
		BoardDTO bdto = new BoardDTO();
		bdto.setTitle("Test Title");
		bdto.setWriter("Tester@tester.com");
		bdto.setContent("Test Content");
		mapper.insert(bdto);
	}
	
	@Test
	public void selectList() throws Exception {
		mapper.selectList();
	}
	
	@Test
	public void selectOne() throws Exception {
		mapper.selectOne(1L);
	}
	
	@Test
	public void update() throws Exception{
		BoardDTO bdto = new BoardDTO();
		bdto.setBno(1L);
		bdto.setContent("modified content");
		bdto.setTitle("Modified title");
		mapper.update(bdto);
	}
	
	@Test
	public void updateReadCount() throws Exception{
		mapper.updateRC(1L);
	}
}
