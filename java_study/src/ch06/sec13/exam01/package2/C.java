package ch06.sec13.exam01.package2;

import ch06.sec13.exam01.package1.*; 

public class C {
	
	A a = new A();   // =>import 문으로 패키지를 불러왔지만, A 클래스에 접근제한이 걸려있어서 패키지가 달라서 인스턴스 생성 안됨
							// => A 클래스를 불러오고 싶으면 public class A  로 바꿔줌
	B b = new B();   // B 클래스는 public 이므로 접근 가능

}
