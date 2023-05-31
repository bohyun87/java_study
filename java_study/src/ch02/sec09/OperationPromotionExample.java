package ch02.sec09;

public class OperationPromotionExample {

	public static void main(String[] args) {
		// 연산식에서 자동 타입 변환
		// ★★★★★★중요 byte, short, char 끼리 연산하면 int 로 따라간다. => int 타입에 결과값을 담아야 한다.
		byte v1 = 10;
		byte v2 = 20;
		
		int result2 = v1 + v2;  //byte 로 받아서 결과를 내주면 오류생김
		//연산식에서는 byte 끼리 연산하면 int 로 자동 인식됨
		System.out.println("result2: A" + result2);
		
		
		// ★★★★★★중요. 타입이 다양한 변수끼리 연산시 허용범위가 큰타입으로 간다. => 허용범위가 큰 타입에 결과값을 담아야 한다.
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		
		long result3 = v3 + v4 + v5;
		// 모두 다른 타입을 연산할 때는 제일 큰 범위 타입으로 담아서 변수 선언
		System.out.println("result3: " + result3);
		
		char v6 = 'A';
		char v7 = 1;
		int result4 = v6 + v7; // 둘 다 char 이지만 결과값을 char 로 담아주면 오류생김
		// (int) 로 강제변환 하거나, int 로 변수 선언해주기
		System.out.println("result4: " + result4);
		System.out.println("result4: " + (char)result4);
	
		// ★★★★★★중요 정수 연산의 결과는 정수 (연산 후 실수에 담아도 정수)
		int v8 = 10;
		int result5 = v8 / 4;    
		System.out.println("result5: " + result5);
		
		//★★★★★★중요 (첫번째 문제) 정수로 연산해서 실수로 결과 얻는 방법 => 정수(10)와 실수(4.0)를 연산한다. ( 4 -> 4.0 )
		int v9 = 10;
		double result6 = v9 / 4.0;
		System.out.println("result6: " + result6);
		
		//★★★★★★중요 (두번째 문제) 둘다 정수가 담긴 변수인데 실수 결과를 얻어야 할 때는?
		int v10 = 1;
		int v11 = 2;
		double result7 = (double) v10 / v11; // 강제타입변환 전에는 0.0 으로 출력됨  => v10 이 실수로 바뀜
		// XXXXX (double) (v10 / v11); XXXXXX  => v10 / v11 의 연산값이 실수로 바뀌는데 이미 연산결과가 정수이므로 실수로 바뀌지 않음
		System.out.println("result7: " + result7);
		
	}

}
