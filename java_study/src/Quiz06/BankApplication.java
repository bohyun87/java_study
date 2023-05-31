package Quiz06;

import java.util.Scanner;

public class BankApplication {
	// static필드

	// 계좌객체를 저장할 수 있는 배열(디폴트 값: null)
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;

		while (run) {
			System.out.println("------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------");
			System.out.print("선택> ");
			int selectNo = scanner.nextInt();

			switch (selectNo) {
			case 1:
				// 계좌생성 => 기능은 메소드로 구현 가능
				createAccount();
				break;
			case 2:
				// 계좌목록 보여주기
				accountList();
				break;
			case 3:
				// 예금기능 실행
				deposit();
				break;
			case 4:
				// 출금기능 실행
				withdraw();
				break;
			case 5:
				// 종료기능 실행
				run = false;
				break;

			default:
				System.out.println("1~5사이의 숫자를 입력하세요.");
				break;
			}
		}

		System.out.println("프로그램 종료");

	}

	// private: 아래에서만 실행 할 거라서
	// static: 스위치에서만 호출 할거라서

	// 계좌 생성하기
	private static void createAccount() {
		System.out.println("-----------");
		System.out.println("계좌생성");
		System.out.println("-----------");

		System.out.println("계좌번호"); // String 타입으로 입력을 받는다.
		String ano = scanner.next();

		System.out.println("계좌주"); // String 타입으로 입력을 받는다.
		String owner = scanner.next();

		System.out.println("초기입금액");
		int balance = scanner.nextInt(); // int 타입으로 입력을 받는다.

		// System.out.println(ano);
		// System.out.println(owner);
		// System.out.println(balance);

		// 계좌생성
		Account newAccount = new Account(ano, owner, balance);

		/*
		 * 참고: String이 참조 타입이기 때문에 아래와 가팅 사용하는 것 처럼 Acccount도 참조 타입이다. String[] arr =
		 * {"a", "b"}; for(String a : arr) { System.out.println(a); }
		 */

		// ★★★★★ 중요. 배열안에 객체를 넣는다.
		for (int i = 0; i < accountArray.length; i++) {
			// accountArray[0]에만 계좌객체가 저장되므로 아래와 같이 처리한다.

			if (accountArray[i] == null) {
				accountArray[i] = newAccount; // 생성한 계좌객체를 배열에 넣어준다.
				System.out.println("결과: 계좌가 생성되었습니다.");
				break; // 계좌를 생성하면 for문을 나온다.
			}
		}

		// 계좌가 잘 생성이 되었나 확인(객체이므로 주소가 찍힌다.
		/*
		 * for(Account account : accountArray) { // 객체의 주소 System.out.println(account);
		 * }
		 */

	}

	// 계좌목록 보여주기
	private static void accountList() {
		System.out.println("-----------");
		System.out.println("계좌목록");
		System.out.println("-----------");

		for (int i = 0; i < accountArray.length; i++) { //== for(Account account : accountArray){}
			Account account = accountArray[i];
			// 배열이 null값일 때 실행하는 걸 방지하기 위해서
			if (account != null) {
				//private 는 get메소드로 가져온
				System.out.println(account.getAno() + " " + account.getOwner() + " " + account.getBalance());
			}

		}

	}
	
	//계좌찾기 메소드
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i = 0; i < accountArray.length; i++) { //== for(Account account : accountArray){}
			if(accountArray[i] != null) {
				String dbAno = accountArray[i].getAno();
				if(dbAno.equals(ano)) {
					//여기서 return 을 하면 안되므로 아래와 같이 찾은 계좌를 넣어준다.
					account = accountArray[i];
					break;
				}
			}
		}
		//for 문 밖에 return
		return account;  //찾은 계좌가 들어있음
	}

	
	
	// 예금하기
	private static void deposit() {
		System.out.println("-----------");
		System.out.println("예금");
		System.out.println("-----------");
		System.out.print("계좌번호 > ");
		String ano = scanner.next();  //String 타입으로 입력
		System.out.print("예금액을 입력하세요. > ");
		int money = scanner.nextInt();  //int 타입으로 입력
		
		//입력한 계좌 찾아주기
		//리턴해 주는 값을 같은 타입인 Account 로 받는다.
		//account 변수에는 찾은 계좌가 들어있다.
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;  //메소드를 끝낸다.
		} 
		account.setBalance(account.getBalance() + money);
		System.out.println("결과: 입금이 성공되었습니다.");
	}

	
	// 출금하기
	private static void withdraw() {
		System.out.println("-----------");
		System.out.println("출금");
		System.out.println("-----------");
		System.out.print("계좌번호 > ");
		String ano = scanner.next();
		System.out.print("출금액을 입력하세요. > ");
		int money = scanner.nextInt();
		
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		
		account.setBalance(account.getBalance() - money);
		System.out.println("결과: 출금이 성공되었습니다.");
	}

}
