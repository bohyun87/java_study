package ch02.sec11;

public class VariableScopeExample {

	public static void main(String[] args) {
		// 변수 사용 범위
		
		int v1 = 15;  // 전역변수
		
		if(v1 > 10) {
			int v2 = v1 - 10;  // 지역변수
		}
		
		int v3 = v1 + v2 + 5;  // if문 안에서 v2 를 변수 선언 했기 때문에 if문 scope를 벗어 났기 때문에 오류 생김
		
		
	}

}
