package singletone.print;

public class Main {
	//필드
	private static final int USER_NUM = 10;  // 직원 수
	
	public static void main(String[] args) {
		//user 객체를 가지는 배열
		User[] user = new User[USER_NUM];
		
		for (int i=0; i < USER_NUM; i++) {
			//배열에 user 객체를 생성해서 저장하는 과정
			user[i] = new User(i + "번 직원"); 
			user[i].print();
		}
	}

}
