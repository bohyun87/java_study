package CultureArtCenter;

import java.util.ArrayList;

import Customer.Project.Customer;

public class MemberApplication {

	private static ArrayList<Member> memberList = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("====회원 등급별 혜택====");
		Member member1 = new Member();
		System.out.println(member1.memberGrade + "회원 혜택: " + member1.getSubscriptionBenefit());
		
		Member gold = new GoldMember();
		System.out.println(gold.memberGrade + "회원 혜택: " + gold.getSubscriptionBenefit());
		
		VIPMember vip = new VIPMember();
		System.out.println(vip.memberGrade +"회원 혜택: " + vip.getSubscriptionBenefit());
		
		VVIPMember vvip = new VVIPMember();
		System.out.println(vvip.memberGrade + "회원 혜택:" + vvip.getSubscriptionBenefit());
		
		
		// 일반회원(01~1000)
		Member member01 = new Member(01, "최보현");
		Member member02 = new Member(02, "김미경");
		// Gold회원(1001~)
		Member member1001 = new GoldMember(1001, "이영심");
		Member member1002 = new GoldMember(1002, "노진구");		
		// VIP회원(10001~)
		Member member10001 = new VIPMember(10001, "김혜미");
		Member member10002 = new VIPMember(10002, "박영철");
		// VVIP회원(15001~)
		Member member15001 = new VVIPMember(15001, "김진영", "유재석", "무제한 입장 가능", "항시 무료주차 가능");
		Member member15002 = new VVIPMember(15002, "이상민", "조세호", "무제한 입장 가능", "항시 무료주차 가능");
	
		//list에 객체 추가하기
		memberList.add(member01);
		memberList.add(member02);
		memberList.add(member1001);
		memberList.add(member1002);
		memberList.add(member10001);
		memberList.add(member10002);
		memberList.add(member15001);
		memberList.add(member15002);
		
		
		//회원정보 출력하기
		showAllMember();
		
		//찾은 회원 출력
		Member member = findMember(10001); 	
		if(member == null) {
			System.out.println("존재하지 않는 회원입니다.");
		} else if (member.memberGrade == "VVIP"){
			showBenefit(member1);
		} else {
			showexhibitionCount(member, 1, 2);
		}
		
		Member member2 = findMember(15001); 	
		if(member2 == null) {
			System.out.println("존재하지 않는 회원입니다.");
		} else if (member2.memberGrade == "VVIP"){
			showBenefit(member2);
		} else {
			showexhibitionCount(member2, 0, 0);
		}
		
		
		
	} //메인메소드 끝

	
	// 회원정보 출력
	public static void showAllMember() {
		System.out.println();
		System.out.println("===========모든 고객 정보 출력===========");

		for (Member member : memberList) {
			System.out.println(member.showMemberInfo());

		}
		System.out.println("=====================================");
	}

	// 회원 찾기
	public static Member findMember(int memberID) {
		Member resultMember = null;
		for (Member member : memberList) {
			if (member.getMemberID() == memberID) {
				resultMember = member;
				break;
			}
		}
		return resultMember;
	}

	//VVIP회원이 아닐때 혜택안내
	public static void showexhibitionCount(Member member, int exhibition, int freeParking) {
		System.out.println();
		System.out.println("===" + member.memberName + " 님의 무료혜택===");

		//잔여전시관람횟수
		int exhibitionCount = member.calcCount1(exhibition);
		int freeParkingCount = member.calcCount2(freeParking);

		System.out.println(member.memberName + "님은 " + member.memberGrade + "회원으로, 잔여전시관람횟수: " + exhibitionCount + "회, 잔여 무료주차횟수: " + freeParkingCount + "회 남았습니다.");
		System.out.println();
	}
	
	//VVIP회원 일때 혜택안내 
	public static void showBenefit(Member member) {
		System.out.println();
		System.out.println("===" + member.memberName + " 님의 무료혜택===");

		System.out.println(member.memberName + "님은 " + member.memberGrade + "회원이므로 전시.주차를 항시 무료로 이용가능 합니다.");
		System.out.println();
	}
	

}
