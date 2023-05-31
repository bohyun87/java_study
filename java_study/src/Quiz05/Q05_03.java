package Quiz05;

public class Q05_03 {

	public static void main(String[] args) {
		int max = 0;
		int[] arrays = {1, 5, 3, 8, 2};
		
		for (int array : arrays) {
//			System.out.println(array);
			if(max < array) {
				max = array;
			}
			
			// 여기서 출력하면 매번 비교하는 최대 값 모두 출력됨
			// 반복문 빠져나가서 출력	
		}
		System.out.println("최대값: " + max);
		
		
		
//			
//		for(int i=0; i < array.length; i++){
//			if (array[i] > array[i]) {
//				System.out.println(array[i]);
//			
//			} else {
//			}
//		}
	}

}
	