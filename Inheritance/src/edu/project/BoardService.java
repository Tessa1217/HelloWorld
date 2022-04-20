package edu.project;

public interface BoardService {

	int ADD = 1;
	int MOD = 2;
	int DEL = 3;
	int DETAIL = 4;
	int AUTHLIST = 5;
	int LIST = 6;
	int END = 7;

	public void add(Board board);

	public void modify(int boardNo);

	public void delete(int boardNo);

	public void detail(int boardNo);

	public void srchAuthor(String author);

	public void list();

}
