package CultureArtCenter;

public class VIPMember extends Member {
	private String subscriptionBenefit = "전시.주차 8회 무료, 행사초대, 소식지 구독";

	public VIPMember() {
		super.memberGrade = "VIP";
	}
	
	public VIPMember(int memberID, String memberName) {
		super(memberID, memberName);

		super.memberGrade = "VIP";
		super.membershipFee = 100000;
		super.ticketCount = 8;
		super.parkingCount = 8;
	}


	@Override
	public int calcCount1(int exhibition) {
		ticketCount -= exhibition;

		return ticketCount;
	}

	@Override
	public int calcCount2(int freeParking) {
		parkingCount -= freeParking;

		return parkingCount;
	}

	public String getSubscriptionBenefit() {
		return subscriptionBenefit;
	}

	public void setSubscriptionBenefit(String subscriptionBenefit) {
		this.subscriptionBenefit = subscriptionBenefit;
	}
	
	
	
	

	

}
