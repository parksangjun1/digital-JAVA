package day8;

public class recursiveEx1 {

	public static void main(String[] args) {
		
		System.out.println(fact(5));
	}
	//팩토리얼 메소드
	public static int fact(int num) {
		if(num == 1 || num == 0)
			return 1;
		if(num < 0)
			return 0;
		return num * fact(num-1);
	}
}
/* 아래는 재귀 호출을 이용한 main에서 프로그램이 종료 될 때까지 실행순서를 줄로 표현한 것이다.
 * 사진볼것.
 */
 