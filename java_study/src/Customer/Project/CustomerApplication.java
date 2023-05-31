	package Customer.Project;

import java.util.ArrayList;

public class CustomerApplication {
	//필드선언
	// ArrayList(배열) 안에 Customer 객체를 넣어주겠다. 는 의미
	private static ArrayList<Customer> customerList = new ArrayList<>();
	
	
	public static void main(String[] args) {
		//실버등급(일반)
		Customer customerLee = new  Customer(10010, "이순신");
		Customer customerShin = new  Customer(10020, "신사임당");
		
		//골드등급(자동타입변환) => 다형성(자동타입변환 + 메소드오버라이딩)
		Customer customerHong = new  GoldCustomer(10030, "홍길동");
		Customer customerJeong = new  GoldCustomer(10040, "정약용");
		
		
		//VIP등급(자동타입변환) => 다형성(자동타입변환 + 메소드오버라이딩)		
		Customer customerYul = new  VIPCustomer(10050, "이율곡", 12345);
		
		
		//arrayList에 객체를 추가하기
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerJeong);
		customerList.add(customerYul);
		
		
		// 1. 모든 고객 정보 출력하기
		showAllCustomer();
				
		
		// 2. 상품구매시 id로 찾은 고객의 실제 지불금액과 보너스 포인트 출력
		Customer customer = findCustomer(10050);  //이율곡 찾기
		
		if(customer == null) {
			//회원을 찾지 못했을 때
			System.out.println("존재하지 않는 회원입니다.");
		} else {
			//회원을 찾았을 때
			showPriceBonus(customer, 10000);  //이율곡이 10000원을 주고 상품을 구매했을 때
			
			
		}
	}

	 //고객정보 출력
	public static void showAllCustomer() {
		System.out.println("===========모든 고객 정보 출력===========");
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
			
		}
	}
	
	
	
	//고객 ID로 고객찾기
	public static Customer findCustomer(int customerID) {
		//빈객체 만들어주기
		Customer resultCustomer = null;
		
		for(Customer customer : customerList) {
			//id가 같으면
			if(customer.getCustomerID() == customerID) {
				//id가 같은 customer 객체를 resultCustomer에 넣어준다.
				resultCustomer = customer;
				break;
			}
		}
		return resultCustomer;
	}
	
	//실제 지불금액, 보너스 포인트 출력  <= 찾는 회원을 찾았을 때 출력하는 값
	public static void showPriceBonus(Customer customer, int price) {
		System.out.println("============고객 할인율과 보너스 포인트============");
		
		//지불금액
		int cost = customer.calcPrice(price);
		
		System.out.println(customer.getCustomerName() + "님의 지불금액: " + cost + "원");
		System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트: " + customer.bonusPoint + "점");
	}
	
	
	
	
	
}
