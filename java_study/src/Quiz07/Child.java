package Quiz07;

public class Child extends Parent{
	public String name;
	
	public Child() {
		//1. 부모생성자 실행
		
		//7. 아래의 매개변수가 가리키는 생성자 찾아서 이동
		this("홍길동");
		// 10. 출력 ④
		System.out.println("Child() call");
	}
	
		//8. this("홍길동") 이 가리키는 것
	public Child(String name) {
		this.name = name;
		// 9. 출력 ③
		System.out.println("Child(String name) call");
	}
	
	
}
