package com.sungkook.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.sungkook.models.Board;
import com.sungkook.repositories.BoardRepository;

public class BoardControl {
	
	@Autowired
	BoardRepository boardRepository;
	
	@GetMapping
	public List<Board> getBoardContent(){
		return boardRepository.findByContent("내용..155");
	}
}
