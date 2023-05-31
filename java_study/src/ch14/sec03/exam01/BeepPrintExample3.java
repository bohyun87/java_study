package ch14.sec03.exam01;

import java.awt.Toolkit;

public class BeepPrintExample3 {
	
	

	public static void main(String[] args) {
		// extends Thread 필요없음
		Thread thread = new Thread() {
			@Override
			public void run() {
				//실행시킬 코드
				Toolkit toolkit = Toolkit.getDefaultToolkit();  //비프음 발생시키기 위한 객체
				for(int i=0; i < 5; i++) {  // i 가 5보다 작으니까 0~4, 5번 실행 
					toolkit.beep();   //비프음 발생
					try {
						Thread.sleep(500);  //0.5초 동안 코드를 정지시키는 코드
					} catch (Exception e) {
					}
				}
			}
		};
		
		thread.start(); 
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);  //0.5초 동안 코드를 정지시키는 코드
			} catch (Exception e) {
			}
		}
	}


}
