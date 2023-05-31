package ch03.sec06;

public class CompareOperatorExample {

	public static void main(String[] args) {
		// 비교연산자
		
		//타입이 같은 경우 : char 끼리 비교
		char char1 = 'A';  //65
		char char2 = 'B';  //66
		
		boolean result4 = (char1 < char2); //65 < 66
		System.out.println("result4: " + result4);
		
		
		// 타입이 다른 경우 비교 (int 와 float, double 는 문제가 없음)
		int num3 = 1;
		double num4 = 1.0;
		boolean result5 = (num3 == num4);
		System.out.println("result5: " + result5);
		
		// (예외) 타임이 다른 경우 (float와 double)
		float num5 = 0.1f;
		double num6 = 0.1;
		//boolean result6 = (num5 == num6);
		//System.out.println("result6: " + result6);  // => flase
		boolean result7 = (num5 == (float)num6);
		System.out.println("result7: " + result7);  // => ture
		
		// 문자열 비교
		String str1 = "자바";
		String str2 = "Java";
		boolean result8 = (str1.equals(str2)); // str1 == str2
		boolean result9 = (!str1.equals(str2)); // str1 != str2
		System.out.println("result8: " + result8);
		System.out.println("result9: " + result9);
		
	}
}
