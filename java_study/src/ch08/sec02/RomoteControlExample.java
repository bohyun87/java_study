package ch08.sec02;

public class RomoteControlExample {

	public static void main(String[] args) 	{
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.setVolume(5); // =>Television(); this.volume 으로 설정해야 MAX, MIN 범위를 벗어나도 0~10사이를 찍음
		
		//디폴트 메소드 호출  => RemoteControl 클래스
		rc.setMute(true);  // 실행된 후 setVolume 이 실행됨
		rc.setMute(false);
			
		rc.turnOff();
				
		System.out.println("=======================");
		
		RemoteControl ac = new Audio();
		ac.turnOn();
		ac.setVolume(5); // =>Audio(); this.volume 으로 설정해야 MAX, MIN 범위를 벗어나도 0~10사이를 찍음
		
		
		// 디폴트 메소드 오버라이딩 메소드 호출 => Audio 클래스
		ac.setMute(true);  //audio 오버라이딩 메소드 호출
		ac.setMute(false);
				
		ac.turnOff();
		
		
		//정적메소드 호출 => 클래서명.필드명
		RemoteControl.changeBattery();
		
		
		
		//상수 => 클래스명.필드명
		/*
		System.out.println(RemoteControl.MAX_VOLUME);
		System.out.println(RemoteControl.MIN_VOLUME);
		*/
		
		
		
		/* 
		-공통점 : 다형성
		-차이점
		일반 class끼리 상속 - 추상메소드를 사용못함
		abstract 상속  - 추상메소드를 사용가능
		interface 상속
		*/
		
	}
	

}
