package ch06.sec12.hyundai;

// import 문
import ch06.sec12.hankook.*;   // => *: 아스트릭 -> 모든파일  // 패키지 내 모든 하위 클래스 가져오기
import ch06.sec12.kumho.AllSeasonTire;

public class Car {
	
	//다른 패키지 클래스 불러오기
	//1)패키지명.클래스
	//ch06.sec12.hankook.Tire tire1 = newch06.sec12.hankook.Tire();


	//2) import 문 사용해서 클래스 불러오기
	Tire tire1 = new Tire();  // => 간단하게 이렇게 불러오고 싶을 때는 import 문(↑)을 사용한다.
							// => import 문이 없으면 오류가 생김
	SnowTire snow1 = new SnowTire();
	AllSeasonTire allSeasonTire = new AllSeasonTire(); 
	}
	
	
	
	}

}
