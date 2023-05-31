package ch05.sec12;

import java.util.Calendar;

public class WeekExample {

	public static void main(String[] args) {
		//week 타입 변수 선언
		Week today = null;
		
		//오늘의 요일 얻기
		Calendar cal = Calendar.getInstance();  //상단에 import java.util.Calendar; 생김
		int week = cal.get(Calendar.DAY_OF_WEEK);  //요일이 들어있음

		//System.out.println(week);  // 일 월 화 수 목 금 토 (1 2 3 4 5 6 7 )
		
		switch (week) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUESDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
		}
		
		System.out.println(today);
	}

}
