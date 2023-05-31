package Quiz06;

//계좌
public class Account {
	//객체 = 속성 + 기능
	//계좌 = 속성(계좌소유자 이름, 계좌번호, 잔액) + 기능(getter, setter)
	
	
	//속성 => 필드
	private String ano;  //계좌번호
	private String owner;  //계좌 소유자
	private int balance;  //잔고
	
	
		
	//생성자
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	
	//getter, setter
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	




	
	
	
	
	
	
}
