package day13;

import java.util.Scanner;

public class ExceptionEx4 {

	public static void main(String[] args) {
		// 반복문을 통해 숫자나 문자를 입력받고 입력받은 문자가 1이면 1입니다 라는 예외를 발생시키는 코드를 작성.
		
		char ch = ' ';		
		Scanner scan = new Scanner(System.in);
		try {
		System.out.println("문자를 입력하세요.");		
			for(int i = 0; i <= ch; i++) {
			ch = scan.next().charAt(0);
			System.out.println(ch);
				if(ch == '1') {
					throw new Exception("예외가 발생했습니다. : " + ch);			
				}
			}
			//실행문1
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			//실행문1
		}finally {
			//예외 발생과 관련없이 무조건 실행되어야 하는 코드
			//위와 같이'실행문1'을 두번 써야될것을 한번에 써야될 때 파이널리 안에 넣어 쓴다.
		}
		scan.close();
	}

}
