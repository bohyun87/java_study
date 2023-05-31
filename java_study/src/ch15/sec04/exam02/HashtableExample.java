package ch15.sec04.exam02;

import java.util.*;

public class HashtableExample {

	public static void main(String[] args) {
		//  Hashtable 들어가 보면 Map 을 implements 하고 있어서 Map 을 자동타입변환으로 가능
		Map<String, Integer> map = new Hashtable<>();   
		
		Thread threadA = new  Thread() {
			@Override
			public void run() {
				//1000개의 데이터 추가
				for(int i=1; i<=1000; i++) {
					map.put(String.valueOf(i), i);  //valueOf int 타입의 값을 String 으로 바꿔주는 것
				}
			}			
		};
		
		
		Thread threadB = new  Thread() {
			@Override
			public void run() {
				//1000개의 데이터 추가
				for(int i=1001; i<=2000; i++) {
					map.put(String.valueOf(i), i);  //valueOf int 타입의 값을 String 으로 바꿔주는 것
			    }
		    }
		};
		
		//스레드 실행
		threadA.start();
		threadB.start();
		
		try {
			threadA.join();
			threadB.join();
		} catch (Exception e) {
		}
		
		
		//저장된 총 엔트리 수 얻기
		int size = map.size();
		System.out.println("총 엔트리 수: " + size);
		System.out.println();
		
	}
	
		

}
