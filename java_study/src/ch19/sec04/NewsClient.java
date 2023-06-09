package ch19.sec04;

import java.net.*;

public class NewsClient {

	public static void main(String[] args) {
		try {
			DatagramSocket datagramSocket = new DatagramSocket();
			
			//서버에게 데이터를 보내준다.
			String data = "정치";
			byte[] bytes = data.getBytes("UTF-8");
			
			DatagramPacket sendPacket = new DatagramPacket(bytes, bytes.length, new InetSocketAddress("localhost", 50001));
			datagramSocket.send(sendPacket);
			
			while(true) {
				//뉴스를 받는다.
				DatagramPacket receivePacket = new DatagramPacket(new byte[1024], 1024);
				datagramSocket.receive(receivePacket);
				
				//문자열로 변환
				String news = new String(receivePacket.getData(), 0, receivePacket.getLength(), "UTF-8");
				System.out.println(news);
				
				// 10번째 뉴스를 받으면 while문 종료
				if(news.contains("뉴스10")) {  //뉴스10 글자가 포함되어 있는지
					break;
				}
			}
			
			datagramSocket.close();  //소켓닫기			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
