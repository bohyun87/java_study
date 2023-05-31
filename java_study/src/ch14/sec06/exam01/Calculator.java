package ch14.sec06.exam01;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}
		  //동기화 메소드 만들어주기
	public synchronized void setMemory1(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000);   
			// 0으로 입력하면 100으로 출력됨 or Synchronized 걸어주면 동기화안됨
		} catch (Exception e) {
		}
		System.out.println(Thread.currentThread().getName() +  ":" + this.memory);
	}
	
	public void setMemory2(int memory) {
		synchronized(this) {
		//↑ 동기화 블록 만들기
			
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		System.out.println(Thread.currentThread().getName() +  ":" + this.memory);
		
		}
	}
	
	

}
