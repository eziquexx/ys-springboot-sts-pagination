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
	public List<Word> getWordList() {
		return wordMapper.getWordList();
	}
}
