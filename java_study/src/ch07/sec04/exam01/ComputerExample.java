package ch07.sec04.exam01;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;
		
		//부모클래스 메소드 값 출력
		Calculator calculator = new Calculator();
		System.out.println("원 면적: " + calculator.areaCircle(r));

		System.out.println("=====================================");
		//자식클래스 메소드 값 출력
		//중요. 메소드 오버라이딩이 되었다면 자식클래스의 메소드가 우선적으로 사용된다.
		Calculator computer = new Calculator();
		System.out.println("원 면적: " + computer.areaCircle(r));
	}

}
