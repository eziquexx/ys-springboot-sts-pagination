package com.mysite.sbbpage.card;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysite.sbbpage.PageDTO;

@Controller
public class CardController {
	@Autowired
	private CardService cardService;

	// detail
	@GetMapping("/cards/{id}")
	public String getCardById(@PathVariable("id") Integer id, Model model) {
		Card card = cardService.getCardById(id);
		model.addAttribute("card", card);
		
		return "/card/cardDetail";
	}
	
	// list
	@GetMapping("/cards")
	public String getCardList(@RequestParam(name="page", defaultValue="1") int page, 
			@RequestParam(name="size", defaultValue="9") int size,
			Model model) {
		PageDTO pageDTO = cardService.getCardList(page, size);
		model.addAttribute("pageDTO", pageDTO);
		
		return "/card/cardList";
	}
}
