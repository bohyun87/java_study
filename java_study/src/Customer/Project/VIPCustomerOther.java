package Customer.Project;

public class VIPCustomerOther extends Customer {

	double saleRatio; // 할인률
	private int agentID; // 상담원 아이디

	// 생성자
	public VIPCustomerOther(int customerID, String customerName, int agentID) {
		super(customerID, customerName);

		super.customerGrade = "VIP";
		super.bonusRatio = 0.03;

		this.saleRatio = 0.2;
		this.agentID = agentID;
	}

	@Override
	public int calcPrice(int price) {
		// 1. 보너스 포인트가 쌓인다.
		bonusPoint += (price * bonusRatio);

		// 2. 사용자가 지불할 가격을 리턴한다.(할인이 된다.)
		// 원래 가격 - 할인 가격
		return price - (int) (price * saleRatio);
	}

	
	// 담당 상담원의 정보 출력
	@Override
	public String showCustomerInfo() {
		// 고객이름 등급, 현재 보너스 포인트점수, 상담원ID 출력(총 4가지)
		
		// 부모 클래스의 showCustomerInfo() return 값 가져오기
		return super.showCustomerInfo() + ", 담당 상담원 번호: " + agentID;
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}


}
