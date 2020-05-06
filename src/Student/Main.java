package Student;

public class Main {

	public static void main(String[] args) {
		Student s = new Student();
		s.setScore(new Subject("국어",40,40,10,10),
				new Subject("영어",40,40,10,10),
				new Subject("수학",40,40,10,10));
		s.printScore();
					
		

	}
}
interface Manage {//학생 정보 : 학년,반,번호,이름
	public int insertStudent(Student []arr,Student std);
	public void moidfyStudent(Student []arr,Student std);
	public int deleteStudent(Student []arr,Student std);
	public void printStudent(Student []arr,int std);
}
//학생들을 관리하는 프로그램을 작성하세요.
//국어,영어,수학,등
//기능 : , 학생정보 수정, 학생정보 삭제, 학생정보 출력
//예시) 
//기능을 인터페이스로 정의하고, 해당 인터페이스를 구현하는 구현 클래스