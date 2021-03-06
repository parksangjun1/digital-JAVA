package day13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx5 {

	public static void main(String[] args) {
		/* 정수값을 반복적으로 받는 코드에서 실수로 정수대신 문자를 입력했을 때 예외를 처리하도록 코드를 작성하라.
		 * 예 )) 
		 * 정수를 입력하세요 : 1
		 * 정수를 입력하세요 : 1
		 * 정수를 입력하세요 : 100
		 * 정수를 입력하세요 : a
		 * 예외가 발생했습니다 : 문자를 입력했습니다 - a
		 * 
		 */
		/*
		int num = 0;
		char ch = ' ';
		Scanner scan = new Scanner(System.in);		
		System.out.println("정수를 입력하세요 : ");
		try {
			for(int i = 0; i <= num; i++) {
				num = scan.nextInt();
				System.out.println(num);
				ch = scan.next().charAt(0);	
				System.out.println(ch);											
				if(ch == 'a') {
					throw new Exception("예외가 발생했습니다. : 문자를 입력했습니다. " + ch);
				}
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		scan.close();
		*/
		Scanner scan = new Scanner(System.in);
		try {
			while(true) {
				System.out.println("정수를 입력하세요 : ");
				int num = scan.nextInt();						
			}			
		}catch(InputMismatchException e) {
			System.out.println("예외가 발생했습니다 : 정수를 입력해야되는데 문자를 입력했습니다.");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("예외가 발생했습니다.");
		}
		System.out.println("프로그램을 종료했습니다.");
		scan.close();
		
	}		
}

