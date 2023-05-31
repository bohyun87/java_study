package ch04.sec03;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'B';   // char 문자타입은 ''
		String grade1 = "b";  // String 문자열은  ""
		
		switch (grade) {  // char 타입도 key 로 쓸 수 있다. 단, A, B 처럼 1글자
		case 'A':    // case 를 2개씩 써도됨
		case 'a':
			System.out.println("우수회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반회원입니다.");
			break;

		default:
			System.out.println("손님입니다.");
			break;
		}
	}

}
