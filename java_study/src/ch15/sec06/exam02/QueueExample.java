package ch15.sec06.exam02;


import java.util.*;

public class QueueExample {

	public static void main(String[] args) {
		                                 //LinkedList 로 받아서 생성
		Queue<Message> messageQueue = new LinkedList<>();  
									// 메세지 보낼 수단, 받는 사람
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaotalk", "김자바"));
		
		while(!messageQueue.isEmpty()) {
			Message message =  messageQueue.poll(); //poll을 Message 에 담기
			
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 SMS를 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "님에게 카톡을 보냅니다.");
				break;
						
			}
			
			// stack 은 먼저 입력된 데이터가 먼저 출력된다.
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
