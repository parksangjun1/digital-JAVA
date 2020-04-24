package day6;

import java.util.Scanner;

public class testEx3 {

	public static void main(String[] args) {
		/* 5명 학생의 성적을 입력받아 해당학생의 성적을 학점으로 출력하세요.
		 * 100 ~ 90 : A  점수가 100
		 * 89 ~ 80 : b
		 * 79 ~ 70 : c
		 * 69 ~ 60 : d
		 * 59 ~ 0 : f
		 * 100 ~ : 잘못된 수 입니다.
		 * 5번 반복하시오.
		 * 학생의 성적이 음수가 입력되면 종료하도록 하세요.
		 */
		int score;
		Scanner scan = new Scanner(System.in);
		
		
		for(int i = 0; ; i++) {
			
			System.out.print("점수를 입력하세요 : ");
			score = scan.nextInt();
			
		if(score == 100 && score >= 90) {
			System.out.println(score + "점은 A학점입니다.");
		}else if(score <= 89 && score >=80) {
			System.out.println(score + "점은 B학점입니다.");		
		}else if(score <= 79 && score >=70) {
			System.out.println(score + "점은 C학점입니다.");
		}else if(score <= 69 && score >=60) {
			System.out.println(score + "점은 D학점입니다.");
		}else if(score <= 59 && score >= 0) {
			System.out.println(score + "점은 F학점입니다.");
		}else if(score > 100){
			System.out.println(score + "점은 잘못된 점수입니다.");
		}else {
			System.out.println("지금까지 입력확인한 학생의 수는 " + (i-1) +"입니다.");//(i - 1) 이유는 마지막전까지를 보기 위해서이다.
			System.out.println("음수라서 종료하겠습니다.");
			break;
		}
		
		}
		scan.close();
	}

}
