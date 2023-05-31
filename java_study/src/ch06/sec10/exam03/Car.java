package ch06.sec10.exam03;

public class Car {
	/*★★★★★★★★★★★★★★★★★★★★★★★★★★★
	 * 인스턴스 필드와 스타틱 필드 차이점
	 스타틱필드는 전역변수, 인스턴스필드는 지역변수 개념
	 스타틱필드의 값은 전체 클래스에서 공유가 가능하다.
	 그러나 인스턴스필드는 인스턴스 내에서 선언한 값이 공유되고,
	 다른 인스턴스 내의 값은 공유하지 않는다. 
	 *메모리 구조에서 static변수 ppt 참조*
	 ★★★★★★★★★★★★★★★★★★★★★★★★★★★★*/
	
	
	
	//인스턴스 필드
	int speed;
	
	//정적 필드
	static int gas;
	
	
	//인스턴스 메소드 (static 이 없는 메소드)
	// 인스턴스 메소드에서는 인스턴스 필드, 정적필드 다 사용할 수 있다.
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	// 인스턴스 메소드에서는 인스턴스 메소드, 정적메소드 다 사용할 수 있다.
	void run2() {
		System.out.println(speed + "으로 달립니다.");
		run();  //인스턴스 메소드
	}
	
	//정적(static) 메소드
	static void simulatr() {
		
		//인스턴스 맴버를 사용하기 위해서는 객체를 생성해서 사용해야 한다.
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
		
	}
	
	static void simulatr2() {
		
		//정적 메소드에서는 정적필드, 정적 메소드만 사용가능
		System.out.println("가스량: " + gas);
		
	}
		
	
	
	//main 메소드 => 자바에서 맨 먼저 호출하는 메소드
	//리턴 타입이 없는 정적 메소드
			  //리턴값 X //정적메소드
	public static void main(String[] args) {
		//main 메소드는 정적(static) 메소드이기 때문에 인스턴스를 생성해서 사용한것
		Car myCar = new Car();
		myCar.speed = 100;
		myCar.run();
		
		System.out.println(gas);
		simulatr2();   // Car.simulatr2() => 같은 클래스 내에 있기 때문에 클래스명 생략 가능.
	
		
	}

	
	
	
	/*
	
	//인스턴스 필드
		int speed;
		
		//정적 필드
		static int gas;
		
		
		//인스턴스 메소드 (static 이 없는 메소드)
		// 인스턴스 메소드에서는 인스턴스 필드, 정적필드 다 사용할 수 있다.
		void run() {
			System.out.println(speed + "으로 달립니다.");
			//System.out.println("가스량: " + gas);
		}
		
		// 인스턴스 메소드에서는 인스턴스 메소드, 정적메소드 다 사용할 수 있다.
		void run2() {
			System.out.println(speed + "으로 달립니다.");
			//System.out.println("가스량: " + gas);
			run();  //인스턴스 메소드
			//simulatr();  //정적메소드
		}
		
		//정적(static) 메소드
		static void simulatr() {
			//정적 메소드에서는 인스턴스 필드를 사용할 수 없다.
			//System.out.println(speed + "으로 달립니다.");
			
			//정적 메소드에서 정적 필드는 사용가능
			//System.out.println("가스량: " + gas);
			
			//정적 메소드에서 인스턴스 메소드를 사용할 수 없다.
			//run();	
			
			//인스턴스 맴버를 사용하기 위해서는 객체를 생성해서 사용해야 한다.
			Car myCar = new Car();
			myCar.speed = 60;
			myCar.run();
			
		}
		
		static void simulatr2() {
			
			//정적 메소드에서는 정적필드, 정적 메소드만 사용가능
			System.out.println("가스량: " + gas);
			//simulatr();
			
		}
			
		
		
		//main 메소드 => 자바에서 맨 먼저 호출하는 메소드
		//리턴 타입이 없는 정적 메소드
				  //리턴값 X //정적메소드
		public static void main(String[] args) {
			//main 메소드는 정적(static) 메소드이기 때문에 인스턴스를 생성해서 사용한것
			Car myCar = new Car();
			myCar.speed = 100;
			myCar.run();
			
			System.out.println(gas);
			simulatr2();   // Car.simulatr2() => 같은 클래스 내에 있기 때문에 클래스명 생략 가능.
		
			
		} */
}
