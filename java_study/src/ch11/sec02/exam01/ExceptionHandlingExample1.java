package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {

	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");  //클래스를 찾는 코드
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println();
		
		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
