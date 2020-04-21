package day3;

public class whileEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*위 예제는 i가 1부터 시작해서 최소 공배수를 구하기 때문에 최소공배수가 큰 경우
		 * 반복횟수가 많아진다.
		 * 그래서 아래처럼 i를 num1부터 시작하여 num1의 배수로 한다면 반복횟수가 줄어든다
		 */
		
		int num1 = 5, num2 = 100000;
		
		int i;
		
		int cnt = 0;
		
		//초기값
		i = num1;
		cnt = 0;
		while(i <= num1*num2 ) {
			cnt++;
			//조건식 : (i가 num1의 배수이고 i가 num2의 배수이면)
			if( i % num2 == 0) {
				System.out.printf("%d와 %d의 최소 공배수 : %d, 반복횟수 : %d\n", num1,num2,i,cnt);
				break;
			}
			i+=num1;	
		}	
	}

}
