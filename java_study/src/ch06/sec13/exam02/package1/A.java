package ch06.sec13.exam02.package1;

public class A {
	//필드
	A a1 = new A(true);  //boolean 타입
	A a2 = new A(1);  // int 타입
	A a3 = new A("문자열");  // String 타입
	
	//생성자
	public A(boolean b){
		
	}

	
	A(int b){  //default(접근제한): 같은 패키지 안에서만 사용가능
		
	}
	
	//private: 같은 클래스에 있을 때만 사용가능
	private A(String s){
		
	}

}
