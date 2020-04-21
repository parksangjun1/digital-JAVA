package day3;

public class ForEx5 {

	public static void main(String[] args) {
		// **********무한루프*************
		int i;
	/*	for(; ; ) {
			System.out.println("안녕 !!");
		}
		System.out.println(안녀영~!~!!);   */ 
		int sum = 0;
		/* *************i값이 변경되지 않아 무한루프에 빠짐
		for(i = 1; i <= 5; i+1) {
			System.out.println("Hello");
			
		}
		*/ /* 
		for(i = 1; i <= 5; i--) {
			System.out.println("박상준");
		}
		************i가 계속 감소하여 언더플로우로 인해 정수 최대값이 되는 순간까지 반복 */
		/*
		for(i = 10; i <= 5; i++) {
			System.out.println("pppppppp");
		} 
		*********반복문이 한번도 실행되지 않는 경우 */
		// *************변수는 선언한 위치부터 변수가 선언된 {}안에서 유효하다.
		
		// *************j는 for문의 초기화 위치에서 선언되었기 때문에 반복문 안에서 유효하다.
		for(int j = 1; j <= 5; j++ ) {
			System.out.println("hello\n");
			char ch = 'A';
			System.out.println((char)(ch+1));
		}
		// System.out.println(j);
		//**************에러발생, j의 사용범위 밖에서 j를 사용했기 때문에 */
		
	}

}
