package day7;

import java.util.Scanner;

public class methodEx4 {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("입력하세요");
		num = scan.nextInt();		
		park(num);
		
		System.out.println("-------------------------------------------------------");
		
		int start = 10, end = 19;
		int res = park(num,start,end);
		
		if(res == 0) {
			System.out.println("0단의 모든 값은 0입니다.");
		}else if(res == -1) {
			System.out.println("구구단의 시작 번호와 끝 번호가 바뀌었습니다.");
		}
		scan.close();
	}	
	/* 기능 :구구단의 한 단을 출력하는 메소드
	 * num가 주어면 주어진 num단을 출력하는 예제
	 * 매개변수 : 단 = int num
	 * 리턴타입 : 없음(void)
	 * 메서드명 : park 
	 */
	public static void park(int num) {
		
		for(int i = 1; i <= 9; i ++) {
			System.out.printf("%d x %d = %d\n", num, i, num*i);
		}
	}
	
	/* 기능 :구구단의 한 단을 출력하는 메소드
	 * num가 주어면 주어진 num단을 출력하는 예제
	 * 리턴값을 이용하여 예외처리까지 신경쓰는 예제
	 * 매개변수 : 단, 단의 시작, 단의 끝 = int num, int start, int end
	 * 리턴타입 : 0 => 0단이 입력됨 => 출력 안함.
	 * 		   1 => 정상출력
	 * 		  -1 => start > end 경우 => 출력안함.
	 * 		   ====> ''''int''''	
	 * 메서드명 : park 
	 */
	public static int park(int num, int start, int end) {
		if(num <= 0)
			return 0;
		if(start > end)
			return -1;
		for(int i = start; i <= end; i ++) {
			System.out.printf("%d x %d = %d\n", num, i, num*i);
		}return 1;
	}
		
}
