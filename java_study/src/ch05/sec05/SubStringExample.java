package ch05.sec05;

public class SubStringExample {

	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		//주민번호 앞자리 출력   //substring(시작 인덱스, 끝인덱스)
		String firstNum = ssn.substring(0, 6); // 끝 인덱스 번호 직전까지 출력
		System.out.println(firstNum);
		
		//주민번호 뒷자리 출력	 //substring(시작인덱스) => 시작인덱스부터 문자열 끝까지
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}

}
	