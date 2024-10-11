package com.mysite.sbbpage.word;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WordMapper {
	Word getWordById(Integer id);
	// @Param 어노테이션을 사용하여 size, offset을 가져오기.
	List<Word> getWordList(@Param("size") int size, @Param("offset") int offset);
	
	// pagination
	Integer countTotal();
}
