package ch03.sec11;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		//삼항연산자
		int score = 65;
		
		//  ? 는  = , : 는 else
		char grade = (score > 90) ? 'A': ((score>80) ? 'B': 'c');
		System.out.println(score + "점은" + grade + "등급입니다.");
		
	}

}	
