package ch18.sec02.exam01;

import java.io.*;

public class ReadExample {

	public static void main(String[] args) {
		try {
			InputStream is  = new FileInputStream("C:/Temp/test1.db");
			
			while(true) {
				int data = is.read();  //1byte 씩 데이터를 읽어온다.
				
				//더 이상 읽을 데이터가 없으면 -1을 리턴한다.
				if(data == -1) break;
				
				System.out.println(data);  //읽어온 데이터를 출력
				
			}
			
			is.close();  //입력스트립을 닫고 메모리를 해제
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
