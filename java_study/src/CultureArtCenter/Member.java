	package CultureArtCenter;

//일반회원 등급에 대한 class 이면서 공통 혜택
public class Member {
	// 필드
	protected int memberID;
	protected String memberName;
	protected String memberGrade;
	private String subscriptionBenefit = "전시.주차 1회 무료, 소식지 구독";
	int membershipFee;
	int ticketCount;
	int parkingCount;

	// 생성자
	public Member() {
		initMember();
	}

	public Member(int memberID, String memberName) {
		this(memberID, memberName, "General", 10000);
		initMember();
	}
	
	public Member(int memberID, String memberName, String memberGrade, int membershipFee) {
		this.memberID = memberID;
		this.memberName = memberName;
		this.memberGrade = memberGrade;
		this.membershipFee = membershipFee;
				
	}
	

	// 메소드
	// 회원등급 초기화
	private void initMember() {
		memberGrade = "General";
		membershipFee = 10000;
		ticketCount = 1;
		parkingCount = 1;
	}

	// 무료전시권 차감
	public int calcCount1(int exhibition) {
		// 1. 무료전시 관람 횟수 차감
		ticketCount -= exhibition;

		// 2. 남은 무료전시 횟수
		return ticketCount;
	}
	
	// 무료주차 횟수 차감
		public int calcCount2(int freeParking) {
			// 1. 무료주차 관람 횟수 차감
			parkingCount -= freeParking;

			// 2. 남은 무료주차 횟수
			return parkingCount;
		}
		

	// 회원정보 출력 메소드
	public String showMemberInfo() {
		return memberName + "님: " + memberGrade + "회원, 연간회비: " + membershipFee + "원";
	}

	// getter, setter
	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberGrade() {
		return memberGrade;
	}

	public void setMemberGrade(String memberGrade) {
		this.memberGrade = memberGrade;
	}

	public String getSubscriptionBenefit() {
		return subscriptionBenefit;
	}
   
	public void setSubscriptionBenefit(String subscriptionBenefit) {
		this.subscriptionBenefit = subscriptionBenefit;
	}

	
}
