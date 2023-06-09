package ch12.sec07;

import java.util.*;

public class RandomExample {
	
	public static void main(String[] args) {
		//두 정수 사이의 랜덤 값 구하는 공식(start 부터 시작하는 n개의 정수 구하기)
		// 값 = (int) (Math.random() * n) + start;
		
		//선택번호
		int[] selectNumber = new int[6];
		Random random = new Random(3);
		System.out.println("선택번호: ");
		
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;   //0 <= ~ <45  / 0~44
			System.out.print(selectNumber[i] + " ");
		}
		
		System.out.println();
		System.out.println("===============================");
		
		//당첨번호
		int[] winningNumber = new int[6];
		random = new Random(5);
		System.out.println("당첨번호: ");
		
		for(int i=0; i<6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;   //0 <= ~ <45  / 0~44
			System.out.print(winningNumber[i] + " ");
		}
		
		System.out.println();
		System.out.println("===============================");
		
		
		//당첨여부
		Arrays.sort(selectNumber);  //sort: 배열정렬 => 오름차순으로 정렬
		Arrays.sort(winningNumber);
		
		boolean result = Arrays.equals(selectNumber, winningNumber); //배열항목 비교
		System.out.println("당첨여부: ");
		if(result) {
			System.out.println("1등에 당첨되셨습니다.");
		} else {
			System.out.println("당첨되지 않았습니다.");
			
		}
		
		
	}
}
