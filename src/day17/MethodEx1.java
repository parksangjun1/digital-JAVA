package day17;

import java.util.Scanner;

public class MethodEx1 {

	public static void main(String[] args) {
		/*main메소드부터 실행순서를 줄수로 표현
		 * 7>11>12>13>14>15>16>40>41>42>43>44>45>32>33>45>16
		*/ 
		Scanner scan = new Scanner(System.in);
		System.out.println("두 정수와 연산자를 입력하세요.(예 : 1 + 2) :");
		int num1, num2;
		char op;
		try {
		num1 = scan.nextInt();
		op = scan.next().charAt(0);
		num2 = scan.nextInt();
		System.out.printf("%d %c %d = %.1f\n", num1, op, num2, Math(num1,op,num2));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		scan.close();
	}
	//기능 : 두 정수의 합을 반환하는 메소드
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	//기능 : 두 정수의 차를 반환하는 메소드
	public static int sub(int num1, int num2) {
		return num1 - num2;
	}
	//기능 : 두 정수의 곱을 반환하는 메소드 
	public static int mul(int num1, int num2) {
		return num1 * num2;
	}
	//기능 : 정수A를 정수B로 나눈 결과를 반환하는 메소드
	public static double div(int num1, int num2) {
		return (double)num1 / num2;	
	}
	 //기능 : 정수A를 정수B로 나눈 나머지를 반환하는 메소드
	public static int rest(int num1, int num2) {
		return num1 % num2;
	}
	//기능 : 정수A를 정수B를 산술연산자 op의 결과를 반환하는 메소드
	public static double Math(int num1, char op ,int num2) {
		switch(op) {
		case '+' : return sum(num1,num2);
		case '-' : return sub(num1,num2);
		case '*' : return mul(num1,num2);
		case '/' :
			if(num2 == 0) throw new ArithmeticException("예외 발생 :" + op + "0으로 나눌 수 없습니다.");
			return div(num1,num2);
		case '%' :
			if(num2 == 0) throw new ArithmeticException("예외 발생 :" + op + "0으로 나눌 수 없습니다.");
			return rest(num1,num2);
		default : 
			throw new ArithmeticException("예외 발생 :" + op + "는 산술연산자가 아닙니다.");
		}
	}
}
