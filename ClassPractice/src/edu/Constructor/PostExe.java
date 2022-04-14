package edu.Constructor;

import java.util.Scanner;

public class PostExe {
	public static void main(String[] args) {
		PostList postList = new PostList();
		postList.init(3);

		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("01.추가 02.수정 03.목록 04.삭제 05.한 건 조회 06.작성자 조회 09.종료");
			System.out.println("선택 >>> ");
			int selectNo = scn.nextInt();
			scn.nextLine();

			if (selectNo == 1) {
				System.out.println("게시글 번호 >>> ");
				int postNo = scn.nextInt();
				scn.nextLine();
				System.out.println("게시글 제목 >>> ");
				String postTitle = scn.nextLine();
				System.out.println("게시글 내용 >>> ");
				String postContent = scn.nextLine();
				System.out.println("작성자 >>> ");
				String postWriter = scn.nextLine();

				Post newPost = new Post(postNo, postTitle, postContent, postWriter);

				int check = postList.addPost(newPost);
				if (check == 1) {
					System.out.println("게시글 번호가 중복되었습니다.");
				} else if (check == 0) {
					System.out.println("게시글이 성공적으로 저장되었습니다.");
				} else if (check == -1) {
					System.out.println("게시글을 더 이상 추가할 수 없습니다.");
				}

			} else if (selectNo == 2) {

				boolean check = postList.postEmpty();
				if (check == true) {
					System.out.println("수정할 게시글이 없습니다.");
					continue;
				}

				System.out.println("수정할 게시글 번호 >>> ");
				int postNo = scn.nextInt();
				scn.nextLine();
				System.out.println("제목 수정 >>> ");
				String postTitle = scn.nextLine();
				System.out.println("내용 수정 >>> ");
				String postContent = scn.nextLine();

				Post editedPost = new Post(postNo, postTitle, postContent, null);

				boolean error = postList.editPost(editedPost);

				if (error == true) {
					System.out.println("게시글 수정이 완료되었습니다.");
				} else if (error == false) {
					System.out.println("게시글 수정이 완료되지 않았습니다.");
				}
			} else if (selectNo == 3) {
				boolean check = postList.postEmpty();
				if (check == true) {
					System.out.println("게시글 목록이 비었습니다.");
				} else if (check == false) {
					Post[] postings = postList.listPosts();
					for (Post post : postings) {
						if (post != null) {
							post.getInfo();
						}
					}
				}

			} else if (selectNo == 4) {
				System.out.println("삭제할 게시글 번호 >>> ");
				int postNo = scn.nextInt();
				scn.nextLine();
				int error = postList.deletePost(postNo);
				if (error == 0) {
					System.out.println("게시글을 정상적으로 삭제했습니다.");
				} else if (error == -1) {
					System.out.println("게시글 삭제가 완료되지 않았습니다.");
				}
			} else if (selectNo == 5) {
				System.out.println("조회할 게시글 번호 >>> ");
				int postNo = scn.nextInt();
				scn.nextLine();
				Post searchPost = postList.srchPost(postNo);
				if (searchPost != null) {
					searchPost.getDetailInfo();
				} else if (searchPost == null) {
					System.out.println("조회할 게시물이 없습니다.");
				}
			} else if (selectNo == 6) {
				System.out.println("작성자 >>> ");
				String author = scn.nextLine();
				Post[] posts = postList.listPosts();
				for (Post post : posts) {
					Post writerPost = postList.writerSrch(post, author);
					if (writerPost != null) {
						writerPost.getInfo();
					}
				}
			} else if (selectNo == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("메뉴를 다시 선택해주세요.");
			}
		}

	}

}
