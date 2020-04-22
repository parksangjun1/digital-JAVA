package day4;

import java.util.Scanner;

public class practiceEX1 {

	public static void main(String[] args) {
		// 두 정수와 문자하나를 입력받아 출력하는 코드를 작성하세요.
		// 두정수와 문자 하나를 입력받아 => 
		// 정수형 변수 2개를 선언하고, 문자형 변수 1개를 선언후 Scanner를 통해
		// 정수와 문자를 입력받을 수있다.
		int num1, num3; 
		char ch;
		//String str;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.printf("정수를 입력하세요.");
		num1 = scan.nextInt();
		ch = scan.next().charAt(0);
		//str = scan.next();
		num3 = scan.nextInt();
		
		
		/* System.out.println("" + num1 + " " + ch + " " + num3);
		 System.out.printf("%d %s %d\n", num1, ch ,num3);
		
		
		/*입력받은 문자가 +이면 두 수의 합을 출력하고
		 * -이면 두수의 차를 출력하고
		 * /이면 두수의 남은 결과를 출력하고
		 * *이면 두수의 곱한 결과를 출력하고
		 * %이면 두수의 나머지 결과를 출력하는 코드를 작성하세요.
		 */
		
		if(ch == '+'){
		    System.out.printf("%d %c %d = %d\n",num1,ch,num3,num1+num3);
		    
		}else if(ch == '-') {
			System.out.printf("%d %c %d = %d\n",num1,ch,num3,num1-num3);
				
		}else if(ch == '/') {
			System.out.printf("%d %c %d = %.2f\n",num1,ch,num3,(double)num1/num3);
			
		}else if(ch == '*') {
			System.out.printf("%d %c %d = %d\n",num1,ch,num3,num1*num3);
			
		}else if(ch == '%') {
			System.out.printf("%d %c %d = %d\n",num1,ch,num3,num1%num3);
		}else {
			System.out.println(ch + "는 산술연산자가 아닙니다.");
		}
		scan.close();
		
		switch(ch) {
		case '+':
			System.out.printf("%d %c %d = %d\n",num1,ch,num3,num1+num3);
			break;
		case '-':
			System.out.printf("%d %c %d = %d\n",num1,ch,num3,num1-num3);
			break;
		case '/':
			System.out.printf("%d %c %d = %d\n",num1,ch,num3,num1/num3);
			break;
		case '*':
			System.out.printf("%d %c %d = %d\n",num1,ch,num3,num1*num3);
			break;
		case '%':
			System.out.printf("%d %c %d = %d\n",num1,ch,num3,num1%num3);
			break;
		default:
			System.out.println(ch + "는 산술연산자가 아닙니다.");
		}


	}

}
