package Student;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		Student tmpStudent;
		int size = 30;
		Student std[] = new Student[size]; 
		int cnt = 0; //현재 저장된 학생수
		String name;
	
		while(menu != 5) {			
			printMenu();
			menu = scan.nextInt();		
			switch(menu) {
			case 1:
				System.out.println("추가할 학생정보를 입력하세요.");			
				tmpStudent = searchInfo(scan);
				System.out.print("이름 : ");
				name = scan.next();
				tmpStudent.setName(name);
				if(isDuplicated(std, cnt, tmpStudent) != -1) {
					System.out.println("이미있는 학생입니다.");
					break;
				}
				//과목정보에 대한 작업
				std[cnt] = tmpStudent;//후위연산자[cnt++]
				System.out.println("과목정보를 입력하시겠습니까?(Y/N)");
				char subjectMenu = scan.next().charAt(0);
				switch(subjectMenu) {
				case 'Y': case 'y':
					inputSubject(scan,std[cnt]);	
					break;					
				default:
					//처리
				}
				cnt++;
				tmpStudent = null; //중복되기 때문에 참조변수tmpStudent를 끊어준다.
				break; 
				
			case 2:				
				moidfyStudent(std, cnt, scan);
				break;
			case 3:
				System.out.println("삭제할 학생정보를 입력하세요.(검색)");
				tmpStudent = searchInfo(scan);
				if(deleteStudent(std, tmpStudent, cnt)) cnt--;

				break;
			case 4:
				printStudent(std,cnt);				
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
		}
		scan.close();		
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
	public static Student searchInfo(Scanner scan){
		System.out.print("학년 : ");
		int grade = scan.nextInt();
		System.out.print("학반 : ");
		int classNum = scan.nextInt();
		System.out.print("번호 : ");
		int num = scan.nextInt();
		Student s = new Student();
		s.setGrade(grade);
		s.setClassNum(classNum);
		s.setNum(num);
		return s;
	}
	//void : 콘솔에 출력하고 알려줄 정보가 없어서
	//int : 출력학생 수를 확인
	//boolean : 학생정보를 출력하면 true, 실패하면 false
	public static void printStudent(Student []std, int cnt){
		for(int i = 0; i < cnt; i++) {
			System.out.println("---------------------------");
			System.out.println("학년 : " + std[i].getGrade());
			System.out.println("학반 : " + std[i].getClassNum());
			System.out.println("번호 : " + std[i].getNum());
			System.out.println("이름 : " + std[i].getName());
			System.out.println("---------------------------");
			std[i].printScore();
		}
	}
	/* 기능 : 콘솔에서 정보를 입력받고 입력받은 정보를 통해 과목들을 저장하고 
	 * 		저장한 과목을 학생정보에 추가하는 기능
	 * A: void B:
	 */
	public static void inputSubject(Scanner scan, Student s){
		System.out.println("입력한 과목 수 : ");
		int subjectCnt = scan.nextInt();
		Subject []subjectList = new Subject[subjectCnt];
		//여러 과목 정보를 입력
		for(int i = 0; i < subjectCnt; i++) {
			System.out.print("과목명 : ");
			String title = scan.next();
			System.out.println("중간고사 : ");
			int midterm = scan.nextInt();
			System.out.println("기말고사 : ");
			int finals = scan.nextInt();
			System.out.println("수행평가 : ");
			int performance = scan.nextInt();
			System.out.println("출석점수 : ");
			int attendance = scan.nextInt();
			subjectList[i] = new Subject(title, midterm, 
					finals, performance, attendance);
		}
		if(s==null)//학생정보가없는경우에 출력하지말것
			return;
		s.setScore(subjectList);
	}
	/* A 
	 * void : 
	 * int : 삭제된 뒤에 학생 수
	 * boolean : 삭제여부
	 * B
	 * int cnt : 현재학생수
	 * Student []std : 저장된 학생 정보
	 * Student s : 삭제 할 학생 정보
	 */
	public static boolean deleteStudent(Student std[], Student deleteStudent, int cnt) {
		if(std == null || deleteStudent == null||cnt <= 0) return false; 		
		int pos = isDuplicated(std, cnt, deleteStudent);				
			//하나씩 검색해서 tmpStudent와 같은 학생이 있는지 확인
			//있으면 삭제 후 하나씩 밀어준다.
			if(pos != -1) {//////////////////////////////////////////////////////////////
				for(int j = pos; j < cnt-1; j++) {
					std[j] = std[j+1];
				}				
				System.out.println("삭제가 완료되었습니다.");
				return true;
			}		
		return false;
	}
	//int : 중북되면 중복된 번지를 알려주고, 중복 안되면 -1을 반환
	//boolean : 중복되면 true, 중복안되면 false
	public static int isDuplicated(Student std[], int cnt, Student s) {
		//검사	
		for(int i = 0; i < cnt; i++) {
			if(std[i].equal(s)) {
			return i;
			}
		}
		return -1;
	}
	/* A
	 * void
	 * B
	 * 학생들정보 : Student std[]
	 * 저장된 학생 수 : int cnt
	 * 학생정보를 입력받기 위해 : Scanner scan
	 */
	public static void moidfyStudent(Student std[], int cnt, Scanner scan) {
		System.out.println("수정할 학생정보를 입력하세요.(검색)");
		Student tmpStudent = searchInfo(scan);
		int pos = isDuplicated(std, cnt, tmpStudent);
		if(pos == -1) {
			System.out.println("없는 학생 정보입니다.");
			return;
		}	
		System.out.print("이름 : ");
		String name = scan.next();
		tmpStudent.setName(name);	
		System.out.println("-------과목수정-------");
		System.out.println("1. 수정");
		System.out.println("2. 추가");
		System.out.println("3. 종료");
		System.out.println("과목을 수정하시겠습니까 ?");
		int subMenu = scan.nextInt();
		switch(subMenu) {
		case 1:
			
			//해당 학생의 과목 정보를 가져온다.
			Subject sList[] = std[pos].getScore();					
			if(sList == null) {
				System.out.println("수정할 과목이 없습니다.");
				break;
			}
			//수정할 과목을 입력
			System.out.printf("과목 : ");
			String title = scan.next();
			//수정할 과목이 있는지 찾는다. 있으면 아래작업, 없으면 종료
			int subPos = -1;
			for(int i = 0; i < sList.length; i++) {
				if(sList[i].getTitle().equals(title)){
					subPos = i;
					break;
				}
			}
			if(subPos == -1) {
				System.out.println("등록되지 않은 과목입니다.");
				break;
			}
			//중간,기말,수행평가,출석점수를 다 새로 수정
			System.out.println("중간고사 : ");
			int midterm = scan.nextInt();
			System.out.println("기말고사 : ");
			int finals = scan.nextInt();
			System.out.println("수행평가 : ");
			int performance = scan.nextInt();
			System.out.println("출석점수 : ");
			int attendance = scan.nextInt();
			sList[subPos].setMidterm(midterm);
			sList[subPos].setFinals(finals);
			sList[subPos].setPerformance(performance);
			sList[subPos].setAttendance(attendance);					
			break;
		case 2:
			Student s = new Student();
			inputSubject(scan, s);
			std[pos].addScore(s.getScore());
			
			break;
		}
	}
}

//학생들을 관리하는 프로그램을 작성하세요.
//국어,영어,수학,등
//기능 : , 학생정보 수정, 학생정보 삭제, 학생정보 출력
//예시) 
//기능을 인터페이스로 정의하고, 해당 인터페이스를 구현하는 구현 클래스
/*interface Manage {//학생 정보 : 학년,반,번호,이름
	public int insertStudent(Student []arr,Student std);
	public void moidfyStudent(Student []arr,Student std);
	public int deleteStudent(Student []arr,Student std);
	public void printStudent(Student []arr,int std);
}*/