package day6;

import java.util.Scanner;

public class textEx2 {

	public static void main(String[] args) {
		/* 1.문자를 입력받아 문자를 출력하세요.
		 * 2.문자를 입력받아 문자를 5번 출력하세요
		 * 3.입력하세요:q
		 *   출력 : 종료합니다.
		 * 4.더이상 반복되지 않도록 수정  
		 * 5.문자를 입력받아 출력하는 과정을 q가 입력될때까지 반복하시오.
		 */
		
/*		String sr;
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력하세요.");
		sr = scan.nextLine();
		System.out.println("입력한 문자는 : " + sr);
		scan.close();
		System.out.println("-----------------------------");
////////////////////////////////////////////////////////////*/
		
		Scanner scan = new Scanner(System.in);
		char ch;
						
		for(; ;) { //무한루프로 만들수 있다.
			System.out.print("문자를 입력하세요 : ");		
			ch = scan.next().charAt(0);
			if(ch != 'q' ) { //조건문 출력이 1개이면 '{}'를 생략할 수 있다.					
				System.out.println("출력 : " + ch );				
			}else { 
				System.out.println("종료합니다");
				break;
			}				
		}
		scan.close();
	}
}
