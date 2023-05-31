package ch04.sec06;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		//do while
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
	
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scanner.nextLine();
		
		} while(!inputString.equals("q")); // 입력된 내용이 q가 아니면 whlie 문 반복실행
		
		System.out.println("프로그램 종료");
		
	}

}
