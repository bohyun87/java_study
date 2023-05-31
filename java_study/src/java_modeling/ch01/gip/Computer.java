package java_modeling.ch01.gip;

//합성관계: 전체가 사라지면 부분도 사라진다.
public class Computer {
	// 필드
	private MainBoard mb;
	private CPU c;
	private Memory m;
	private PowerSupply ps;

	// 생성자
	public Computer() {
		// 생성자에서 필드에 값을 넣어준다.(객체를 생성해준다.)
		this.mb = new MainBoard();
		this.c = new CPU();
		this.m = new Memory();
		this.ps = new PowerSupply();
	}

}
