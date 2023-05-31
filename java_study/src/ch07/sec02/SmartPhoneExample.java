package ch07.sec02;

public class SmartPhoneExample {

	public static void main(String[] args) {
		
		// 1)
		SmartPhone myPhone = new SmartPhone("갤럭시", "검정");
		
		//myPhone.setWifi(true);
		//System.out.println("와이파이 상태: " + myPhone.wifi);
		// boolean 타입의 기본값은 false 니까, 필드에서 값 설정이 없어서 false 출력
		
		
//		myPhone.bell();
//		myPhone.sendVoice("여보세요.");
//		myPhone.receiveVoice("안녕하세요! 저는 최보현 입니다.");
//		myPhone.hangUp();
//		
		
		// 출력 ③
		System.out.println("모델:" + myPhone.model);
		System.out.println("색상:" + myPhone.color);
		
		
		
	}

}
