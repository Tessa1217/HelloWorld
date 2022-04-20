package edu.dao;

public class OracleDAO implements DAO {

	@Override
	public void insert() {
		System.out.println("Oracle 입력 처리");
	}

	@Override
	public void update() {
		System.out.println("Oracle 수정 처리");
	}

	@Override
	public void delete() {
		System.out.println("Oracle 삭제 처리");
	}

	@Override
	public void list() {
		System.out.println("Oracle 전체 리스트 출력");
	}

}
