package day2;

public class operatorEx2 {

	public static void main(String[] args) {
		
		//산술 연산자 예제
		System.out.println(1/2); //정수/정수 = 정수		
		System.out.println(1.0/2); // 실수/정수 = 실수
		
		//자료형변환을 이용하여 정수/정수를 실수/정수로 변환
		int num1 = 1, num2 = 2;
		System.out.println((double)num1/num2);
//		System.out.println(3/0);  에러발생		
		System.out.println(3/0.0);
		// 무한대로 표시된다. 0으로 나누지 않도록 주의한다.
		
		int a = 1_000_000;
		int b = 2_000_000;
		long c = (long)a * b;
		System.out.println(c);
		
		char ch1 = 'A';
		char ch2 = 'A' + 1;
		System.out.println(ch2);
		char ch3 = (char)(ch1 + 1);// int이므로 앞에 (char)으로 자료형변환 시킨다.
		System.out.println(ch3);
		
		

	}

}
