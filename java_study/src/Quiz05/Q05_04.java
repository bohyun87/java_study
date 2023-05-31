package Quiz05;

public class Q05_04 {

	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		
		int totalStudent = 0;
		int totalSum = 0;
		
		
		for (int i=0; i <array.length; i++ ) {
			totalStudent += array[i].length;
//			System.out.println(totalStudent);	
			for(int k=0; k < array[i].length; k++) {
				totalSum += array[i][k];
			}
		}
		// 이중 for문 모두 빠져나와서 출력
		// 안그러면 모든 반의 합산 다 출력됨
		System.out.println("전체 학생의 합산 점수: " + totalSum);
		
		double totalAvg = (double) totalSum / totalStudent;
		System.out.println("전체 학생의 평균 점수: " + totalAvg);
				
	}

}
