package ch15.sec05.exam001;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		//TreeSet 컬렉션 생성
		TreeSet<Integer> scores = new TreeSet<>();
		
		//점수저장(데이터 추가) . Integer 객체저장
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		
		//모든 데이터 출력하기
		for(Integer s : scores) {
			System.out.println(s);
		}
		
		System.out.println();
		
		//특정 데이터 출력하기
		System.out.println("가장 낮은 점수: " + scores.first()); 
		System.out.println("가장 높은 점수: " + scores.last()); 
		
		System.out.println("95점 아래 점수: " + scores.lower(95));
		System.out.println("95점 위의 점수: " + scores.higher(95));
		
		System.out.println("95점이거나 바로 아래 점수: " + scores.floor(95));
		System.out.println("85점이거나 바로 위의 점수: " + scores.ceiling(85));
		
		System.out.println();
		
		
		System.out.println("=============");
		System.out.println("내림차순 정렬");
		//내림차순으로 가져오기 => 기본 오름차순
		NavigableSet<Integer> descendingScores = scores.descendingSet(); 
		for(Integer s : descendingScores) {
			System.out.println(s);
		}
		System.out.println();
		
		
		System.out.println("=============");
		System.out.println("80이상, 80이하 출력하기");
		System.out.println("=============");		
		//범위 검색 (80 <=)  80이상 검색
		NavigableSet<Integer> rangeSet = scores.tailSet(80, true);   //tailSet =>  어떤 값보다 큰값을 구하고 싶을 때
		NavigableSet<Integer> rangeSet2 = scores.headSet(80, true);   //tailSet =>  어떤 값보다 작은값 구하고 싶을 때
		for(Integer s : rangeSet) {
			System.out.println(s);
		}
		System.out.println();
		System.out.println("=============");
		System.out.println("80이하 출력하기" );
		System.out.println("=============");
		for(Integer s : rangeSet2) {
			System.out.println(s);
		}
		System.out.println();
		
		
		System.out.println("=============");
		System.out.println("80~90사이 출력하기");
		System.out.println("=============");		
		//범위검색(80 <= scores < 90)
		NavigableSet<Integer> rangeSet3 = scores.subSet(80, true, 90, false);  // 80은 포함 하니까 true,  90은 포함하지 않으니까 false
		for(Integer s : rangeSet3) {
			System.out.println(s);
		}
		
		
		
		
		
	}

}
