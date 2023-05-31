package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DateTimeOperationExample {

	public static void main(String[] args) {
		//Date, Calendar : 단순히 날짜를 보여줄때
		//LocalDateTime: 날짜 연산이 가능하다.
		LocalDateTime now = LocalDateTime.now();   //현재 날짜를 구해준다.
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd aHH:mm:ss");
		
		System.out.println("현재시간: " + now.format(dtf));

		System.out.println("3년 후 시간 구하기");
		LocalDateTime result1 = now.plusYears(3);  //3년 후
		System.out.println(result1.format(dtf));
		
		System.out.println("10시간 후 시간 구하기");
		LocalDateTime result2 = now.plusHours(10);  //10시간 후
		System.out.println(result2.format(dtf));
		
		System.out.println("2달 전 시간 구하기");
		LocalDateTime result3 = now.minusMonths(2);  // 2달 전
		System.out.println(result3.format(dtf));
		
		System.out.println("7시간 후 시간 구하기");
		LocalDateTime result4 = now.plusDays(7);  //7일 후 구하기
		System.out.println(result4.format(dtf));
		
		
	}

}
