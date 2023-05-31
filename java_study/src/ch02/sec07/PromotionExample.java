package ch02.sec07;

public class PromotionExample {

	public static void main(String[] args) {
		// 자동 타입변환		
		byte byteValue = 10;	  // 00001010
		int intValue = byteValue; // 00000000 00000000 00000000 00001010
		System.out.println(intValue);
		
		char charValue = 'A'; // 유니코드 65 
		intValue = charValue;
		System.out.println(intValue);
		
		byteValue = 65;
		charValue = (char)byteValue;   //byteValue 가 charValue 보다 작기 때문에 강제변환 (char) 추가필요
		System.out.println(charValue);
		
		
		
		
		intValue = 50;			// 00000000 00000000 00000000 00110010
		long longValue = intValue;
		// 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00110010
		System.out.println(longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println(floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println(doubleValue);
		
	}
	

}
