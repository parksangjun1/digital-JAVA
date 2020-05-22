package day22;

public class TestEx1 {

	public static void main(String[] args) {
		//System.out.println(sum(2,5));				
		mul(2,7);
	}
	public static void mul(int start, int end) {
		for(int i = start; i <= end; i++) {
			for(int j = 1; j <= 9; j++) {			
				System.out.printf("%d x %d = %d\n", i, j, i * j);
			}
			System.out.println();
		}
	}
	/* 기능 : start단부터 end단까지 츨력하는 메소드를
	 * 매개변수 : int start, int end
	 * 리턴타입 : void
	 * 메소드명 : mul
	 */
	/*
	public static int sum(int min, int max) {
		int res = 0;
		for(int i = min; i <= max; i++ ) {
			res += i;
		}
		return res;		
	}*/
	/* 정수 start와 정수 end가 주어지면 start부터 end까지의 합을 반환하는 메소드를 생성하고,
	 * main메소드에서 테스트해보세요.
	 */


}
