package day18;

import java.util.Scanner;

public class TestEx4 {

	public static void main(String[] args) {
		/* 정수가 주어졌을 때 해당 정수가 소수인지 아닌지 출력하는 코드를 작성하세요. 단, 메소드를 생성하여 작업할 것.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하삼");
		int num = scan.nextInt();
		try {
		if(qqqq(num)) {
			System.out.println(num + "는 소수 입니다.");
		}else {
			System.out.println(num + "는 소수가 아닙니다.");
		}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		scan.close();
	}
	/* 기능 : 정수가 주어지면 정수가 소수인지 아닌지.
	 * 매개변수 : int num
	 * 리턴타입 : boolean
	 * 매소드명 : qqqq
	 */
	public static boolean qqqq(int num) {		
		if(num == 1) {
			throw new ArithmeticException("예외발생 : 1은 소수도,합성수도 아닙니다.");			
		}
		if(num < 1) {
			throw new ArithmeticException("예외발생 : 음수는 소수도,합성수도 아닙니다.");			
		}
		for(int i = 2; i < num; i ++) 
		if(num % i == 0 ) {
			return false;							
		}
		return true;
	}
}
