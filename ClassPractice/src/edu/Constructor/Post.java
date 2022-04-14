package edu.Constructor;

public class Post {

	// Field
	private int postNum;
	private String title;
	private String content;
	private String writer;
	private int postCnt = 0;

	// Constructor
	public Post(int postNum, String title, String content, String writer) {
		this.postNum = postNum;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	// Getters and Setters
	public int getpostNum() {
		return postNum;
	}

	public void setpostNum(int postNum) {
		this.postNum = postNum;
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

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getPostCnt() {
		return postCnt;
	}

	public void setPostCnt(int postCnt) {
		this.postCnt = postCnt;
	}

	// 출력용 메소드
	public void getInfo() {
		// 게시글번호, 제목, 내용, 작성자, 조회수
		System.out.printf("게시물 번호: %d\n" //
				+ "게시물 제목: %s\n게시물 내용: %s\n" //
				+ "작성자: %s\n조회수: %d\n", this.postNum, this.title, //
				this.content, this.writer, //
				this.postCnt);
		System.out.println();
	}

	public void getDetailInfo() {
		// 게시글 번호 작성자
		// 제목 조회수
		// 내용
		String info = "===============================================\n" + //
				"게시글번호: %2d                        작성자 : %-5s\n" + //
				"제목: %-15s                조회수 : %3d\n" + //
				"내용: %-30s\n" + "==============================================\n";

		System.out.printf(info, this.postNum, this.writer, this.title, this.postCnt, this.content);
		System.out.println();
	}

}
