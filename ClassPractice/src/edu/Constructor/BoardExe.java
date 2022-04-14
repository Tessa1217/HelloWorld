package edu.Constructor;

import java.util.Scanner;

public class BoardExe {
	public static void main(String[] args) {

		// BoardList에 정의해놓은 필드와 메소드 활용해서 기능 구현
		BoardList boardList = new BoardList();
		boardList.init(3); // 배열의 크기 지정하는 init 메소드 호출

		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("01.추가 02.수정 03.목록 04.삭제 05.한 건 조회 06.작성자 조회 09.종료");
			System.out.println("선택 >>> ");
			int selectNo = scn.nextInt();
			scn.nextLine();

			if (selectNo == 1) {
				// 글의 내용을 사용자 입력받아 저장
				System.out.println("게시글번호 >>> ");
				int boardNo = scn.nextInt();
				scn.nextLine();
				System.out.println("제목 >>> ");
				String boardTitle = scn.nextLine();
				System.out.println("내용 >>> ");
				String boardContent = scn.nextLine();
				System.out.println("작성자 >>> ");
				String boardAuthor = scn.nextLine();

				// 생성자를 호출하여 해당 내용을 담기
				Board newBoard = new Board(boardNo, boardTitle, //
						boardContent, boardAuthor);

				// addBoard 기능 호출
				int errCheck = boardList.addBoard(newBoard);
				if (errCheck == 1) {
					System.out.println("게시글 번호가 중복되었습니다.");
				} else if (errCheck == 0) {
					System.out.println("게시글이 성공적으로 저장되었습니다.");
				} else if (errCheck == -1) {
					System.out.println("게시글을 더 이상 추가할 수 없습니다.");
				}

			} else if (selectNo == 2) {
				// 게시글 번호에 해당하는 포스트의 제목과 내용 수정
				System.out.println("수정할 게시글 번호 >>> ");
				int boardNo = scn.nextInt();
				scn.nextLine();
				System.out.println("수정할 제목 >>> ");
				String newTitle = scn.nextLine();
				System.out.println("수정할 내용 >>> ");
				String newContent = scn.nextLine();

				Board editBoard = new Board(boardNo, newTitle, newContent, null);
				boolean editCheck = boardList.modifyBoard(editBoard);
				if (editCheck == true) {
					System.out.println("게시글이 성공적으로 수정되었습니다.");
				} else if (editCheck == false) {
					System.out.println("게시글 수정에 실패했습니다.");
				}

			} else if (selectNo == 3) {

				Board[] boards = boardList.boardList();
				for (Board board : boards) {
					if (board != null) {
						board.getInfo();
					}
				}

			} else if (selectNo == 4) {

				System.out.println("삭제할 게시글 번호 >>> ");
				int boardNo = scn.nextInt();
				scn.nextLine();
				// boardList.deleteBoard(boardNo) 타입 자체가 불린형이라 바로 if문에 담아도 됨
				int errCheck = boardList.deleteBoard(boardNo);
				if (errCheck == 0) {
					System.out.println("게시글이 성공적으로 삭제되었습니다.");
				} else if (errCheck == -1) {
					System.out.println("삭제가 정상적으로 완료되지 않았습니다.");
				}

			} else if (selectNo == 5) {

				System.out.println("조회할 게시글 번호 >>> ");
				int boardNo = scn.nextInt();
				scn.nextLine();
				Board getBoard = boardList.searchOneBoard(boardNo);
				if (getBoard == null) {
					System.out.println("조회할 게시글이 없습니다.");
				} else {
					getBoard.getDetailInfo();
				}

			} else if (selectNo == 6) {
				System.out.println("조회할 작성자 >>> ");
				String author = scn.nextLine();
				Board[] boards = boardList.boardList();
				for (Board board : boards) {
					if (board != null) {
						Board authorPost = boardList.searchWriter(board, author);
						if (authorPost != null) {
							authorPost.getDetailInfo();
						}
					}
				}
			} else if (selectNo == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("정확한 메뉴를 선택해주세요.");
			}
		}

		System.out.println("end of program");
	}
}
