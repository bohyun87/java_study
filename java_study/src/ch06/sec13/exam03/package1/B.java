package ch06.sec13.exam03.package1;

public class B {
	public void method() {
		//필드 를 객체로 선언한다.
		A a = new A();
		
		//필드값 변경
		a.field1 = 1;  
		a.field2 = 1;  
		a.field3 = 1;   //private
		
		
		a.method1();
		a.method2();
		a.method3();   //private
	}
	
	
}
