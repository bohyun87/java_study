package ch13.sec01;

public class GenericExample {

	public static void main(String[] args) {
	Box<Integer> box1 = new Box<Integer>();   
	//★★★★★ 중요. 제네릭 타입은 클래스나 인터페이스만 올 수 있다.
	box1.content = 100;
	System.out.println(box1.content);
	
	
	}

}
