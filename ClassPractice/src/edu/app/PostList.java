package edu.app;

import java.util.ArrayList;

public class PostList {

	// Field
	private Post[] posts;

	// Post 배열의 크기 선언
	public void init(int size) {
		posts = new Post[size];
	}

	// 새로운 포스트 추가
	public int addPost(Post post) {
		int errorcase = -1;
		for (int i = 0; i < posts.length; i++) {
			if (posts[i] != null && posts[i].getpostNum() == post.getpostNum()) {
				errorcase = 1;
				break;
			}
			if (posts[i] == null) {
				posts[i] = post;
				errorcase = 0;
				break;
			}
		}
		return errorcase;
	}

	// 기존 포스트 수정 (게시물 번호를 조회하여 해당하는 포스트 찾기)
	public boolean editPost(Post post) {
		boolean errorcase = false;
		for (int i = 0; i < posts.length; i++) {
			if (posts[i] != null && posts[i].getWriter().equals(post.getWriter())) {
				if (posts[i] != null && posts[i].getpostNum() == post.getpostNum()) {
					posts[i].setTitle(post.getTitle());
					posts[i].setContent(post.getContent());
					errorcase = true;
					break;
				}
			}
		}
		return errorcase;

	}

	// 포스트 목록 출력
	public Post[] listPosts() {
		return posts;
	}

	// 포스트의 값이 전부 초기값인지 여부
	public boolean postEmpty() {
		boolean isEmpty = true;
		for (int i = 0; i < posts.length; i++) {
			if (posts[i] != null) {
				isEmpty = false;
			}
		}
		return isEmpty;
	}

	// 포스트 삭제 (key = 게시물 번호)
	public int deletePost(int postNo, String userID) {
		int errorcase = -1;
		for (int i = 0; i < posts.length; i++) {
			// 로그인한 유저가 작성자명과 등일한 경우 삭제
			if (posts[i] != null && posts[i].getWriter().equals(userID)) {
				if (posts[i].getpostNum() == postNo) {
					posts[i] = null;
					errorcase = 0;
				}
				// 로그인한 유저와 작성자가 다를 경우 권한 없음으로 삭제 불가
			} else if (posts[i] != null && !(posts[i].getWriter().equals(userID))) {
				errorcase = 1;
			}
		}
		return errorcase;
	}

	// 해당하는 포스트 한 건 조회, 조회 시 포스트 조회수 증가
	public Post srchPost(int postNo) {
		for (Post post : posts) {
			if (post.getpostNum() == postNo) {
				int currentCnt = post.getPostCnt();
				post.setPostCnt(++currentCnt);
				return post;
			}
		}
		return null;
	}

	// 포스트 작성자를 통해 해당 작성자의 포스트 전체 출력

	/*
	 * public Post writerSrch(Post post, String author) { if
	 * (post.getWriter().equals(author)) { return post; } return null; }
	 */

	// 배열을 이용한 포스트 작성자의 포스트 조회
	public Post[] getWriterList(String writer) {
		Post[] writerList;
		int cnt = 0;

		for (Post post : posts) {
			if (post != null) { // null.method를 쓸 경우 NullPointerException 발생
				// 예외 발생을 막기 위해 null이 아닌 포스트만 확인
				if (post.getWriter().equals(writer)) {
					cnt++;
				}
			}
		}

		writerList = new Post[cnt];

		for (int i = 0; i < posts.length; i++) {
			if (posts[i] != null && posts[i].getWriter().equals(writer)) {
				for (int j = 0; j < writerList.length; j++) {
					if (writerList[j] == null) {
						writerList[j] = posts[i];
					}
				}
			}
		}
		return writerList;
	}

	// 배열 리스트를 이용하여 포스트 작성자의 포스트들 담기
	public ArrayList<Post> searchWriter(String author) {
		ArrayList<Post> listing = new ArrayList<Post>();
		for (Post post : posts) {
			if (post != null) {
				if (post.getWriter().equals(author)) {
					listing.add(post);
				}
			}
		}
		return listing;
	}

	// 작성자의 포스트 담은 배열 리스트 출력

	public void postOfAuthor(ArrayList<Post> listing) {
		if (listing.size() == 0) {
			System.out.println("조회할 게시물이 없습니다.");
		} else {
			for (Post post : listing) {
				post.getInfo();
				int currentCnt = post.getPostCnt();
				post.setPostCnt(++currentCnt);
			}
		}

	}

}
