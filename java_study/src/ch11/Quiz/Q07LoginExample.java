package ch11.Quiz;

public class Q07LoginExample {

	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue", "54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String password) throws Q07NotExistIDException, Q07WrongPasswordException {
		//id 가 blue가 아니라면 NotExistIDException 을 발생시킴
		if(!id.equals("blue")) {
			throw new Q07NotExistIDException("아이디가 존재하지 않습니다.");
		}
		
		//password가 12345가 아니라면 WrongPasswordException을 발생시킴
		if(!password.equals("12345")) {
			throw new Q07WrongPasswordException("패스워드가 틀립니다.");
		}
	}

}
