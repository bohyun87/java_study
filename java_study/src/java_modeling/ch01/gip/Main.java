package java_modeling.ch01.gip;

public class Main {

	public static void main(String[] args) {
		//1. 합성관계
		// => Computer 만 생성해도 컴퓨터의 부품들이 다 생성된다.
		Computer c = new Computer();
		c = null;  // => 객체에 null 을 주는거는 참조하는 것이 없다. 는 뜻
					// => new Computer(); 가비지 컬렉터로 들어가서 사라지게됨
					// => 컴퓨터 하나만 사라졌는데, 부품들도 다 사라짐
		
		
		
		
		//2. 집약관계
		// 부품을 따로 생성한다.
		MainBoard mb = new MainBoard();
		CPU cpu = new CPU();
		Memory m = new Memory();
		PowerSupply ps = new PowerSupply();
		
		Computer2 c2 = new Computer2(mb, cpu, m, ps);
		c2 = null;
		// 컴퓨터와 부품의 객체를 따로 생성했기 때문에
		// c2 에  null 을 줘서 컴퓨터가 사라져도 부품들은 존재한다.
	}

}
