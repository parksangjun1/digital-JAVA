package day3;

import java.util.Scanner;

public class whileEx3 {

	public static void main(String[] args) {
		/* 두 정수 num1과 num2의 최소 공배수를 구하는 코드를 작성하세요.
		 * 최소공배수 : 두 수의 공배수중 가장 작은 배수
		 * 공배수 : 두 수의 배수중 공통인 배수
		 * 10의 배수 : 10 20 30 40 50
		 * 15의 배수 : 15 30 45 60 75
		 * 10과 15의 공배수 : 30 60 90
		 * 10과 15의 최소공배수 : 30
		 * 1.반복횟수 : i는 1부터 num1*num2까지 1씩 증가
		 * 2.규칙성 : (i가 num1의 배수이고 i가 num2의 배수) 조건문 (면) i를 출력하고 반복문을 종료 
		 * 3.반복문 종료 후 : 없음
		 */
		int num1 = 0, num2 = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("두 수를 입력하시오.");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		scan.close();
		
		int i;
		
		//초기값
		i=1;
		
		while(i <= num1*num2 ) {
			//조건식 : (i가 num1의 배수이고 i가 num2의 배수이면)
			if(i % num1 == 0 && i % num2 == 0 ) {
				System.out.printf("%d와 %d의 최소 공배수 : %d\n", num1,num2,i);
				break;
			}
			i++;	
		}
		
		
		
	}

}
