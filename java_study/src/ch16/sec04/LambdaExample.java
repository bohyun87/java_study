package ch16.sec04;

public class LambdaExample {

	public static void main(String[] args) {
		Person person = new Person();
		
		person.action((x, y) -> {
			double result = x + y;
			return result;
			//Person 클래스의 double result 에 결과 값을 넣어준다.
		});
		
		person.action((x, y) -> (x + y));
		
		person.action((x, y) -> sum(x, y));
		
	}
	
	public static double sum(double x, double y) {
		return (x + y);
	}

}
