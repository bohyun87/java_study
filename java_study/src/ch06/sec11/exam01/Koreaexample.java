package ch06.sec11.exam01;

public class Koreaexample {

	public static void main(String[] args) {
		Korea k1 = new Korea("감자바");
		
		//필드값 읽기
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(ki.name);
		
		//필드값 변경
		k1.nation = "USA";  //변경안됨
		k1.ssn = "1232";  	//변경안됨
		k1.name = "이자바"; 	// 변경가능
	}

}
