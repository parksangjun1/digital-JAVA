package day8;

public class recursiveEx2 {

	public static void main(String[] args) {
		int num = 5;
		int res = 1;
		for(int i = 1; i <= num; i ++) {
			res *= i;
		}
		if(num < 0)
			System.out.println(0);
	else {
		System.out.println(res);
	}
	}	
}
// 재귀함수 아닌 반복문 이용하여 팩토리얼 구현