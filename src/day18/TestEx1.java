package day18;

import java.util.Scanner;

public class TestEx1 {

	public static void main(String[] args) {
		/*1. 성적을 입력받아 입력받은 성적이 어떤 학점인지 판별하는 코드를 작성하요.

		A : 90이상 100이하
		B : 80이상 90미만
		C : 70 ~ 80
		D:  60 ~ 70
		F : 0 ~ 60
		*/

		
		Scanner scan = new Scanner(System.in);
		System.out.println("성적을 입력하세요 : ");
		int num = scan.nextInt();
		if(num < 0 )
			throw new ArithmeticException("예외 발생 : 해당 점수는 음수입니다.");	
		if(100 >= num && num >= 90  ) {
			System.out.println("A학점 입니다.");
		}else if(90 > num && num >= 80)   {
			System.out.println("B학점 입니다.");
		}else if(80 > num && num >= 70  ) {
			System.out.println("C학점 입니다.");
		}else if(70 > num && num >= 60  ) {
			System.out.println("D학점 입니다.");
		}else if(60 > num && num >= 0  ){
			System.out.println("F학점입니다.");
		}
	}

}
