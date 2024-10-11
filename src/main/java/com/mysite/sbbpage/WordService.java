package com.mysite.sbbpage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordService {
	@Autowired
	private WordMapper wordMapper;
	
	// detail
	public Word getWordById(Integer id) {
		return wordMapper.getWordById(id);
	}
	
	// list
	public List<Word> getWordList(int page, int size) {
		// offset이 없어서 만들기
		// offset = page - 1 * size
		int offset = (page - 1) * size;
		
		// select * from table limit x offset y;
		// limit = size, offset = ? 
		return wordMapper.getWordList(size, offset);
	}
}
