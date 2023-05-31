package ch08.sec02;

public interface RemoteControl {
	//인터페이스는 상수 + 추상메소드 => 불완전하다. => 상속만을 위해서 쓰인다.
	
	
	//상수 => 인터페이스는 public static final을 붙이지 않아도 모든 필드를 상수로 인식한다.
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	
	//메소드: 선언부 + 구현부
	//추상메소드 => 구현부는 없어도 된다.
	public void turnOn();	
	public void turnOff();
	public void setVolume(int volume);
	
	
	//디폴트 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리 합니다.");
			setVolume(MIN_VOLUME);   //추상메소드 구현부가 없어도 호출해서 사용가
		} else {
			System.out.println("무음 해제 합니다.");		
		}
	}
	
	//정적메소드 => 무조건 구현부가 있어야 한다.
	static void changeBattery() {
		System.out.println("리모컨 건전지를 교환합니다.");
	}
	
}
