package com.mysite.sbbpage.card;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {
	@Autowired
	private CardMapper cardMapper;
	
	
	// detail
	Card getCardById(Integer id) {
		return cardMapper.getCardById(id);
	}
	
}
