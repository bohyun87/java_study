package ch07.sec07.exam02;

public class ChildExample {

	public static void main(String[] args) {
		//자동 타입변환1 => 자동타입변환: 부모가 자식을 참조할때
		/*
		Child child = new Child();		
		Parent parent2 = child;
		*/
		
		
		//자동 타입변화2
		Parent parent = new Child(); 
		
		//특징
		//2. 자동타입 변환 시 자식클래스에 오버라이딩 된 메소드가 있으면
		//오버라이딩 된 메소드가 호출된
		parent.method1();
		parent.method2();
		parent.parentField = 10;
		
		//특징
		//1. 부모클래스에 선언된 필드와 메소드만 접근가능.
		//parent.method3();
		//parent.childField = 10;  ==> 오류남
		
		System.out.println("=============================");
		
		//강제타입변환 =>오버로딩 안된 필드와 메소드도 사용 가능
		Child child = (Child)parent;
		child.method3();
		child.childField = 10;
		child.method2();
		child.parentField = 10;
		
		
		
		
		
		
		
		
		
	}

}
