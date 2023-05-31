package ch05.sec05;

public class IndexContainExample {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		System.out.println(subject);
		
		//1. 원하는 문자를 찾아서 가져오는 기능
		// 해당 문자열이 시작하는 인덱스 번호를 리턴한다.
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		//index 3번 부터 문자열 가져오기
		String substring = subject.substring(location);
		System.out.println(substring);
		
		
		//2. 해당 문자열이 있는지 찾아오는 기능 
		String str = "자바";
		
		location = subject.indexOf(str);
//		location = subject.indexOf("자바");
		if(location == -1) {
			System.out.println("해당 문자열이 없습니다.");
		}else {
			System.out.println("해당 문자열이 존재합니다.");		
			String substring2 = subject.substring(location);
			System.out.println("substring2:" + substring2);
									
			
			String substring2 = subject.substring(location, str.length());
			System.out.println("substring2:" + substring2);
			
		}
		
			
		boolean result = subject.contains("자바");
		if(result) {
			System.out.println("해당 문자열이 존재합니다.");
		}else {
			System.out.println("해당 문자열이 없습니다.");
		}

	}
}
