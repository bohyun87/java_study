package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class C {
	
	public void method() {
		//클래스가 서로 다른 패키지에 있으면 접근할 수 없다.
		A a = new A();  // => 오류
		a.field = "value";  // =>오류
		a.method();  // =>오류
		//접근 가능하게 하려면 A클래스 protected => public 으로 변경
	}

}
