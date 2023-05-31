package Quiz06;

public class Example1 {
	static int max = 0;

	public static int max(int[] arr) {
		//주어진 배열이 null 이거나 크기가 0이면 -999999 반환
		if (arr == null || arr.length == 0) {
			return -999999;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		62
		return max;
	}
	

	public static void main(String[] args) {
		int[] data = {3, 2, 9, 4, 7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값: " + max(data));
		System.out.println("최대값: " + max(null));
		System.out.println("최대값: " + max(new int[] {}));

}
}
