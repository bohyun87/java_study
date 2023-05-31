package ch18.sec04.exam02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) {
		Reader reader = null;
		
		try {
			reader = new FileReader("C:/Temp/test.txt");
			
			//1문자로 읽기
			while(true) {
				int data = reader.read();
				if (data == -1) break;
				System.out.println((char)data);
			}
			reader.close();
			System.out.println();
			
			//배열로 읽기
			reader = new FileReader("C:/Temp/test.txt");
			char[] data = new char[100];
			
			while(true) {
				int num = reader.read(data);
				if(num == -1) break;
				System.out.println(num);
				
				for(int i=0; i<num; i++) {
					System.out.println(data[i]);
				}
			}
			
			reader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
