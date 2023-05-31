package ch18.sec04.exam01;

import java.io.*;

public class WriterExample {

	public static void main(String[] args) {
		try {
			Writer writer = new FileWriter("C:/Temp/test.txt");
			
			//한 문자씩 출력
			char a = 'A';
			writer.write(a);
			
			char b= 'B';
			writer.write(b);
			
			//배열출력
			char[] arr = {'C', 'D', 'E'};
			writer.write(arr);
			
			//문자열 출력
			writer.write("FGH");
			
			//버퍼에 잔류하는 모든 문자들을 출력하고 버퍼를 비움
			writer.flush();
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
