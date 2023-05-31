package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A{
	
	//생성자
	public D() {
		//부모클래의 생성자를 호출한다.
		super();
	}
	public void method1() {
		//부모클래스에 있는 필드를 바꾼다.
		this.field = "value";
		
		//부모클래스에 있는 메소드를 호출한다.
		this.method();
		
		//=> protected 접근제한자: 상속 관계에 있을 때 접근 가능하다.
	}
	
	public void method2() {
		//직접 객체를 생성해서 사용하는 것은 안된다.
		A a = new A();
		a.field = "value";
		a.method();
	}
	
	
	
}
