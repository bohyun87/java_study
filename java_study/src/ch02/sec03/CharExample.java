package ch02.sec03;

public class CharExample {

	public static void main(String[] args) {
		char c1 = 'A';  // char 는 "" 사용 안됨  // 문자로 저장
		char c2 = 65;	// 유니코드를 직접 저장 => 'A'의 유니코드
		
		char c3 = '가';
		char c4 = 44032; // 유니코드는 직접 저장 => '가' 의 유니코드
		
		//char c5 = '';  // 공백 => 오류남
		char c6 = ' '; // 공백 => 한 칸 띄우기 => 유니코드: 32

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c6);
		
	}

}
