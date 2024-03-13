package quiz;

import java.util.Scanner;

public class Account_my {
	String name;
	String accNum;
	String pw;
	int deposit;
	int interest;
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		while(true) {
			String menu = scan.next();
			menu = menu.toLowerCase();
		
			System.out.println("메뉴를 입력하세요.");
			System.out.println("(I)nsert, (W)ithdraw, (P)revious");

			switch(menu.charAt(0)) {
			case 'ㅑ':
				break;
		}
		}
	}
	public void insertDeposit() {
		System.out.println("Hello World!");
	}
	public void withdraw() {
		System.out.println("Hello World!");
	}
	public void previous() {
		System.out.println("Hello World!");
	}
}
