package day6;

import java.util.Scanner;

public class testEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* a
 * ab
 * abc
 * abcd
 * 
 * 0
 * 01
 * 012
 * 0123
 */
	int num = 5;
		for(int i = 0; i< 5; i++) {//i는 숫자다.
		for(int j=0; j<=i; j++) {//j는 열이다.
			System.out.print((char)('a'+j));
		}
		System.out.println();
		}
		/* 문자상수 a + 상수 1을 하면 자료형변환이 일어나지 않고 더해지기 때문에 
		 * 결과가 문자 b가 나오면 바로 문자형 변수 ch에 저장이 가능하다.
		 */
		char ch = 'a' +1;
		//ch = (char)(ch + 1);
		
		/* 문자변수ch + 상수를 하면 문자 변수ch가 정수형 int로 형변환되어 더해지기 때문에
		 * 결과가 정수가 된다.
		 */
		System.out.println(ch + 1);
		System.out.println((char)(ch+1));
		System.out.println("--------------------------------------------------");
		//--------------------------------------------------------------------------//
		
		int row,  col; 
		int cnt = 1;
		Scanner scan = new Scanner(System.in);
		row = scan.nextInt();
		col = scan.nextInt();
	
		for(int i = 0; i < row; i++) {
			for(int j = 0; j< col; j++) {
				System.out.printf("%2d ", cnt);
				cnt++;  
			}
			System.out.println();
			
		}
	}
	

}
