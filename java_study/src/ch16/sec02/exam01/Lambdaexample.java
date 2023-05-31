package ch16.sec02.exam01;

public class Lambdaexample {

	public static void main(String[] args) {
		Person person = new Person();
		
		//매개변수가 없는 익명구현객체 
		person.action(() -> {
			System.out.println("출근을 합니다.");
			System.out.println("프로그래밍을 합니다.");
		});		
		
		//실행문이 하나일때 중괄호 생략이 가능하다
		person.action(() ->System.out.println("퇴근을 합니다."));
	}

}
