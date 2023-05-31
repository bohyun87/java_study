package ch16.sec01;

public class LambdaExample {

	public static void main(String[] args) {
		//익명객체: 클래스가 없는 객체를 만들어주는 것
		//익명구형객체 + 매개변수 = 람다(함수)
		action((x, y)->{
			int result = x + y;
			System.out.println("result: " + result);
		});
		
		action((x, y)->{
			int result = x - y;
			System.out.println("result: " + result);
		});
	}
	
	public static void action(Calculable calculable) {
		int x = 10;
		int y = 4;
		calculable.Calculate(x, y);
	}

}
