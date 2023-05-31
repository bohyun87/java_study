pckage ch06.sec08.exam03;

public class CarExample {

	public static void main(String[] args) {
	
		Car myCar = new Car();
		
			
		//LeftGas 로 남은 량 구하기 
		
		myCar.setGas(5);
		
		if(myCar.isLeftGas()) {
			
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		System.out.println("gas를 주입하세요.");
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		public static void main(String[] args) {
//			//인스턴스 생성
//			Car myCar = new Car();
//			
//			/*
//			myCar.setGas(5);
//			System.out.println("휘발유량 :" + myCar.gas);
//			
//			myCar.setGas(10);
//			System.out.println("휘발유량 :" + myCar.gas);
//			*/
//			
//			
//			//LeftGas 로 남은 량 구하기 
//			//휘발유 넣어줌
//			myCar.setGas(5);
//			
//			if(myCar.isLeftGas()) {
//				//가스가 있을 때 
//				System.out.println("출발합니다.");
//				myCar.run();
//			}
//			// myCar.run()을  실행 후 gas 잔량 0 이 되고, 프로그램 종료가 되면 ↓ 실행
//			System.out.println("gas를 주입하세요.");
		
		
		
		
	}

}
