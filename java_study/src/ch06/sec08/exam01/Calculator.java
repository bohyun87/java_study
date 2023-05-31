package ch06.sec08.exam01;


	// 설계도 라고 생각하면 됨
public class Calculator {
	// 필드는 있어도 그만 없어도 그만
	// 생성자: 컴파일 과정에서 디폴트 생성자가 붙는다. => Calculator(){}

	//★★★★★★★★★중요!!!!!!!!!.  객체 = 속성(필드) + 기능(메소드)	
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x / y;  // => x 를 실수로 강제변환
		return result;
	}

}
