package day2;

import java.util.Scanner;

public class switchEx2 {

	public static void main(String[] args) {
		// 달(월)이 주어지면 해당하는 달의 마지막일을 출력하는 코드를 
		// switch문을 이용하여 작성하세요.
		// 31 : 1 3 5 7 8 10 12
		// 30 : 4 6 9 11
		// 28 : 2
		int month = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("달(월)을 입력하시오.");
		month = scan.nextInt();
		scan.close();
		
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("31일까지 입니다.");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일까지 입니다.");
			break;
		case 2:
			System.out.println("28일까지 입니다.");
			break;
		}
	}

}
