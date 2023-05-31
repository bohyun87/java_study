package ch06.sec08.exam03;

public class Car {
	
	int gas;
	
	void setGas(int gas) {
		this.gas += gas; 
	}
	
	boolean isLeftGas() {
		if(gas == 0) { 
			System.out.println("gas가 없습니다.");
			return false; 
		}
		System.out.println("gas가 있습니다.");
		return true;  
	}
	
	void run() {
		while(true) {
			if(gas > 0) { 
				System.out.println("달립니다. gas잔량: " + gas);
				gas -= 1;  
			}else {  
				System.out.println("멈춥니다. gas잔량: " + gas);
				return;  
			}
			
		}
		
		
		
		
		
		
		
//		//필드생성
//		int gas;
//		
//		
//		//생성자 생략 => 컴파일 과정에서 자동으로 Car(){} 생성
//				// 중요. 생성자는 인스턴스가 생성될때 한번만 실행!
//		/*Car(int gas){
//			System.out.println("생성자 실행!");
//			this.gas = gas;
//		}*/
//		
//		
//		//메소드 생성
//				// 중요. 메소드는 여러번 실행된다. => 메소드에서 생성자 생성해줌
//		//리턴값 X
//		void setGas(int gas) {
//			this.gas += gas;   //생성자를 메소드에서 해도됨 
//			// 필드에 있는 gas => 매개변수도 gas, 필드도 gas 이기 때문에 구분을 위해 필드에 this 를 붙여줌
//		}
//		
//		//리턴값 O
//		boolean isLeftGas() {
//			if(gas == 0) { // 필드에 있는 gas => 매개변수가 없기때문에 this X
//				System.out.println("gas가 없습니다.");
//				return false;  //메소드 종료
//			}
//			System.out.println("gas가 있습니다.");
//			return true;  //메소드 종료
//		}
//		
//		//리턴값 X
//		void run() { //자동차가 달리다.(휘발유가 소모된다.)
//			while(true) {
//				if(gas > 0) {  //gas 가 있음
//					System.out.println("달립니다. gas잔량: " + gas);
//					gas -= 1;  //달리니까 소모시키기 => 1씩 소모시키기
//				}else {  //gas 가 없음
//					System.out.println("멈춥니다. gas잔량: " + gas);
//					return;  // 달리지 않으니까 프로그램 종료 => 메소드 종료
//				}
//				
//			}
	}
}
