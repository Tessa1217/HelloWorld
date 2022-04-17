package edu.Constructor;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PostExe {
	public static void main(String[] args) {
		PostList postList = new PostList();
		User[] members = new User[3];
		postList.init(3);

		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("00.계정생성 01.추가 02.수정 03.목록 04.삭제 05.한 건 조회 " //
					+ "06.작성자 조회 07. 작성자 조회 2 09.종료");
			System.out.println("선택 >>> ");
			// try - catch 구문
			int selectNo = -1;
			try {
				selectNo = scn.nextInt(); // 숫자 반환이 필요
			} catch (InputMismatchException e) {
				System.out.println("잘못된 처리를 시도했습니다.");

			}
			scn.nextLine();

			// 아이디, 비밀번호, 유저 아이디를 입력하여 계정 생성
			if (selectNo == 0) {
				System.out.println("생성할 아이디 >>> ");
				String id = scn.next();
				scn.nextLine();
				System.out.println("비밀번호 >>> ");
				String password = scn.nextLine();
				System.out.println("유저 아이디 >>> ");
				String userName = scn.nextLine();
				User user = new User(id, password, userName);

				for (int i = 0; i < members.length; i++) {
					if (members[i] == null) {
						members[i] = user;
						members[i].showUser();
						break;
					}
				}
			} else if (selectNo == 1) {
				// 게시물 추가를 위하여 로그인 절차
				boolean success = false;
				System.out.println("아이디 >>> ");
				String id = scn.nextLine();
				for (int i = 0; i < members.length; i++) {
					if (members[i] != null && members[i].getUserID().equals(id)) {
						success = members[i].login(members[i]);
					}
				}

				// 로그인 실패 시 메뉴로 돌아감
				if (success == false) {
					System.out.println("로그인에 실패하셨습니다.");
					continue;

				}

				// 로그인 성공 시 게시글 추
				System.out.println();
				System.out.println("_______________");
				System.out.println("   게시글 추가   ");
				System.out.println("_______________");
				System.out.println("게시글 번호 >>> ");
				int postNo = scn.nextInt();
				scn.nextLine();
				System.out.println("게시글 제목 >>> ");
				String postTitle = scn.nextLine();
				System.out.println("게시글 내용 >>> ");
				String postContent = scn.nextLine();

				Post newPost = new Post(postNo, postTitle, postContent, id);
				int check = postList.addPost(newPost);
				if (check == 1) {
					System.out.println("게시글 번호가 중복되었습니다.");
				} else if (check == 0) {
					System.out.println("게시글이 성공적으로 저장되었습니다.");
				} else if (check == -1) {
					System.out.println("게시글을 더 이상 추가할 수 없습니다.");
				}

			} else if (selectNo == 2) {
				// 수정을 위한 로그인 절차

				boolean success = false;
				System.out.println("아이디 >>> ");
				String id = scn.nextLine();
				for (int i = 0; i < members.length; i++) {
					if (members[i] != null && members[i].getUserID().equals(id)) {
						success = members[i].login(members[i]);
					}
				}

				if (success == false) {
					System.out.println("로그인에 실패하셨습니다.");
					continue;

				}

				System.out.println("수정할 게시글 번호 >>> ");
				int postNo = scn.nextInt();
				scn.nextLine();
				System.out.println("제목 수정 >>> ");
				String postTitle = scn.nextLine();
				System.out.println("내용 수정 >>> ");
				String postContent = scn.nextLine();

				Post editedPost = new Post(postNo, postTitle, postContent, id);

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
				boolean success = false;
				System.out.println("아이디 >>> ");
				String id = scn.nextLine();
				for (int i = 0; i < members.length; i++) {
					if (members[i] != null && members[i].getUserID().equals(id)) {
						success = members[i].login(members[i]);
					}
				}

				if (success == false) {
					System.out.println("로그인에 실패하셨습니다.");
					continue;

				}

				System.out.println("삭제할 게시글 번호 >>> ");
				int postNo = scn.nextInt();
				scn.nextLine();
				int error = postList.deletePost(postNo, id);
				if (error == 0) {
					System.out.println("게시글을 정상적으로 삭제했습니다.");
				} else if (error == -1) {
					System.out.println("게시글 삭제가 완료되지 않았습니다.");
				} else if (error == 1) {
					System.out.println("게시글 작성자가 아니면 게시글을 삭제할 수 없습니다.");
				}

			} else if (selectNo == 5) {
				for (User member : members) {
					if (member != null) {
						member.login(member);
						System.out.println("조회할 게시글 번호 >>> ");
						int postNo = scn.nextInt();
						scn.nextLine();
						Post searchPost = postList.srchPost(postNo);
						if (searchPost != null) {
							searchPost.getDetailInfo();
						} else if (searchPost == null) {
							System.out.println("조회할 게시물이 없습니다.");
						}
					}

				}
			} else if (selectNo == 6) {
				System.out.println("user 아이디 >>> ");
				String author = scn.nextLine();
				ArrayList<Post> posts = postList.searchWriter(author);
				postList.postOfAuthor(posts);

			} else if (selectNo == 7) { // 작성자 조회 2
				System.out.println("user ID >>> ");
				String searchAuthor = scn.nextLine();
				Post[] writerList = postList.getWriterList(searchAuthor);
				System.out.println(searchAuthor + " 님의 게시물 목록");
				if (writerList.length == 0) {
					System.out.println("조회할 게시물이 없습니다.");
					continue;
				}
				for (Post post : writerList) {
					if (post != null) {
						post.getInfo();
					}
				}
			} else if (selectNo == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (selectNo == -1) {
				for (int i = 0; i < members.length; i++) {
					if (members[i] != null) {
						members[i].showUser();
					}
				}
			} else {
				System.out.println("메뉴를 다시 선택해주세요.");
			}
		}

	}

}
