package day3;

import java.util.Scanner;

public class ForEx7 {

	public static void main(String[] args) {
		/* 두정수 num1과 num2의 최대 공약수를 구하는 코드를 구하세요.
		 * 최대공약수 : 공약수 중에서 가장 큰수
		 * 공약수 : 두수의 약수중 공통으로 있는 수
		 * 약수 : 나누어 떨어지는 수
		 * 8의 약수 : 1 2 4 8
		 * 12의 약수 : 1 2 3 4 6 12
		 * 8과 12의 공약수 : 1 2 4
		 * 8과 12의 최대공약수 : 4
		 * 1. 반복횟수 : i는 1부터 num1까지 1씩증가
		 * 2. 규칙성 : i가 num1의 약수(이거나) i가 num2의 약수이(면) gcd에 i를 저장
		 * 3. 반복문 종료 후 : gcd를 출력
		 */
		
		
		
		int num1,num2; 
		int gcd = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("두 정수를 입력하세요");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		scan.close();
		//1. 반복횟수 : i는 1부터 num1까지 1씩증가
		for(int i = 1; i <= num1; i++) {
			
			//2. 규칙성 : (i가 num1의 약수(이고) i가 num2의 약수이)''조건식'' <-(면)
			if(num1 % i == 0 && num2 % i == 0) {
			//gcd에 i를 저장
				gcd = i;
			}
			
		}
		//3. 반복문 종료 후 : gcd를 출력
		System.out.printf("%d와 %d의 최대 공약수 : %d\n",num1, num2, gcd);
		
		
	}

}
