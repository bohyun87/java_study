package ch08.sec07;

public class ServiceExample {

	public static void main(String[] args) {
		Service service = new ServiceImpl();
		service.defaultMethod1();
		service.defaultMethod2();
		
		System.out.println();
		
		//클래스명.메소드
		Service.staticMethod1();  //Service 인터페이스의 private 가 없는 메소드 호출
		Service.staticMethod2();  //Service 인터페이스의 private 가 없는 메소드 호출
	}

}
