package day9;

public class TestEx1 {

	public static void main(String[] args) {
		//1부터 10까지 합을 구하는 코드를 재귀메소드로 작성하라.
		System.out.println(sum(10));
		System.out.println(sum(10));
	}
	public static int sum(int num) {
		if(num < 0)
			return 0;
		if(num == 1)
			return 1;
		return num + sum(num-1);
	}
	public static int sum(int min,int max) {
		if(min>max)
			return 0;
		if(max==min)
			return 1;
		return max + sum(min,max-1);
	}
}
