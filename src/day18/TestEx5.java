package day18;

import java.util.Scanner;

public class TestEx5 {

	public static void main(String[] args) {
		/* 두 정수가 주어졌을 때 두 정수의 최대공약수가 1이면 서로수라고 출력하고,
		 * 서로수가 아니면 서로수가 아님이라고 출력하는 코드를 작성하세요.
		 * 단, 메소드를 생성하여 작업할 것. 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("두 수를 입력하세요.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		if(gcd(num1,num2) == 1) {
			System.out.println(num1 + " 와 " + num2 + " 의 최대공약수는 " + gcd(num1,num2) + "이며 서로소입니다 " );
		}else if(gcd(num1,num2) != 1){
			System.out.println(num1 + " 와 " + num2 + " 의 최대공약수는 " + gcd(num1,num2) + "이며 서로소가 아닙니다." );
		}
		scan.close();
	}
	/* 기능 : 두정수가 주어졌을 때의 최대공약수가 gcd = 1 -> "서로수이다" 라고 출력
	 * 		두정수가 주어졌을 때의 최대공약수가 gcd != 1 -> "서로수가 아니다" 라고 출력
	 * 매개변수 : 두정수 => int num1, int num2
	 * 리턴타입 : int
	 * 메소드명 : gcd
	 */
	public static int gcd(int num1, int num2) {
		if(num1 < 0 || num2 < 0)
			throw new ArithmeticException("예외 발생 : 최대공약수는 두 양의 정수가 필요합니다.");
		for(int i = num1; i >= 1; i--) {
			if(num1 % i == 0 && num2 % i ==0) {
				return i;
			}
		}
		return 1;
	}

}
