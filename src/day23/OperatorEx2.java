package day23;

import java.util.Scanner;

public class OperatorEx2 {

	public static void main(String[] args) {
		/* 정수 num가 짝수이면 true를 홀수이면 false를 출력하는 코드를 조건문없이 작성해보세요.
		 * 예)
		 */
		
		int num = 10;
		int res = ++num + num++ + ++num;
		System.out.println(res);
		System.out.println(num);
	}
}
