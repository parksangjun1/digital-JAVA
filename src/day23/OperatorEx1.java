package day23;

import java.util.Scanner;

public class OperatorEx1 {

	public static void main(String[] args) {
		/* 정수 num가 짝수이면 true를 홀수이면 false를 출력하는 코드를 조건문없이 작성해보세요.
		 * 예)
		 */
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(num + "는 짝수입니까 ? " + (num % 2 == 0)); 
		System.out.println(num + "는 홀수입니까 ? " + (num % 2 == 1));
	}
}
