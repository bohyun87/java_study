package ch09.sec02.exam01;

public class A {
	class B{ }  //인스턴스 맴버 클래스
	//static class C {} //정적 맴버 클래스
	
	B field = new B(); //class 이기 때문에 필드 객체로 생성 가능 => A class 내부에서 생성됨
	
	A(){
		B b = new B();   // A클래스 생성자 내부에서도 객체 생성 가능
	}
	
	void method() {
		B b = new B();  //A클래스 메소드 내부에서도 객체 생성 가능
	}
}
