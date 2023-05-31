package Quiz06;

public class Example {
	

	static boolean isNumber(String str) {
		if(str == null || str.equals("")) {
			return false;
		}
				
		 for(int i=0; i <str.length(); i++) {
				 char ch = str.charAt(i);
				 		// chatAt(i)  => index i번째의 문자를 리턴한다.
				 				
				 //System.out.println(ch);
				 
				 if (ch < '0' || ch > '9') {
					 return false;
				 }
			 }
		 
		 return true;		 
	}
	
	
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까?: " + isNumber(str));
		str = "1234o";
		System.out.println(str + "는 숫자입니까?: " + isNumber(str));
	}

}
