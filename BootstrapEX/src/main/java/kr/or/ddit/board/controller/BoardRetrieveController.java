package kr.or.ddit.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/board")
public class BoardRetrieveController {
	
	// /notice/board
	@GetMapping
	public String  list(@PathVariable String boardType) {
		log.info("게시판 종류 : {}", boardType);
		return "board/boardList";
	}
	
	// notice/board/12
	@GetMapping("{boNo}")
	public String detail(@PathVariable String boardType, @PathVariable int boNo) {
		log.info("게시판 종류 : {}, 글번호 : {}", boardType, boNo);
		return "board/boardView";
	}
}
