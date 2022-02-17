package com.myweb.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.myweb.board.dto.BoardDTO;
import com.myweb.board.service.BoardService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService bsv;
	
	@GetMapping("/list")
	public void list(Model model) throws Exception {
		model.addAttribute("list", bsv.getList());
	}
	
	@GetMapping("/detail")
	public void detail(Model model, Long bno) throws Exception {
		bsv.modifyRC(bno);
		model.addAttribute("bdto", bsv.getOne(bno));
	}
	
	@GetMapping("/register")
	public void register() {}
	
	@PostMapping("/register")
	public String register(BoardDTO bdto) throws Exception {
		bsv.register(bdto);
		return "redirect:/board/list";
	}
	
	@PostMapping("/modify")
	public String modify(BoardDTO bdto) throws Exception {
		bsv.modify(bdto);
		return "redirect:/board/detail?bno="+bdto.getBno();
	}	
	
	@PostMapping("/remove")
	public String remove(Long bno) throws Exception {
		bsv.remove(bno);
		return "redirect:/board/list";
	}
}
