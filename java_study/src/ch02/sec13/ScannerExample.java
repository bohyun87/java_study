package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// 키보드 입력 데이터를 변수에 저장
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		System.out.println("x값 입력:");
		String strX = scanner.nextLine();  // import java.util.Scanner;  => package 아래에 생김 
		// => 문자형으로 입력받음
		int x = Integer.parseInt(strX);  // 문자형 => 숫자형으로 변환
		
		//System.out.println("x: " + x);
		
		
		System.out.println("y값 입력:");
		String strY = scanner.nextLine();  // import java.util.Scanner;  => package 아래에 생김 
		// => 문자형으로 입력받음
		int y = Integer.parseInt(strY);  // 문자형 => 숫자형으로 변환
		
		//System.out.println("y: " + y);
		
		int result = x + y;
		System.out.println("x + y = " + result);
		*/
		
		//무한반복
		while(true) {
			System.out.println("입력 문자열: ");
			String data = scanner.nextLine();
			
			//자바에서 문자열을 비교할 때는 equals 를 이용해 비교한다.  // 숫자열은 == 으로 비교해도 됨
			if(data.equals("q")) {   //data == "q"
				break;  // 계속된 반복을 중지하기 위함
			}
			
			System.out.println("출력 문자열: " + data);
		}
		
		System.out.println("종료");
	}

}
