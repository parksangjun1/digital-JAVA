package day6;

public class methodEx1 {

	public static void main(String[] args) {
		/* 매개변수가 일반변수이면 매개변수의 원본값이 변경되지 않는다
		 * 
		 */
		int num1 = 10;
		int num2 = 20;
		System.out.printf("num1=%d, num2=%d(main)\n", num1,num2);
		/////////////////////////////////////////////////////////
		
		swap(num1,num2);
		System.out.printf("num1=%d, num2=%d(main)\n", num1,num2);
		//////////////////////////////////////////////////////////
		int arr[] = new int[4];
		for(int tmp :arr) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		/////////////////////////매개변수가 참조 변수이면 매개변수의 원본값을 바꿀수있다.
		setArray(arr,5);
		for(int tmp :arr) {
			System.out.print(tmp+" ");
		}
	}
	//////////////////////////////////////////////////////////
	public static void swap(int num1,int num2) {
		int tmp = num1;
		num1 = num2;
		num2 = tmp;
		System.out.printf("num1=%d, num2=%d(swap)\n", num1,num2);
		
	}
	/*기능 : 배열의 모든 값을 num로 변경하는 메소드
	 * 
	 */
	public static void setArray(int []arr,int num) {
		for(int i = 0; i< arr.length; i++) {
			arr[i] = num;
		}
	}
}
