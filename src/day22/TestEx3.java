package day22;

import java.util.Scanner;

public class TestEx3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[4];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}scan.close();
		System.out.println(sum(arr));
		System.out.printf("%.2f", div(arr));
	}
	public static int sum(int arr []) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i]; 
		}
		return sum;
	}
	/* 기능 : 주어진 배열안에 수를 합하여 알려주는 메소드
	 * 매개변수 : 배열 => arr[]
	 * 리턴타입 : 합 : int
	 * 메소드명 : sum
	 */
	public static double div(int arr[]) {
		double res = 0.0;		
		return res = res = (double)sum(arr) / arr.length;
	}
	/* 기능 : 배열안의 더한 수를 배열길이만큼 나누어 평균을 구하여 알려주는 메소드
	 * 매개변수 : 배열, 입력받았던 수 => arr[], Scanner scan
	 * 리턴타입 : 평균구하기 : double
	 * 메소드명 : sum
	 */
}
