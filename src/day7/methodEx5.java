package day7;

import java.util.Scanner;

public class methodEx5 {

	public static void main(String[] args) {
		
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		num = scan.nextInt();
		
		
		if(isPrime(num)) {
			System.out.println(num + "는 소수");
		}else {
			System.out.println(num + "는 소수가 아니다.");
		}
		System.out.println("---------");
		
		if(isPrime2(num)) {
			System.out.println(num + "는 소수");
		}else {
			System.out.println(num + "는 소수가 아니다.");
		}

	}
	/* 기능 : 주어진 정수가 소수인지 아닌지 알려주는 메소드
	 * 매개변수 : int num
	 * 리턴타입 : boolean
	 * 메서드명 : isPrime
	 */
	public static boolean isPrime(int num) {
		int cnt = 0;
		for(int i = 2; i < num; i++)
			if(num % i == 0) {
				cnt ++;
			}
		if(num == 1)
			return false;
		if(cnt == 0) {
			return true;
		}
		return false;
	}
	
	public static boolean isPrime2(int num) {
		if(num == 1)
			return false;
		for(int i = 2; i < num; i++)
			if(num % i == 0) {
				return false;
			}
		return true;				
		
	}
}
