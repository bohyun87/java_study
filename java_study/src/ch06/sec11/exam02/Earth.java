package ch06.sec11.exam02;

public class Earth {
	//상수 필드
	//중요. 상수명은 대문자로 작성한다.
	//중요. 상수명의 단어가 2개 이상이면 언더바로 연결
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	//인스턴스필드
	int personCount;
	
	//정적블록을 상수초기화
	//복잡한 연산이 들어가면 정적블록을 사용함
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}
