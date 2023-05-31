package Quiz04;

public class num08 {

	public static void main(String[] args) {
		for(int i=1; i <= 5; i++) {
			for(int j=1; j <= i; j++) {  // 5행 5열일 경우, for(int j=1; j <= 5; j++)
				System.out.println("*");
				if(j == i) {
					System.out.println();
				}
			}
		}
	}

}
