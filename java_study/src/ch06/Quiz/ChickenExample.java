package ch06.Quiz;

public class ChickenExample {

	public static void main(String[] args) {

		Chicken myFood = new Chicken(1, 3);

		myFood.setChicken(20);

		System.out.println("==============================");

		if (myFood.isLeftrawChicken()) {
			System.out.println("영업을 시작합니다.");
			System.out.println("==============================");
			System.out.println("주문이 들어왔습니다.");
			System.out.println("콜라: " + myFood.coke + "캔");
			System.out.println("맥주: " + myFood.beer + "캔");
			System.out.println("후라이드치킨");

			System.out.println("==============================");
			myFood.run(20);
		}

		System.out.println("재고 소진으로 조기영업종료");
	}

}
