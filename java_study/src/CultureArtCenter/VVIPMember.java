	package CultureArtCenter;

public class VVIPMember extends Member {
	private String subscriptionBenefit = "모든 전시 무료, 행사초대, 소식지 구독, 항시무료주차, 프라이빗 큐레이터 배정";
	private String curatorName;
	String ticket;
	String parking;
	
	
	public VVIPMember() {
		super.memberGrade = "VVIP";
	}

	public VVIPMember(int memberID, String memberName, String curatorName, String ticket, String parking) {
		super(memberID, memberName);
		
		super.memberGrade = "VVIP";
		super.membershipFee = 500000;
			
		this.ticket = ticket;
		this.parking = parking;
		this.curatorName = curatorName;
	}

	
	@Override
	public String showMemberInfo() {		
		return super.showMemberInfo() + ", 프라이빗 큐레이터: " + curatorName + " 배정, 전시 " + ticket + ", " + parking;
	}


	//필드 getter, setter
	public String getCuratorName() {
		return curatorName;
	}
	
	public void setCuratorName(String curatorName) {
		this.curatorName = curatorName;
	}

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public String getParking() {
		return parking;
	}

	public void setParking(String parking) {
		this.parking = parking;
	}

	public String getSubscriptionBenefit() {
		return subscriptionBenefit;
	}

	public void setSubscriptionBenefit(String subscriptionBenefit) {
		this.subscriptionBenefit = subscriptionBenefit;
	}
	
	
	


	
	
	
	
	
	
	
}
