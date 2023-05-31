package CultureArtCenter;

public class GoldMember extends Member {
	private String subscriptionBenefit = "전시.주차 5회 무료, 소식지 구독";

	public GoldMember() {
		super.memberGrade = "GOLD";
	}	


	public GoldMember(int memberID, String memberName) {
		super(memberID, memberName);

		super.memberGrade = "GOLD";
		super.membershipFee = 50000;
		super.ticketCount = 5;
		super.parkingCount = 5;

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
