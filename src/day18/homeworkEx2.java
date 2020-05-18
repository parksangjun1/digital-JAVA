package day18;

public class homeworkEx2 {

	public static void main(String[] args) {
		
		System.out.println(gcd(8,12));
		System.out.println(lcm(8,12));
	}
	/* 기능 : 두 정수의 최대 공약수를 알려주는 메소드
	 * 매개변수 : 두 정수 -> int A, int B
	 * 리턴타입 : 최대공약수 -> int
	 * 메소드명 : gcd
	 */
	public static int gcd(int num1, int num2) {
		if(num1 < 0 || num2 < 0)
			throw new ArithmeticException("예외 발생 : 최대공약수는 두 양의 정수가 필요합니다.");
		for(int i = num1; i >= 1; i--) {
			if(num1 % i == 0 && num2 % i ==0) {
				return i;
			}
		}
		return 1;
	}
	public static int lcm(int num1, int num2) {
		return num1 * num2 / gcd(num1,num2);
	}
}
