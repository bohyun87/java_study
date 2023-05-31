package ch04.sec02;

public class IfNestedExample {

	public static void main(String[] args) {
		// 중첩 if 문
		
//		double score = Math.random();   // 0.0 ~ 1.0 사이의 숫자를 만들어 준다.  // random 자체는 실수로 나옴
//		System.out.println(score);
		
		// 정수로 만드는 공식 : int num = (int)(Math.random() * n ) + start;
		// n: 정수의 갯수, start: 시작 숫자 
		
		
		// 로또 번호 (1부터 45개의 정수를 만든다) => 1~45까지 만든다.
		/* int score = (int) (Math.random() * 45 ) + 1;  
		System.out.println(score); */
		
		// 81부터 20개의 정수를 만든다.  => 81~100까지 만든다.
		int score = (int)(Math.random() * 20) + 81;
		String grade;
		// ↑ 파일명 만들때 많이 사용
		
		if (score >= 90) {
			if (score >= 95) grade = "A+";
			else grade = "A";
		} else {
			if (score >= 85) grade = "B+";
			else grade = "B";
		}

		System.out.println("학점: " + grade + ", 점수: " + score);
		
	}

}
