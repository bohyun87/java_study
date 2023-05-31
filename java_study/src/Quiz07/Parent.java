package Quiz07;

public class Parent {
	public String nation;
	
	//2. 1번에서 가리키는 실행되는 부모생성자
	public Parent() {
		// 3. 부모생성자의 매개변수가 가리키는 생성자 찾아서 이동
		this("대한민국");
		//6. 2~3번에서 밀렸던 출력②
		System.out.println("Parent() call");		
	}
	
	// 4. 3번에서 this("대한민국") 이 가리키는 것
	public Parent(String nation) {
		this.nation = nation;
		// 5. 4번으로 인해 출력①
		System.out.println("Parent(String nation) call");
	}
}
