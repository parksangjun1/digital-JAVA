package day1;

import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.print("정수를 입력하세요: ");
		num = scan.nextInt();
		System.out.println("입력한 정수:" + num);
		scan.close();
	
	}
}