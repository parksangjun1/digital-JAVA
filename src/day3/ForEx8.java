package day3;

public class ForEx8 {

	public static void main(String[] args) {
		// break는 반복문을 빠져나가는 역할이다.
		for(int i = 1; i <= 5; i++) {
			System.out.println("hi");
			if(i == 3) {
			break;
			}

		}
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
	}
}
