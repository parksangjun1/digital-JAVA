package day6;

public class testEx4 {

	public static void main(String[] args) {
		/* 정수형 배열 5개짜리를 생성하여
		 * 0번지에는 0을 입력
		 * 1번지에는 1을 입력
		 * 배열의 값을 출력하여 제대로 들어갔는지 확인하세요.
		 */
		int arr[] = new int[5];
		//배열의 값을 접근하는 반복문
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");			
		}
		System.out.println();
	}
	/* 기능 : 배열이 주어지면 주어진 배열의 각 원소의 값들을 출력하는 메서드
	 * 매개변수 : 배열 => int arr[]
	 * 리턴타입 : 
	 * 메소드명 : printArray
	 */ 

}
