package day18;

import java.util.*;

public class TestEx10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = scan.nextInt();
		System.out.println(num);
		
		
		int num1 = num % 10;
		System.out.println("결과 :" + num1);
		System.out.println(num - num1);
	}
}
/*정수를 입력받아 입력받은 정수를 거꾸로 출력하는 코드를 작성하세여.

정수를 입력하세요 : 12345
결과 : 54321

12345 % 10 = 5
1234 % 10 = 4
123 % 10 = 3
12 % 10 = 2
1 % 10 = 1
 * 
*/
