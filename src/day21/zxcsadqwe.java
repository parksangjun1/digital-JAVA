package day21;

import java.util.Scanner;

public class zxcsadqwe {

	public static void main(String[] args) {
		/* 세 정수를 입력받아 입력받은 정수의 합과 평균을 구하세요.
		 * 평균은 소수점 둘째자리까지 출력 
		///////////////////////////////////////////////////////////////////////////// 		
		Scanner scan = new Scanner(System.in);
		System.out.println("세 정수를 입력하세요.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		double num4 = (double)(num1 + num2 + num3) / 3;
		System.out.printf("%d + %d + %d = %.2f\n ", num1,num2,num3,num4);
		scan.close();*/
		/* 5개짜리 배열을 만들어서 배열에 5개의 정수를 입력 한 후, 입력한 정수의 합과 평균을 구하세요.
		 *
		 */
		/////////////////////////////////////////////////////////////////////////////
		/*
		int arr[] = new int[5];
		int sum = 0;
		double res = 0.0;
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			sum += arr[i];
		}
		res = (double)sum / arr.length;
		System.out.println("합 : " + sum);
		System.out.printf("평균 : %.2f ", res);
		scan.close();
		*/
		
		
		/* 5개짜리 배열을 만들어서 배열에 5개의 정수를 입력 한 후, 
		 * 입력한 정수중에 가장 큰 수를 출력하는 코드를 작성하세요.
		 */
		//////////////////////////////////////////////////////////////////////////
		/*int arr[] = new int[5];
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");		
		for(int i = 0; i < arr.length; i++) {
			num = scan.nextInt();
			arr[i] = num;
		}	
		if(arr[0] > arr[1] && arr[0] > arr[2] && arr[0] > arr[3] && arr[0] > arr[4]) {
			System.out.println(arr[0]);
		}else if(arr[1] > arr[0] && arr[1] > arr[2] && arr[1] > arr[3] && arr[1] > arr[4]) {
			System.out.println(arr[1]);			
		}else if(arr[2] > arr[0] && arr[2] > arr[1] && arr[2] > arr[3] && arr[2] > arr[4]) {
			System.out.println(arr[2]);
		}else if(arr[3] > arr[0] && arr[3] > arr[1] && arr[3] > arr[2] && arr[3] > arr[4]){
			System.out.println(arr[3]);
		}else {
			System.out.println(arr[4]);
		}
		scan.close(); */
		//////////////////////////////////////////////////////////////////////////
		/*Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		int num;		
		System.out.println("정수를 입력하세요.");	
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();			
		}
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
		scan.close();
		*/
		///////////////////////////////////////////////////////////////////////////////
		
		/* 9개짜리 배열을 만들어서 2단의 결과를 배열에 저장하는 코드를 작성.
		 * 2 X 1 = 2
		 * 2 x 2 = 4
		 * 2 x 3 = 6
		 * i는 1부터 9까지 증가 		 
		 */
		/*
		int arr [] = new int[9];
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		int num = 2;
		for(int i = 0; i < arr.length; i++) {
				cnt++;
			System.out.print(cnt + " ");
		}for(int j = 1; j <= 9; j++) {
				arr[j] = num * j;
			System.out.println(arr[j]);	
		}
		/*
		int num = 2;
		for(int i = 1; i <= 9; i++ ) {
			System.out.printf("%d",num*i);
		}*/
		int arr [] = new int[9];
		for(int i = 0; i < 9; i++) {
			arr[i] = 2 * (i+1);
			System.out.print(2 * (i+1) + " ");
		}
	}
}
