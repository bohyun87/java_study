package ch02.sec01;

public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 3;   // 00000000 00000000 00000000 00000011 => int 형 이니까 32bit		
		int y = 5;   // 00000000 00000000 00000000 00000101
		System.out.println(x + "," + y);	
		
		//short x1 = 3; // 00000000 00000011 => short 형 이니까 16bit
		//short x2 = 5; // 00000000 00000101
		
		// x, y 값 교환하기
		int temp = x;  // temp: 3
		x = y;  // x: 5
		y = temp;  // y: 3
		// x의 값을 다른 변수에 담아서 보관해두고
		// 비어있는 x에 y의 값을 담아주고
		// 비어있는 y에 x가 줬던 temp의 값을 담아준다. 
		
	    System.out.println(x + "," + y);			
	}

}
