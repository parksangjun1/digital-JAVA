package day4;

public class practiceEx2 {

	public static void main(String[] args) {
		// 정수 10개를 저장할 수 있는 배열을 선언하고 생성하세요.
		// 1부터 10까지 차례대로 배열에 저장하세요.
		// 저장된 배열의 값을 출력하세요.
		// 인덱스(번지)가 짝수이면 현재 저장된 수에 2를 곱해서 저장하세요.
		// 저장된 배열의 값을 다시 출력하세요.
		int []arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
	
		}
		// 0번지부터 9번지까지 배열의 값을 출력
		// for(i는 0번지부터 1씩증가
		// i번지의 값을 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.printf(" %2d ", arr[i]);
		}
		System.out.println();
		
		for(int i = 0; i < arr.length; i+=2) {
			arr[i] = arr[i] * 2; 
			//arr[i] *= 2;
			
				
		}
			
		
		for(int tmp: arr) {
			System.out.printf(" %2d ", tmp);
		}
		System.out.println();
		
	
    }
}
