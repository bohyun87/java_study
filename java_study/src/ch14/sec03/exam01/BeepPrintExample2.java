package ch14.sec03.exam01;

import java.awt.Toolkit;

public class BeepPrintExample2 extends Thread {
	
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

	public static void main(String[] args) {
		//자동타입변환(부모가 자식객체를 참조한다.)
		Thread thread = new BeepPrintExample2();
		
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
