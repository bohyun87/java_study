package Quiz04;

public class num07 {

	public static void main(String[] args) {
		// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ....
		
		int num1 = 1 ;	// 첫번째 값
		int num2 = 1 ;	// 두번째 값
		int num3 = 0 ;  // 세번째 값
		System.out.println(num1 + "," + num2);
		
		for(int i=0; i < 8; i++) {
			num3 = num1 + num2;  //
			System.out.println("," + num3);
			num1 = num2;
			num2 = num3;
				
		}
		
	}

}
