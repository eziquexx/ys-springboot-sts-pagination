package com.mysite.sbbpage.card;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CardController {
	@Autowired
	private CardService cardService;

	// detail
	@GetMapping("cards/{id}")
	public String getCardById(@PathVariable("id") Integer id, Model model) {
		Card card = cardService.getCardById(id);
		model.addAttribute("card", card);
		
		return "/card/cardDetail";
	}
}
