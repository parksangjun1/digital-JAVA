package day14;

public class wrapperclassEx1 {

	public static void main(String[] args) {
		
		boolean b1 = true;
		Boolean b2 = true;
		char c1 = 'a'; //c1 변수에 a를 저장
		Character c2 = 'a'; //a가 저장된 주소를 c2에 전달
		c1 = c2; //언박싱
		int num1 = 10;
		Integer num2 = 10;
		double dnum1 = 1.23;
		Double dnum2 = 1.23;
		Double dnum = new Double(1.23);
	}

}
