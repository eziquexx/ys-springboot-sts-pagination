package com.mysite.sbbpage.card;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CardMapper {

	// detail
	Card getCardById(Integer id);
	
	// list
	List<Card> getCardList(@Param("size") int size, @Param("offset") int offset);
	
	// pagination
	Integer countTotal();
}
