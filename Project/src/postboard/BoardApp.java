package postboard;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class BoardApp implements BoardService {

	static ArrayList<Board> boards = new ArrayList<Board>();
	Scanner scn = new Scanner(System.in);

	static int boardNum = 1;
	SimpleDateFormat sdf = new SimpleDateFormat("MM월 dd일 hh시 mm분");
	int idx = UserApp.userIdx;

	public void execute() {

		while (UserApp.check = true) {
			System.out.println(
					"=============================================================================================");
			System.out.println("1. 글등록 | 2. 글수정 | 3. 글삭제 | 4. 상세보기 | 5. 작성자 글조회 | 6. 전체리스트 | 7. 내 계정 페이지");
			System.out.println(
					"=============================================================================================");
			System.out.println("선택 >>> ");

			int menu = 0;
			try {
				menu = Integer.parseInt(scn.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("* Error: 숫자를 입력해주세요 *");
			}

			if (menu == BoardService.ADD) {
				System.out.println("제목 >>> ");
				String title = scn.nextLine();
				String content = addContent();
				Date now = new Date();
				String date = sdf.format(now);
				String author = UserApp.users.get(idx).getUserName();

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
				System.out.println("상세 조회 게시글 번호 >>> ");
				int boardNo = Integer.parseInt(scn.nextLine());
				detail(boardNo);

			} else if (menu == BoardService.AUTHLIST) {
				System.out.println("조회할 작성자 >>> ");
				String author = scn.nextLine();
				srchAuthor(author);

			} else if (menu == BoardService.LIST) {
				list();

			} else if (menu == BoardService.ACCOUNT) {
				Exe.main(null);
			} else {
				System.out.println("다시 선택해주세요.");
			}
		}

	}

	@Override
	public void add(Board board) {
		boards.add(board);
		System.out.println("게시글이 등록되었습니다.");

	}

	public String addContent() {
		System.out.println("내용 >>> ");
		String content = "";
		while (true) {
			String temp = scn.nextLine();
			if (temp.equals("")) {
				break;
			}
			content += temp + "\n";
		}
		return content;
	}

	@Override
	public void modify(int boardNo) {
		String author = UserApp.users.get(idx).getUserName();
		for (int i = 0; i < boards.size(); i++) {
			if (boards.get(i).getBoardNo() == boardNo) {
				boolean authority = authorize(author);
				if (authority == true) {
					System.out.println("수정할 제목 >>> ");
					String title = scn.nextLine();
					boards.get(i).setTitle(title);
					String content = addContent();
					boards.get(i).setContent(content);
					Date now = new Date();
					String date = sdf.format(now);
					boards.get(i).setDate(date);
					System.out.println("수정이 정상적으로 완료되었습니다.");
				} else if (authority == false) {
					System.out.println("수정할 권한이 없습니다.");
				}
			}
		}

	}

	public boolean authorize(String author) {
		boolean authority = false;
		for (Board board : boards) {
			if (board.getAuthor().equals(author)) {
				authority = true;
				break;
			}
		}
		return authority;
	}

	@Override
	public void delete(int boardNo) {
		String author = UserApp.users.get(idx).getUserName();
		for (int i = 0; i < boards.size(); i++) {
			if (boards.get(i).getBoardNo() == boardNo) {
				boolean authority = authorize(author);
				if (authority == true) {
					boards.remove(i);
				} else if (authority == false) {
					System.out.println("삭제 권한이 없습니다.");
					break;
				}
			}
		}
	}

	@Override
	public void detail(int boardNo) {
		for (Board board : boards) {
			if (board.getBoardNo() == boardNo) {
				System.out.println("============================================");
				System.out.println(board.detailView());
				System.out.println("============================================");
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
			System.out.println("----------------------------------------------------------------------------");
			System.out.println(board.toString());
			System.out.println("----------------------------------------------------------------------------");
		}
	}
}
