package ch15.sec06.exam01;

import java.util.Stack;

public class StacjExample {

	public static void main(String[] args) {
		// Stack  객체 생성
		Stack<Coin> coinBox = new Stack<Coin>();
		
		
		//동전 넣기
		coinBox.push(new Coin(100));  //변수에 코인객체로 넣어주기
		coinBox.push(new Coin(50)); 
		coinBox.push(new Coin(500)); 
		coinBox.push(new Coin(10)); 
		
		// coinBox가 비어있지 않으면 실행된다.
		while(!coinBox.isEmpty()) { //coinBox가 비어 있는지 물어보는 것
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전:" + coin.getValue() + "원");
		}
		
		
		
		
	}

}
