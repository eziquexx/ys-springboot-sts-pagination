package com.mysite.sbbpage.card;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysite.sbbpage.PageDTO;
import com.mysite.sbbpage.word.Word;

@Service
public class CardService {
	@Autowired
	private CardMapper cardMapper;
	
	// detail
	Card getCardById(Integer id) {
		return cardMapper.getCardById(id);
	}
	
	// list
	PageDTO getCardList(int page, int size) {
		// offset 만들어주기
		int offset = (page - 1) * size;
		List<Card> content2 = cardMapper.getCardList(size, offset);
		
		int totalElements = cardMapper.countTotal();
		int totalPages = (int) Math.ceil((double) totalElements / size);
		
		return new PageDTO(page, size, totalPages, totalElements, content2);
	}
	
}
