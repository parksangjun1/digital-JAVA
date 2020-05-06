package day2;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		//변수 num를 선언하고 num의 초기값을 설정하여 num가 0이면 0이라고 출력하고, num가 양수이면 양수라고 출력하고
		//num가 음수이면 음수라고 출력하는 코드를 if문을 이용하여 작성하세요.
		
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력하시오.");
		num = scan.nextInt();
		scan.close();
		
		if(num == 0) {
			System.out.println("은 0입니다.");
		}else if(num > 0) {
			System.out.println("는 양수입니다");
					
		}else if(num < 0) {
			System.out.println("는 음수입니다");
			
		}
				
		

	}

}
