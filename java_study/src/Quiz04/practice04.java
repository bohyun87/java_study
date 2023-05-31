package Quiz04;

public class practice04 {

	public static void main(String[] args) {
		// 1-1번 문제
		int x = 11;
			if ( 10 < x && x <20) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
			
			
		// 1-2번 문제
		char ch = 'a';
			if(ch != ' ') {
				System.out.println(true);				
			}else {
				System.out.println(false);
			}
			
			
		//1-3번 문제
		char ch1 = 'x';
			if(ch1 == 'x' || ch1 == 'X') {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		
			
		//1-4번 문제 ?????
		char ch2 = '0';
		 if ('0' <= ch2 && ch2 <= '9') {
			 System.out.println(true);
		 }else {
			 System.out.println(false);
			}
		 
		 
		 //1-5번 문제
		 char ch3 = 'g';
		 if (( 'a' <= ch3 && ch3 <= 'z') || ( 'A' <= ch3 && ch3 <= 'Z')) {
			 System.out.println(true);
		 }else {
			 System.out.println(false);
			}
		 
		 
		 //1-6번 문제
		 int year = 365;
		 if ((year % 400 == 0) || (year % 4 == 0) || (year % 100 == 0)) {
			 System.out.println(true);
		 }else {
			 System.out.println(false);
			}
		
		// 1-7번 문제
		 boolean powerOn = true;
		 if (powerOn == false) {
			 System.out.println(true);
		 }else {
			 System.out.println(false);
			}
		 
		 // 1-8번 문제
		 String str = "yes";
		 if (str == "yes") {
			 System.out.println(true);
		 }else {
			 System.out.println(false);
			}
	}

}
