package day6;

public class test5 {

	public static void main(String[] args) {
		//정수형 배열 5개짜리를 생성하여 배열의 값을 출력하세요.		
		int arr[] = new int[5];
		//배열의값을 0번지부터
		printArray(arr);
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i;
		}				
		printArray(arr);
		
		int num = 5;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]==num) {
				System.out.println(num + "는 있습니다.");
				break;				
			}
			//arr.length-1 배열은 arr의 마지막 번지이다.
			// 앞에서 중복검사를 하기 때문에 마지막번이면서 여기까지 왔다는것은 
			// 마지막번지까지 중복된 내용이 없다는 뜻이다.
			
			if(i==arr.length-1) { 
				System.out.println(num + "은 없습니다.");
			}
			
		}
		int num2 = 6;
		
		if(isDuplicated(arr,num2)) {
			System.out.println(num2 + "는 있습니다.");
		}else {
			System.out.println(num2 + "는 없습니다.");
		}
		
		
		
		
		/* num에 1을 저장 후 num의 값이 arr에 있는지 없는지 
		 * 확인하여 있으면 있습니다.
		 * 없으면 없습니다.라고 출력하는 코드를 작성하세요.()
		 */
		
	}
	/* 기능 : 배열이 주어지면 주어진 배열의 각 원소의 값들을 출력하는 메서드
	 * 매개변수 : 배열 => int arr[]
	 * 리턴타입 : 
	 * 메소드명 : printArray
	 */ 
	public static void printArray(int []arr) {
		
		for(int tmp :arr) {		
			System.out.print(tmp+" ");
		}
		System.out.println();
	}
	/* 기능 : 배열 arr에 정수 num의 값이 있는지 없는지 확인하는 메서드
	 * 매개변수 : 배열,정수 => int []arr, int num
	 * 리턴타입 : 있는지 없는지 = > boolean
	 * 메서드명 : isDuplicated
	 * 
	 * 
	 */
	public static boolean isDuplicated(int []arr, int num2) {//리턴타입 //메서드명(매개변수)		
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]==num2) {
				return  true;				
			}			
		}
		return false;
	}
}  


