package day17;

import java.util.*;

public class TestEx1 {
	/*두정수를 입력 받아 두 정수를 더하여 출력하는 코드를 자유롭게 작성하세요.
	 *Scanner를 클래스 멤버 메소드로 사용할 수는 있지만, TestEx1 클래스에서 스캐너는 의미있는
	 *정보가 아니므로 사용하지 않는 것이 좋다.
	 * */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//참조변수, 지역변수
		int num1 = scan.nextInt();//일반변수, 지역변수
		Integer num2 = scan.nextInt(); //참조변수, 지역변수
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		System.out.println(num1 + " + " + num2 + " = " + sum(num1,num2,0));
		//메스드 안에서 "매개변수 = 값;" 과 같은 코드가 발생한다면 해당 매개변수는 지역변수로 바꿔도 되는 매개변수이다.
		System.out.println(num1 + " + " + num2 + " = " + sum(num1,num2));
		scan.close();		
	}
	public static int sum(int num1, int num2, int res) {//res = 매개변수, 일반변수
		res = num1 + num2;
		return res;
	}
	public static int sum(int num1, int num2) {
		int res = num1 + num2; //res = 지역변수, 일반변수
		return res;
	}
}
