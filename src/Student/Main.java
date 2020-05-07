package Student;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		while(menu != 5) {			
			printMenu();
			menu = scan.nextInt();		
			switch(menu) {
			case 1:
				System.out.println("학생정보추가기능을 구현해야합니다.");
				System.out.print("이름을입력하세요 : ");
				String name = scan.next();
				System.out.print("학년을입력하세요 : ");
				int grade = scan.nextInt();
				System.out.print("반을입력하세요 : ");
				int clssNum = scan.nextInt();
				System.out.print("번호를 입력하세요 : ");
				int num = scan.nextInt();
				System.out.printf("%d %d %d %s\n", grade, clssNum, num, name );
				break;
				
			case 2:
				System.out.println("학생정보수정기능을 구현해야합니다.");
				
				break;
			case 3:
				System.out.println("학생정보삭제기능을 구현해야합니다.");
				break;
			case 4:
				System.out.println("학생정보출력기능을 구현해야합니다.");
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
		}
		//static 있으면 클래스메소드
		//없으면 객체메소드
		//객체메서드는 인스턴스가필요하다.??
	}
	public static void printMenu() {
		System.out.println("-----메뉴------");
		System.out.println("1. 학생정보 추가");
		System.out.println("2. 학생정보 수정");
		System.out.println("3. 학생정보 삭제");
		System.out.println("4. 학생정보 출력");
		System.out.println("5. 프로그램 종료");
		System.out.println("--------------");
		System.out.printf("메뉴를 선택하세요.");
	}
}

//학생들을 관리하는 프로그램을 작성하세요.
//국어,영어,수학,등
//기능 : , 학생정보 수정, 학생정보 삭제, 학생정보 출력
//예시) 
//기능을 인터페이스로 정의하고, 해당 인터페이스를 구현하는 구현 클래스
interface Manage {//학생 정보 : 학년,반,번호,이름
	public int insertStudent(Student []arr,Student std);
	public void moidfyStudent(Student []arr,Student std);
	public int deleteStudent(Student []arr,Student std);
	public void printStudent(Student []arr,int std);
}