package ch07.sec08.exam02;

public class Driver {
	//메소드 : Vehicle 타입의 매개변수를 가지고 있다.
	//메소드의 매개변수로 다형성을 구현한다.(다형성: 갈아끼우기)
	public void drive(Vehicle vehicle) {
		// => DriverExample 클래스에서
		// Bus bus = new Bus(); => driver.drive(bus);
		// => Vehicle vehicle = new Bus();
		vehicle.run();
		
	}
}
