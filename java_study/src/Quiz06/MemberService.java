package Quiz06;

public class MemberService {

	//필드
	String name;
	String id;
	String password;
	int age;
	
	
	
	
	public boolean login(String id, String password) {
		return true;
	}
	
	public boolean logout(String id) {
		return true;
	}
		
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		
		boolean result = memberService.login("hong", "12345");
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
			System.out.println(memberService.id + "님이 로그아웃 되었습니다.");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		
		
	}

}
