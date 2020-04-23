package day5;

import java.util.Scanner;

public class MethodEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2;
		char c;
		Scanner scan = new Scanner(System.in);		
		System.out.print("두 정수와 연산자를 입력하세요(예: 1 + 2)");
		n1 = scan.nextInt();		
		c = scan.next().charAt(0);
		n2 = scan.nextInt();
		System.out.printf("%d %c %d = %.2f\n",n1,c,n2,math(n1, c, n2));
		scan.close();
		
	}
	/* 기능 : 두 정수와 산술연산자가 주어지면 산술연산 결과를 알려주는 메서드 
	 * 		단, 예외 상황은 없다고 가정한다.
	 * 		잘못된 연산자가 들어오거나, 0으로 나누는 경우
	 * 접근제한자 static 리턴타입 메서드명(매개변수)
	 * 매개변수 : 두 정수 => char ch, int num1, int num2;
	 * 리턴타입 : 산술연산자 => 문자 => double
	 * 메서드명 : math
	 */
	


	public static double math(int num1, char ch ,int num2) {
		double res = 0.0;
		switch(ch) {
		case '+': res = num1 + num2; break;
		case '-': res = num1 - num2; break;
		case '*': res = num1 * num2; break;
		case '%': res = num1 % num2; break;
		case '/': res = (double)num1 / num2; break;
		}
		
		return res; //에러를 없애기위해 사용
		
	}
}	
