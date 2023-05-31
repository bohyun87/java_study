package ch06.sec11.exam01;

public class Korea {
	//인스턴스 final 필드: 값을 변경 할 수 없다.
	final String nation = "대한민국";
	final String ssn = "123456-1234567";
	//final은 초기값을 줘야하지만, final 에서 초기값을 선언하지 않고
	//생성자에서 선언할 수 있다.
	
	//인스턴스 필드
	String name;
	
	//생성자
	public Korea(String ssn, String name) {
		//this.ssn = ssn;  => ssn 은 final 필드여서 값을 변경 할 수 없다.
		this.name = name;
	}
	
}
