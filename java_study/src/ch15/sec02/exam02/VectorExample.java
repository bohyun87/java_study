package ch15.sec02.exam02;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<Board> list = new Vector<>();
		
		Thread threadA = new Thread() {

			@Override
			public void run() {
				//list에 1000개의 board 객체를 추가
				for(int i=0; i<=1000; i++) {
					list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i ));					
				}
			}
			
		};
		
		Thread threadB = new Thread() {

			@Override
			public void run() {
				//list에 1000개의 board 객체를 추가
				for(int i=1001; i<2000; i++) {
					list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i ));					
				}
			}
			
		};
		
		threadA.start();
		threadB.start();
		
		//threadA, threadB가 종료될때까지 메인스레드를 기다리게 함.
		try {
			threadA.join();
			threadB.join();
		} catch (Exception e) {

		}
		
		int size = list.size();
		System.out.println("총 객체 수:" + size);
		System.out.println();
		
		
		
		/*
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		
		for(Board b : list) {
			System.out.println(b.getContent() + b.getSubject() + b.getWriter());
		}
		*/
		
	}

}
