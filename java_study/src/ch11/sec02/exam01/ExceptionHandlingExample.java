package ch11.sec02.exam01;

public class ExceptionHandlingExample {

	public static void printLength(String data) {
		try {
			int result = data.length();
			System.out.println("문자 수: " + result);
			
		} catch (NullPointerException e) {  
			//try 문에서 NullPointerException에러 발생시 잡는다.
			//System.out.println("NullPointerException 에러가 발생했습니다.");
			//System.err.println(e.getMessage());
			//System.err.println(e.toString());
			e.printStackTrace(); //예외의 이유, 종류, 어디서 발생했는지를 리턴
		}finally{ // => 언제든지 실행되는 코드
			System.out.println("[마무리 실행]");
		}
		
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("[프로그램시작]");
		printLength("this is java");
		printLength(null);
		System.out.println("[프로그램 종료]");
	}

}
