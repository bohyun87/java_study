package ch14.sec03.exam01;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {  //비프음과 "띵" 시스템아웃과 동시 실행
								// Runnable인터페이스로 구현 
			@Override
			public void run() {    //비프음과 "띵" 시스템아웃과 동시 실행
				Toolkit toolkit = Toolkit.getDefaultToolkit();  //비프음 발생시키기 위한 객체
				for(int i=0; i < 5; i++) {  // i 가 5보다 작으니까 0~4, 5번 실행 
					toolkit.beep();   //비프음 발생
					try {
						Thread.sleep(500);  //0.5초 동안 코드를 정지시키는 코드
					} catch (Exception e) {
					}
				}
				
			}
			
		});
		
		thread.start();    // start 를 입력해야 위의 스레드 가 실행됨 		
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);  //0.5초 동안 코드를 정지시키는 코드
			} catch (Exception e) {
			}
		}
	}

}
