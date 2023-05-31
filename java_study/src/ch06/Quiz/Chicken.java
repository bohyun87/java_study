package ch06.Quiz;

public class Chicken {
	// 필드
	int rawChicken; // 생닭량(마리)
	double doughAmount = 200; // 반죽량(kg)
	double seasoned = 10; // 양념량(kg)
	double cookingOil = 3000; // 식용유량(ml)
	int coke = 20; // 콜라(캔)
	int beer = 30; // 맥주(캔)

	Chicken(int coke, int beer) {
		this.coke = coke;
		this.beer = beer;
	}

	void setChicken(int rawChicken) {
		this.rawChicken += rawChicken;
	}

	boolean isLeftrawChicken() {
		if (rawChicken == 0) {
			System.out.println("생닭이 소진됐습니다.");
			return false;
		}
		System.out.println("생닭 재고가 있습니다.");
		return true;
	}

	void run(int count) {
		while (true) {
			if (rawChicken > 0) {
				System.out.println("조리가 가능합니다. 생닭재고: " + rawChicken);
				rawChicken -= count;
			} else {
				System.out.println("==============================");
				System.out.println("재고가 없습니다. 생닭재고: " + rawChicken);
				return;
			}
		}
	}

}
