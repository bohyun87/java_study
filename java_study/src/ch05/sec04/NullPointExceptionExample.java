package ch05.sec04;

public class NullPointExceptionExample {

	public static void main(String[] args) {
		int[] intArray = null;
		//intArray[0] = 10;
		
		String str = null;
		System.out.println(str.length());
	}

}
