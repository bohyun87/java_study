package singletone.print;

public class Printer {
	//singletone 
	
	//필드 => 타입 변수 를 자기 자신으로 줌
	//static 필드는 공유를 할 수 있는 전연변수
	private static Printer printer = null;
	
	//생성자
	private Printer() {
		
	}
	
	//메소드
	public static Printer getPrinter() {
		if(printer == null) {
		
		printer = new Printer();  //printer 필드를 맨 처음 사용할 때 새로운 printer 인스턴스 생성  
		}
		return printer;  //맨 처음이 아니라면 원래 쓰던 프린터 객체가 리턴된다.
	}
	
	// singletone 끝
	
	public void print(String str) {
		System.out.println(str);
	}
}
