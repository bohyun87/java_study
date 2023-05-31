package ch11.sec06;

public class Account {
	private long balance; // 잔고

	public Account() {
	}

	public long getBalance() {
		return balance;
	}
	
	//예금하는 메소드
	public void deposit(int money) {
		balance += money;
	}
	
	//출금하는 메소드                 //throw new 부분을 작성하고 빨강밑줄이 생길때 마우스오버 하면 자동완성 코드 보임
	public void withdraw(int money) throws InsufficientException {
		if(balance < money) {  //출금하려는 금액이 잔고보다 많으면
			//예외를 발생시킨다
			throw new InsufficientException("잔고부족: " + (money-balance) + "원 모자람");
		}
	}
	
	

}
