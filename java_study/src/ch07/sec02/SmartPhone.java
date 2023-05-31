package ch07.sec02;
		// SmartPhone 자식이 되고 Phone 이 부모가 됨
public class SmartPhone extends Phone {
	//필드
	public boolean wifi;
	
	//생성자
	// 중요. 상속을 받으면 자식클래스에서 부모클래스에 있는 필드에 접근할 수 있다.
	// 2)
	public SmartPhone(String model, String color) {
		// 출력 ① - 부모태그에 있는 System.out.println("Phone(String model, String color) 생성자 실행");
		super(model, color);  //부모클래스에 있는 생성자 실행
		// 출력 ②
		System.out.println("SmartPhone(String model, String color)");
	}
	
	//메소드
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결했습니다.");
	}

}
