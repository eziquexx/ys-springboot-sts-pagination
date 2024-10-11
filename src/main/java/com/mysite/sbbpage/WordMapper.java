package com.mysite.sbbpage;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WordMapper {
	Word getWordById(Integer id);
	List<Word> getWordList();
}
