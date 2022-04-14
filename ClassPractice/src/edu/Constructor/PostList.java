package edu.Constructor;

import java.util.ArrayList;

public class PostList {

	// Field
	private Post[] posts;

	// Post 배열의 크기 선언
	public void init(int size) {
		posts = new Post[size];
	}

	// 새로운 포스트 추
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
			if (posts[i].getpostNum() == post.getpostNum()) {
				posts[i].setTitle(post.getTitle());
				posts[i].setContent(post.getContent());
				errorcase = true;
				break;
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
	public int deletePost(int postNo) {
		int errorcase = -1;
		for (int i = 0; i < posts.length; i++) {
			if (posts[i].getpostNum() == postNo) {
				posts[i] = null;
				errorcase = 0;
				break;
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

	// 배열 리스트를 이용하여 포스트 작성자의 포스트들 담기
	public ArrayList<Post> searchWriter(String author) {
		ArrayList<Post> listing = new ArrayList<Post>();
		for (Post post : posts) {
			if (post.getWriter().equals(author)) {
				listing.add(post);
			}
		}
		return listing;
	}

	// 작성자의 포스트 담은 배열 리스트 출력

	public void postOfAuthor(ArrayList<Post> posts) {
		for (int i = 0; i < posts.size(); i++) {
			if (posts.get(i) != null) {
				posts.get(i).getInfo();
				int currentCnt = posts.get(i).getPostCnt();
				posts.get(i).setPostCnt(++currentCnt);
			} else if (posts.get(i) == null) {
				continue;
			}
		}
	}

}
