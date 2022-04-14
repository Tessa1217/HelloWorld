package edu.Constructor;

public class Board {

	// 게시글 번호, 제목, 내용, 작성자, 조회수
	private int boardNo;
	private String title;
	private String content;
	private String author;
	private int searchCnt = 0;

	// 생성자
	public Board(int boardNo, String title, String content, String author) {
		this.boardNo = boardNo;
		this.title = title;
		this.content = content;
		this.author = author;
	}
	
	//메소드
	
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

	public int getSearchCnt() {
		return searchCnt;
	}

	public void setSearchCnt(int searchCnt) {
		this.searchCnt = searchCnt;
	}

	public void getInfo() {
		// 게시글번호, 제목, 내용, 작성자, 조회수
		System.out.printf("게시물 번호: %d\n" //
				+ "게시물 제목: %s\n게시물 내용: %s\n" //
				+ "작성자: %s\n조회수: %d\n", this.boardNo, this.title, //
				this.content, this.author, //
				this.searchCnt);
		System.out.println();
	}
	
	public void getDetailInfo() {
		// 게시글 번호         작성자
		// 제목               조회수 
		// 내용 
		String info = "===============================================\n" +// 
		               "게시글번호: %2d                        작성자 : %-5s\n" +//
				       "제목: %-15s                조회수 : %3d\n" +//
		               "내용: %-30s\n" + 
				       "==============================================\n";
		
		System.out.printf(info, 
				this.boardNo, this.author, this.title, this.searchCnt,
				this.content);
		System.out.println();
	}
}
