package day18;

import java.util.Scanner;

public class TestEx2 {

	public static void main(String[] args) {
		// 2.1번내용을 메소드로
		Scanner scan = new Scanner(System.in);
		System.out.println("성적을 입력하세요 :(0 ~ 100) ");
		int num = scan.nextInt();
		String grade = grade(num);
		if(grade.equals("X")) {
			System.out.println("올바른 점수가 아닙니다.");			
		}else {
			System.out.println(grade + "학점입니다.");
		}
		try {
		System.out.println(grade2(num) + "학점입니다.");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	/* 기능 : 정수 성적이 주어지면 성적에 맞는 학점을 알려주는 메소드(올바른 점수가 아닌 경우 X)
	 * 매개변수 : int num 
	 * 리턴타입 : String(추후 +를 추가할 수 도 있기 때문에) 
	 * 메소드명 : grade
	 */
	/**
	 * 
	 * @param num : 정수 성적
	 * @return : 성적에 맞는 학점 A,B,C,D,F 학점과 올바르지 않을 때의 학점 X를 반환.
	 */
	public static String grade(int num) {	
		if(num < 0 || num > 100) return "X";
		if(num >= 90) return "A";
		if(num >= 80) return "B";
        if(num >= 70) return "C";
        if(num >= 60) return "D";
        return "f";		
	}
	/**
	 * 
	 * @param num : 정수 성적
	 * @return : 성적에 맞는 학점 A,B,C,D,F 학점과 올바르지 않을 때의 예외발생.
	 */
	public static String grade2(int num) {
		if(num < 0 || num > 100)
			throw new ArithmeticException("예외 발생 : 올바른 점수가 아닙니다.");
	    if(num >= 90) return "A";           
	    if(num >= 80) return "B";           
        if(num >= 70) return "C";           
        if(num >= 60) return "D";           
        return "f";
	}
}	