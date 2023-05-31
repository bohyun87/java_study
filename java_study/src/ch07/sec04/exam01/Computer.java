package ch07.sec04.exam01;

public class Computer extends Calculator{

	//메소드 오버라이딩: 타입, 이름, 매개변수는 다 같고 내부 실행코드는 다르다.
	// @ Override 자동생성 방법 => 마우스 우클릭 -> 소스 -> Override
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r ;
	}

	
	
	
}
