package day19;

import java.util.*;

public class TestEx2 {

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
			System.out.println("거꾸로한 정수 : " + res);
		else {
			System.out.println("거꾸로한 정수 : " + num);
			res = "0";
		}	
		
		int reverseNum = Integer.parseInt(res);//문자열을 정수형으로 변환시켜주는 식
		System.out.println(num + reverseNum);//정수형으로 변환된 문자열과 기존 정수형인 num과 덧셈
		scan.close();
	}
}
//12345
//54321
