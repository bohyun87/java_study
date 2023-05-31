package ch08.sec10.exam02;

public class CastingExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();  //자동타입변환
		vehicle.run();
		//부모인터페이트의 메소드를 자식클래서스에서 받아서 오버라이드 된 메소드가 실행된다.
		
		//자동타입변화의 문제: 자식클래스에 고유의 메소드는 접근 할 수 없음
		//오버라이드 된 메소드만 접근 할 수 있음
		//자식 클래스 고유의 메소드와 필드를 실행 하기 위해서는 강제타입변화을 해야한다.
				  //타입
		Bus bus = (Bus)vehicle;
		bus.run();  //자식클래스에 오버라이드 된 메소드 실행
		bus.checkFare();  //자식클래스 고유 메소드 실행
	}

}
