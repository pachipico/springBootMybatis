package com.myweb.board.dto;

import lombok.Data;

@Data
public class BoardDTO {
	private Long bno;
	private String title;
	private String writer;
	private String content;
	private String regAt;
	private String modAt;
	private Long readcount;
}
