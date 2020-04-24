package day6;

public class practice {
	
	public static void main(String[] args) {
		int arr[] = new int[2];
		int num = 0;
		if(isDuplicated(arr,num)) {
			System.out.println(num + "는 있다");
		}else {
			System.out.println(num + "는 없다");
		}
		/* 기능 : 배열 arr에 정수 num의 값이 있는지 없는지 확인하는 메서드
		 * 매개변수 : 배열,정수 => int []arr, int num
		 * 리턴타입 : 있는지 없는지 = > boolean
		 * 메서드명 : isDuplicated
		 * 		
		 */
	}
	public static boolean isDuplicated(int []arr, int num) {
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i]==num) {
				return true;
			}
		}return false;
	}
}
