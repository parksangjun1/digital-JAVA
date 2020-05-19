package day19;

import java.util.*;

public class TestEx1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = scan.nextInt();
		int tmp = num;
		String res = "";
		while(tmp != 0) {
			res += tmp % 10;
			tmp = tmp / 10; // 정수로 나누면 1234.5 가나오는데 정수는 소수점을 표현할수없으므로 /10으로 나누어면 -> 1234로 출력된다.
		}if(num != 0)
			System.out.println(res);
		else
			System.out.println(num);
		
		
		res = "" + num;//정수를 문자열로 변환하는 코드
		String reverseRes = ""; //결과를 저장할 문자열
		for(int i = res.length()-1; i>=0; i--) {
			reverseRes += res.charAt(i);
		}
		System.out.println(reverseRes);
		scan.close();
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
