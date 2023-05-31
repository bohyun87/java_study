package ch06.sec08.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		
		// new 로 생성한 것 => 인스턴스(객체)
		//인스턴스(객체) 생성
		Calculator myCalc = new Calculator();
		
		//인스턴스명. 메소드명();
		myCalc.powerOn();
		
		int result = myCalc.plus(5, 6);
		System.out.println(result);
		
		int x = 10, y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println(result2);
		
		myCalc.powerOff();
		
		
		
		//Calculator myCalc2 = new Calculator();
		
	}

}
