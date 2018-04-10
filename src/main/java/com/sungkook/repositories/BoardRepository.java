package com.sungkook.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sungkook.models.Board;

public interface BoardRepository  extends CrudRepository<Board, Long>{
	List<Board> findByTitle(final String title);
}
