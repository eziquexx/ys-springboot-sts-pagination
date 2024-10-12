package com.mysite.sbbpage;

import java.util.List;

import com.mysite.sbbpage.card.Card;
import com.mysite.sbbpage.word.Word;

public class PageDTO {
	private int page;
	private int size;
	private int totalPages;
	private long totalElements;
	private List<Word> content;
	private List<Card> content2;
	
	public List<Card> getContent2() {
		return content2;
	}
	public void setContent2(List<Card> content2) {
		this.content2 = content2;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public long getTotalElements() {
		return totalElements;
	}
	public void setTotalElements(long totalElements) {
		this.totalElements = totalElements;
	}
	public List<Word> getContent() {
		return content;
	}
	public void setContent(List<Word> content) {
		this.content = content;
	}
	
	// 생성자함수
	public PageDTO(int page, int size, int totalPages, long totalElements, List<Word> content) {
		super(); // 부모 생성자를 의미한다.
		this.page = page;
		this.size = size;
		this.totalPages = totalPages;
		this.totalElements = totalElements;
		this.content = content;
	}
	public PageDTO(int page, int size, int totalPages, int totalElements, List<Card> content2) {
		super(); // 부모 생성자를 의미한다.
		this.page = page;
		this.size = size;
		this.totalPages = totalPages;
		this.totalElements = totalElements;
		this.content2 = content2;
	}
	
}
