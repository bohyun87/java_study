package ch08.sec08;

public class MultiInterfaceImplExample {

	public static void main(String[] args) {
		RomoteControl rc = new SmartTelevision();
		//다중상속 할 때는 RomoteControl 에 선언된 메소드만 사용가능
		rc.turnOn();
		rc.turnOff();
		
		
		Searchable searchable = new SmartTelevision();
		//다중상속 할 때는 Searchable 에 선언된 메소드만 사용가능
		searchable.search("https://www.naver.com");
	}

}
