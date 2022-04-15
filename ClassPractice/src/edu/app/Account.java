package edu.app;

public class Account {
	
	// 필드: 계좌번호, 예금주, 잔액
	private String accNum;
	private String accName; 
	private int balance;
	private final static String manageID = "manager";
	private final static String managePW = "12345";
	
	// 생성자: 
	Account(String accNum, String accName, int balance) {
		this.accNum = accNum;
		this.accName = accName;
		this.balance = balance;
	}
	
	// Getter, Setter
	
	public String getAccNum() {
		return accNum;
	}

	public String getAccName() {
		return accName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public static String getManageID() {
		return manageID;
	}
	
	public static String getManagePW() {
		return managePW;
	}
	
	// Info
	public void accInfo() {
		System.out.println();
		System.out.println("___________________________________________");
		System.out.println("예금주: " + accName + "  계좌번호: " + accNum + "  잔고: " + balance);
		System.out.println("___________________________________________");
	}
	
	

}
