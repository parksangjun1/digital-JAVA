package day2;

public class ForEx2 {

	public static void main(String[] args) {
		//구구단 7단을 출력하는 코드를 for문을 이용하여 작성하시오.
		int i, num = 7;
		for(i = 1; i <= 9 ; i++) {
			System.out.printf("%d x %d = %d\n",num ,i ,num*1);
			//1. 반복횟수 : i는 1부터 9까지 1씩 증가
			//           i는 7부터 63까지 7씩 증가
			//2. 규칙성 : 7*i를 출력
			//7 X 1 = 7
			//7 X 2 = 14
			//7 X 3 = 21
			//7 X 4 = 28
			//7 X 5 = 35
			//7 X 6 = 42
			//7 X 7 = 49
			//7 X 8 = 56
			//7 X 9 = 63
			//7 X i = 7*i
		}
		for(i = 1; i <= 9 ; i++) {
			System.out.println(num + " x " + i + " = " + num*i);
			}
	}
}
