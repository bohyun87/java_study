package ch15.sec04.exam01;

import java.util.*;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		//Map<key의 타입, 저장할 값의 타입>을 명시한다.
		Map<String, Integer> map = new HashMap<>();
		//Integer => Board 객체로 바꿔주면 키값을 얻어올때 int 타입이 아니고 Board 로 타입지정
		// sys out 에서 .getContent()로 얻어온다.
		// Board b = map.get(key1)   => System.out.println(key1 + ":" + b.getcontent());
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		
		System.out.println("총 Entry 수: " + map.size());
		//HashMap 은 키 의 값이 같으면 중복저장이 안됨. 그래서 앤트리 3개 가 출력됨
		System.out.println();
		
		//키로 값을 얻기
		String key1 = "홍길동";
		int value = map.get(key1);
		System.out.println(key1 + ":" + value);
		// 중복이 되면 기존에 있던 키의 값을 없애도 최후에 입력한 키의 값으로 덮어쓴다
		
		String key2 = "신용권";
		int value1 = map.get(key2);
		System.out.println(key2 + ":" + value1);
		System.out.println("==========================");
		System.out.println();
		
		
		//전체 데이터 출력하는 방법1
		Set<String> keySet = map.keySet() ;
		Iterator<String> keyIterator = keySet.iterator();
		
		//while 문으로 돌려서 전체 키 값 가져오기
		while(keyIterator.hasNext()) {  //키의 갯수만큼 반복해준다.
			String k = keyIterator.next();  //키를 하나씩 가져온다.
			int v = map.get(k);  // 위에서 키의 값을 int 로 했기 때문에 int 타입으로 불러오기
			System.out.println(k + ":" + v);
		}
		
		
		//전체 데이터 출력하는 방법2
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryiterator = entrySet.iterator();
	
		while(entryiterator.hasNext()) {
			Entry<String, Integer> entry = entryiterator.next();
			String k = entry.getKey();
			int v = entry.getValue();
			System.out.println(k + ":" + v);
		}
		System.out.println("==========================");
		System.out.println();
		
		
		
		
		map.remove("홍길동");  //키값으로 데이터 삭제하기
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
