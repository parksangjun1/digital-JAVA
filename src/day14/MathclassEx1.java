package day14;
import static java.lang.Math.*;

public class MathclassEx1 {

	public static void main(String[] args) {
		//소수점 첫째짜리에서 올리고 내린다.
		System.out.println(Math.ceil(1.51));//올림(실수형)
		System.out.println(Math.floor(1.51));//버림
		System.out.println(Math.round(1.51));//올림(정수형) return type -> long
		//1.51을 소수점 둘째자리에서 올림
		double num = 1.51;
		num = num * 10;
		System.out.println(Math.ceil(num)/10);//올림(실수형)
		System.out.println(Math.floor(num)/10);//버림
		System.out.println(Math.round(num)/10.0);//올림(정수형) return type -> long
		
	}

}
