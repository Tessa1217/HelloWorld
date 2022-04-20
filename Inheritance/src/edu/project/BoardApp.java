package edu.project;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BoardApp implements BoardService {

	ArrayList<Board> boards = new ArrayList<Board>();
	Scanner scn = new Scanner(System.in);

	int boardNum = 1;

	public void execute() {

		while (true) {

			System.out.println("1. 글등록 | 2. 글수정 | 3. 글삭제 | 4. 글상세조회(글번호) | 5. 작성자 글조회 | 6. 전체리스트 | 7. 종료");
			System.out.println("선택 >>> ");
			int menu = 0;
			try {
				menu = Integer.parseInt(scn.nextLine());
			} catch (InputMismatchException e) {
				System.out.println("* Error: 숫자를 입력해주세요 *");
			}

			if (menu == BoardService.ADD) {
				System.out.println("제목 >>> ");
				String title = scn.nextLine();
				System.out.println("내용 >>> ");
				String content = "";
				while (true) {
					String temp = scn.nextLine();
					if (temp.equals("")) {
						break;
					}
					content += temp + "\n";
				}
				System.out.println("작성자 >>> ");
				String author = scn.nextLine();

				Date now = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("MM월 dd일 hh시 mm분");
				String date = sdf.format(now);

				Board board = new Board(boardNum++, title, content, author, date);

				add(board);

			} else if (menu == BoardService.MOD) {

				System.out.println("수정할 게시글 번호 >>> ");
				int boardNo = Integer.parseInt(scn.nextLine());
				modify(boardNo);

			} else if (menu == BoardService.DEL) {
				System.out.println("삭제할 게시글 번호 >>> ");
				int boardNo = Integer.parseInt(scn.nextLine());
				delete(boardNo);

			} else if (menu == BoardService.DETAIL) {
				System.out.println("상제조회 게시글 번호 >>> ");
				int boardNo = Integer.parseInt(scn.nextLine());
				detail(boardNo);

			} else if (menu == BoardService.AUTHLIST) {
				System.out.println("조회할 작성자 >>> ");
				String author = scn.nextLine();
				srchAuthor(author);

			} else if (menu == BoardService.LIST) {
				list();

			} else if (menu == BoardService.END) {
				break;

			} else {
				System.out.println("다시 선택해주세요.");
			}
		}

	}

	@Override
	public void add(Board board) {
		boards.add(board);
		System.out.println("게시글이 정상적으로 등록되었습니다.");
	}

	@Override
	public void modify(int boardNo) {

		for (int i = 0; i < boards.size(); i++) {
			if (boards.get(i).getBoardNo() == boardNo) {
				System.out.println("수정할 제목 >>> ");
				String title = scn.nextLine();
				boards.get(i).setTitle(title);
				System.out.println("수정할 내용 >>> ");
				String content = "";
				while (true) {
					String temp = scn.nextLine();
					if (temp.trim().equals("")) {
						break;
					}
					content += temp + "\n";
				}
				boards.get(i).setContent(content);
				Date now = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
				String date = sdf.format(now);
				boards.get(i).setDate(date);
				System.out.println("수정이 정상적으로 완료되었습니다. ");

			}
		}

	}

	@Override
	public void delete(int boardNo) {

		for (int i = 0; i < boards.size(); i++) {
			if (boards.get(i).getBoardNo() == boardNo) {
				boards.remove(i);
				System.out.println("삭제가 정상적으로 완료되었습니다.");
			}

		}

	}

	@Override
	public void detail(int boardNo) {

		for (int i = 0; i < boards.size(); i++) {
			if (boards.get(i).getBoardNo() == boardNo) {
				System.out.println("================================");
				System.out.println(boards.get(i).detailView());
				System.out.println("================================");
			}
		}

	}

	@Override
	public void srchAuthor(String author) {
		int cnt = 0;
		for (Board board : boards) {
			if (board.getAuthor().equals(author)) {
				System.out.println(board.toString());
				cnt++;
			}
		}
		System.out.println(author + "의 총 작성 건수: " + cnt);

	}

	@Override
	public void list() {
		for (Board board : boards) {
			System.out.println("-------------------------------------------------------------------");
			System.out.println(board.toString());
			System.out.println("-------------------------------------------------------------------");
		}
	}

}
