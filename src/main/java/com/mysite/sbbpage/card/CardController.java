package com.mysite.sbbpage.card;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CardController {
	@Autowired
	private CardService cardService;

	// detail
	@GetMapping("cards/{id}")
	@ResponseBody
	public Card getCardById(@PathVariable("id") Integer id) {
		return cardService.getCardById(id);
	}
}
