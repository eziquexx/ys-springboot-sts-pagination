package com.mysite.sbbpage.word;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysite.sbbpage.PageDTO;

@Service
public class WordService {
	@Autowired
	private WordMapper wordMapper;
	
	// detail
	public Word getWordById(Integer id) {
		return wordMapper.getWordById(id);
	}
	
	// list
	public PageDTO getWordList(int page, int size) {
		// offset이 없어서 만들기
		// offset = page - 1 * size
		int offset = (page - 1) * size;
		List<Word> content = wordMapper.getWordList(size, offset);
		
		
		int totalElements = wordMapper.countTotal(); // 목록 총 갯수
		int totalPages = (int) Math.ceil((double) totalElements / size); // 총 페이지번호
		
		// 생성자 함수 new로 만들어서 () 파라미터 값 반환. -> 어디로? controller에게. controller는 client에게
		return new PageDTO(page, size, totalPages, totalElements, content);

		
		// select * from table limit x offset y;
		// limit = size, offset = ? 
	}
}
