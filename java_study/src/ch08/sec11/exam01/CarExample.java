package ch08.sec11.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car mycar = new Car();
		mycar.run();
		
		//다형성 특징: 갈아끼우기가 가능하다
		mycar.tire1 = new KumhoTire();
		mycar.tire2 = new KumhoTire();
		
		mycar.run();
	}

}
