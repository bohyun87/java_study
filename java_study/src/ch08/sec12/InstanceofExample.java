package ch08.sec12;

public class InstanceofExample {

	public static void main(String[] args) {
		
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
	
		ride(taxi);
		System.out.println();
		ride(bus);
		
	}
	
	public static void ride(Vehicle vehicle) {
		// vehicle 객체가 Bus 객체를 참조하는가? = 자동타입변화이 되었는가?
		if(vehicle instanceof Bus) {
			
			// ture  이면 강제타입변환 시키기
			//(자식객체가 부모객체를 참조하는것)
			Bus bus = (Bus)vehicle;
			
			//자식 클래스에 있는 고유의 메소드, 필드 사용가능
			bus.checkFare();
		}
		
		vehicle.run();
		// new Taxi(); 는 if문에서 거짓이므로 바로 vehicle.run(); 실행
		// new Bus();는  if문에서 참이므로 if문을 돌고 빠져나옴
	}

}
