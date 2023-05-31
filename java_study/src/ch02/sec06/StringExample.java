package ch02.sec06;

public class StringExample {

	public static void main(String[] args) {
		String name = "홍길동";
		
		String str = "나는 \"자바\"를 배웁니다.";  // "" 안에  ""를 사용할 때 \" 문자\" 이렇게 사용
		System.out.println(str);
		
		str = "번호\t이름\t직업";  // tab 기능 : 간격 띄우기
		System.out.println(str);
		
		str = "나는 \n자바\n를 배웁니다."; // 줄바꿈
		System.out.println(str);
		
		String result = name + str;  // 문자열 합산
		System.out.println(result); 
		
		String result1 = name + 1;  // 문자열 합산  => 문자열이 1개라도 있으면 숫자도 문자열로 인식해서 합산
		System.out.println(result1); 
				
		String num1 = "1";  // 문자
		String num2 = "3";  // 문자
		int a = 10;
		System.out.println(num1 + num2);
		System.out.println(num1 + a);  // 110 처럼 인식 되지만  "1" + 10  합산
		
	}

}
