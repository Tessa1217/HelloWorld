package edu.project;

import java.text.SimpleDateFormat;

public class Board {

	int boardNo;
	private String title;
	private String content;
	private String author;
	private String date;

	Board(int boardNo, String title, String content, String author, String date) {
		this.boardNo = boardNo;
		this.title = title;
		this.content = content;
		this.author = author;
		this.date = date;

	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "게시글 번호: " + boardNo + " | 제목: " + title + " | 작성자: " + author + " | 작성일시: " + date;
	}

	public String detailView() {
		return "게시글 번호: " + boardNo + " 제목: " + title + "\n내용: " + content + //
				"\n작성자: " + author + "\n작성일시: " + date;
	}

}
