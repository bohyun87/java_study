package ch06.sec14;

public class Car {

	
	//필드
	private int speed;
	private boolean stop;
	
	
	//마우스 우클릭 => 소스 => 제너레이트 게터 세터
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	
	
	
	
	
	
	/*
	// getter 메소드(함수): private 필드를 리턴해주는 메소드
	public int getSpeed() {
		return speed;
	}
	
	//setter 메소드: private 필드의 값을 변경해주는 메소드
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	*/
	
	
	
	
	
	
}
