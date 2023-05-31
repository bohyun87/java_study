package ch09.sec07.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		car.run1();
		System.out.println();
		car.run2();
		System.out.println();
		
		car.run3(new Tire()) {
			@Override
			public void roll() {
				System.out.println("한국타이어가 굴러갑니다.");
			}
		}
		tire.roll();
		
	}

}
