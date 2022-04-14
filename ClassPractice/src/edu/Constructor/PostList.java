package edu.Constructor;

public class PostList {

	private Post[] posts;

	public void init(int size) {
		posts = new Post[size];
	}

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

	public Post[] listPosts() {
		return posts;
	}

	public boolean postEmpty() {
		boolean isEmpty = true;
		for (int i = 0; i < posts.length; i++) {
			if (posts[i] != null) {
				isEmpty = false;
			}
		}
		return isEmpty;
	}

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

	public Post writerSrch(Post post, String author) {
		if (post.getWriter().equals(author)) {
			return post;
		}
		return null;
	}

}
