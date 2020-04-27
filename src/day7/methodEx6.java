package day7;

public class methodEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max = 5;
		int min = 1;
		int r = random(min,max);
		System.out.println(r);
		
	}
	/* 임의의 정수를 생성하여 알려주는 메소드
	 * 매개변수 : int max, int min
	 * 리턴타입 : 임의의 정수 => int
	 * 메서드명 : random
	 */
	public static int random(int max, int min) {
		//1,9로 알려줘야하는데 9,1로 알려준 경우 1,9로 처리하기 위해 두 수를 교환
		if(min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		
		return (int)(Math.random()*(max-min+1)) + min;
				
		
			
		
	}
}
