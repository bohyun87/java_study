package ch06.sec10.exam01;

public class CalculrtorExample {

	public static void main(String[] args) {
		Calculator.pi = 4;
		int result2 = Calculator.minus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		//객체는 각각 다르지만 static이 붙은 필드는 각 객체에서 공유해서 사용한다.
		//객체는 각각 다르지만 static 이 붙은 메소드는 각 객체에서 공유해서 사용한다.
		Calculator myCalc1 = new Calculator();
		System.out.println("myCalc1.pi: " + Calculator.pi);
		//정적멤버는 클래스명.필드
		
		Calculator myCalc2 = new Calculator();
		System.out.println("myCalc2.pi: " + Calculator.pi);
		
		Calculator myCalc3      = new Calculator();
		System.out.println("myCalc3.pi: " + Calculator.pi);
	}

}
