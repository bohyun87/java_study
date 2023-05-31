package ch14.sec04;

public class ThreadNameExample {

	public static void main(String[] args) {  //스레드 총 5번 실행 => main, chatThread, threadA(3번-for문)
		//mianThread 이름 구하기
		Thread mainThread = Thread.currentThread();  //이 코드를 실행하는 스레드 객체를 얻어온
		System.out.println(mainThread.getName() + "실행"); 
		//다른 Thread 는 출력순서가 바뀔수 있는데 mainThread는 항상 처음으로 출력
		
		
		
		for(int i=0; i<3; i++){
			Thread threadA = new Thread() {

				@Override
				public void run() {   //run 에 넣는 코드가 실행된다.
					System.out.println(getName() + "실행");  //  스레드 이름 구하는 실행
					//getName() => 스레드의 이름  / 작성자가 지정할 수도 있고, 자바에서 기본값으로 이름을 줌
					super.run();
				}
				
			};
			
			threadA.start();
		}
		Thread chatThread = new Thread() {

			@Override
			public void run() { //run 에 넣는 코드가 실행된다.
				System.out.println(getName() + "실행"); 
				super.run();
			}
			
		};
		
		//스레드 이름지정 : 스레드가 시작되기 전에 지정을 해준다.
		//이름을 지정 안해주면 어느 스레드인지 구분이 안됨
		chatThread.setName("chat-thread");
		chatThread.start();
	}

}
