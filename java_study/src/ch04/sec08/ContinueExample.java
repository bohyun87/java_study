package ch04.sec08;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++ ) {
			if( i % 2 != 0) {
				continue;  //홀수면 다시 실행
			}
			
			System.out.println(i);
		}
	}

}
