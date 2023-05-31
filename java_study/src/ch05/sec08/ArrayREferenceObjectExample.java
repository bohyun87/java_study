package ch05.sec08;

public class ArrayREferenceObjectExample {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "java";   // 10번지 주소
		strArray[1] = "java";	// 10번지 주소
		strArray[2] = new String("java");  // 20번지 주소 
		
		System.out.println(strArray[0] == strArray[1]);  //주소비교: 주소가 같다 => true
 		System.out.println(strArray[0] == strArray[2]);  //주소비교: 주소가 다르다 => false
		System.out.println(strArray[0].equals(strArray[2]));  //값비교: 값이 같다 => true
	}

}
