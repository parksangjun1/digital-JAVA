package day9;

public class OverloadEx1 {
	//static을 쓰는 경우.
	//main에서 객체를 만들어줘야한다.
	public static void main(String[] args) {		
		/*OverloadEx1 obj = new OverloadEx1();
		System.out.println(obj.sum(1,1));*/
		System.out.println(sum(1,1,1));
		System.out.println(sum(1.0,1.0));
		System.out.println(sum(1,2,3,4,5));
		System.out.println(sum());
		System.out.println(sum('1',2,3,4,5));   //문자 1에대한 유니코드값 (아스키코드값) 49가 대신 들어가서 연산되기 자동자료형변환이되어 연산한다.
		//System.out.println(sum("1",2,3,4,5)); //문자열1을 실수로 형변환 할 수 없어서 에러가 난다.
											    //에러가 발생하지 않게 하려면 문자열 1을 정수/실수/문자로 수정하던지
											    //sum메서드로 오버로딩하여 문자열도 가능하도록 추가해야한다.
												

	}
	/*public int sum(int num1, int num2) {
		return num1 + num2;}*/
	//기능 : 두 정수의 합을 알려주는 메소드
	public static int sum(int num1, int num2) {		
		return num1 + num2;	
	}//기능 : 두 실수의 합을 알려주는 메소드
	//같지만 자료형이 다르기 때문에 동작한다. = 오버로딩
	public static double sum(double num1, double num2) {
		return num1 + num2;	
	}
	//기능 : 세 실수의 합을 알려주는 메소드
	public static double sum(double num1, double num2, double num3) {
		return num1 + num2 + num3;
	}
	//기능 : 가변인자를 이용한 합계구하는 메소드
	public static double sum(double...nums) {
		double res = 0.0;
		for (double tmp : nums) {
			res += tmp;
		}
		return res;		
	}
}
