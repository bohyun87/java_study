package Quiz04;

import java.util.Scanner;

public class num10 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0; // 계좌
		Scanner scanner = new Scanner(System.in);

		while (run) {

			System.out.println("===========================");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("===========================");

			// 사용자에게 입력을 받는다.
			System.out.println("선택 > ");

			// 입력받은 값을 menuNum에 넣어준다.
			int menuNum = scanner.nextInt();

			switch (menuNum) {
			case 1:
				System.out.println("예금액 > ");
				balance += scanner.nextInt();  // 이전 입금액이 초기화 되면 안되므로 누적합산
				break;

			case 2:
				System.out.println("출금액 > ");
				balance -= scanner.nextInt();  // 이전 출금액이 초기화 되면 안되므로 누적합산
				break;

			case 3:
				System.out.println("잔고 > ");
				System.out.println(balance);
				break;

			case 4:  //종료
				run = false;
				break;

			}
			System.out.println();
		}
		
		// while 문 끝나는 시점
		System.out.println("프로그램 종료");

	}

}
