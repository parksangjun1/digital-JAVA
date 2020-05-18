package day18;

import java.util.*;

public class TestEx6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		if(isCoprime(num1,num2)) {
			System.out.printf("%d와 %d는 서로소 관계\n" , num1 ,num2);
		}else {
			System.out.printf("%d와 %d는 서로소 관계가아님\n" , num1 ,num2);
		}

	}
	/* 기능 : 두 정수가 서로소 관계이면 true, 아니면 false의 값을 알려주는 메소드
	 * 매개변수 : 두정수 => int num1, int num2
	 * 리턴타입 : boolean
	 * 메소드명 : isCoprime
	 */
	public static boolean isCoprime(int num1, int num2) {
		if(num1 == num2) return false;
		if(homeworkEx2.gcd(num1, num2) == 1)
			return true;
		return false;
		//return homeworkEx2.gcd(num1, num2) == 1? true : false;
	}
}
