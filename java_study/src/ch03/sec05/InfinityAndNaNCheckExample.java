package ch03.sec05;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		// 나눗셈 연산 후 NaN과 Infinity 처리
		//무한대 (infinity)
		// NaN (Not a number)
		
		int x = 5;
		double y = 0.0;
		double z = x / y;
		String a = "abc";
		
		System.out.println(z);
		
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출불가");
		}
		
		if(Double.isNaN(Double.parseDouble(a))) {
			System.out.println("숫자가 아님");			
		}
	}

}
