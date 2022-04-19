package edu.project;

public class MySqlDAO implements DAO {

	@Override
	public void insert() {
		System.out.println("MySQL 입력 처리");
	}

	@Override
	public void update() {
		System.out.println("MySQL 수정 처리");
	}

	@Override
	public void delete() {
		System.out.println("MySQL 삭제 처리");
	}

	@Override
	public void list() {
		System.out.println("MySQL 전체 리스트 출력");
	}

}
