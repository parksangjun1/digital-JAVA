package day3;

import java.util.Scanner;

public class arrayEx1 {

	public static void main(String[] args) {
		// 배열이 없으면 아래와 같이 다섯개의 정보를 입력받아 저장하려면
		// 다섯개의 변수를 선언하고 Scanner를 통해 직접 입력받는 코드를 작성해야한다.
		// 하지만 배열을 이용하면 효율적으로 입력받는 코드를 작성할 수 있다.
		// 아래의 코드는 비효율적인 코드이다.
		
		Scanner scan = new Scanner(System.in);
		/*n1 = scan.nextInt();
		  n2 = scan.nextInt();
		  n3 = scan.nextInt();
		  n4 = scan.nextInt();
		  n5 = scan.nextInt();
		*/
		int [] arr1, arr2;   // arr1과 arr2는 둘다 배열
		int arr3[], arr4;    // arr3는 배열 arr4는 일반 변수 arr4는 배열선언이다.
		arr1 = new int [5];
		
		int []arr5 = new int[5]; //배열 선언과 동시에 생성
		
		for(int i = 0; i < arr1.length; i++) {   //arr1.length; 배열의 길이를 알려준다.
			arr1[i] = scan.nextInt();
		}
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		/*1.자료형[] 배열명;

		 2.자료형 배열명 [];*/
		scan.close();
	}

}
