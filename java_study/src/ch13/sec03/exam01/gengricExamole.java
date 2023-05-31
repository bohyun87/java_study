package ch13.sec03.exam01;

public class gengricExamole {
	//제네릭메소드
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.setT(t);
		return box;
	}
	
	
	public static void main(String[] args) {
		Box<Integer> box1 = boxing(100);
		System.out.println(box1.getT());
	
	}

}
