package ch03.sec04;

public class Accuracyexample {

	public static void main(String[] args) {
		// 정확한 계산은 정수 연산으로
		
		int apple = 1;  //사과 1조각
		// double pieceUnit = 0.1;  // 10분의 1 조각으로 쪼개기
		int totalPiece = apple * 10;
		int number = 7;
		
		int result = totalPiece - number;  // 10 - 7 = 3
		System.out.println("사과 1개에서 남은양: " + result/10.0);
	}

}
