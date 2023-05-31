package ch12.sec05;

public class StringBuilderExample {

	public static void main(String[] args) {
		//StringBuilder: 문자열 추가, 삭제 할 때 주로 쓴다. => 동기화 지원 안됨
		//StringByffer: 문자열 추가, 삭제 할 때 주로 쓴다. => 동기화 지원됨
		
		//data = "DEF";
		String data = new StringBuilder()
				.append("DEF")	// 문자열의 맨 끝에 추가
				.insert(0, "ABC")
				.delete(3, 4)  //delete(시작위치, 끝위치)
				.toString();  //StringBuilder 를 사용할 때는  toString을 사용해서 Stirng타입으로 변환해줘야함 
		
		System.out.println(data);
	}

}
