package edu.Constructor;

public class BoardList {
	private Board[] boards;

	// 배열 크기 초기화
	public void init(int size) {
		boards = new Board[size];
	}

	// 배열에 한 건 입력
	public int addBoard(Board board) { // 매개 변수로 클래스 타입이 올 수도 있음
		// 더 이상 저장할 공간이 없을 때.. false
		// error case = 저장공간이 없음, 중복값이 있음, 정상적 처리
		int errorCase = -1;
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBoardNo() == board.getBoardNo()) {
				errorCase = 1;
				break;
			}
			if (boards[i] == null) {
				boards[i] = board;
				errorCase = 0;
				break;
			}
		}
		return errorCase;
	}

	// 수정: 게시글 번호로 한 건 찾아서 내용, 제목 수정
	public boolean modifyBoard(Board board) { // 매개 변수로 해당 게시물을 찾으면
		boolean check = false;
		for (int i = 0; i < boards.length; i++) {
			// 매개 변수로 받아온 board의 게시글 번호와 일치하는 boards 항목의 (id = boardNo)
			if (boards[i].getBoardNo() == board.getBoardNo()) {
				// 제목을 board의 제목으로 수정
				boards[i].setTitle(board.getTitle());
				// 내용을 board의 내용으로 수정
				boards[i].setContent(board.getContent());
				check = true;
			}
		}
		return check;
	}

	// 삭제: 게시글 번호로 한 건 찾아서 해당 내용 삭제
	public int deleteBoard(int boardNo) {
		int errorcase = -1;
		for (int i = 0; i < boards.length; i++) {
			if (boards[i].getBoardNo() == boardNo) {
				boards[i] = null;
				errorcase = 0;
				break;
			}
		}
		return errorcase;
	}

	// 한 건 조회 (조회할 때마다 조회수 1씩 증가)
	public Board searchOneBoard(int boardNo) {
		for (Board board : boards) {
			if (board.getBoardNo() == boardNo) {
				int currentCnt = board.getSearchCnt();
				board.setSearchCnt(++currentCnt);
				return board;
			}
		}
		return null;
	}

	// 작성자 조회
	public Board searchWriter(Board board, String author) {
		if (board.getAuthor().equals(author)) {
			return board;
		} else {
			return null;
		}
	}

	// 게시글 목록
	public Board[] boardList() {
		return boards;
	}
}
