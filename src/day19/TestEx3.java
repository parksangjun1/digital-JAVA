package day19;

import java.util.*;

public class TestEx3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		List<Student> list = new ArrayList<Student>();
		Student s;				
		int menu = 0;
		do {
			printMenu();
			menu = scan.nextInt();
			switch(menu) {
			case 1 : 
				System.out.println("추가할 학생정보를 입력하세요.");
				s = inputStudent(scan);
				if(!insertStudent(list, s)) {
					System.out.println("이미있는 학생입니다.");
				}else {
					System.out.println("학생정보를 추가했습니다.");
				}
				insertStudent(list,s);
				break;
			case 2 :
				System.out.println("수정할 학생정보를 입력하세요.");
				s = inputStudent(scan);
				if(!modifyStudent(list, s)) {
					System.out.println("없는 학생입니다.");
				}else {
					System.out.println("학생정보를 수정했습니다.");
				}
				break;							
			case 3 :
				System.out.println("삭제할 학생정보를 입력하세요.");
				s = inputStudent(scan);
				if(!deleteStudent(list, s)) {
					System.out.println("없는 학생입니다.");
				}else {
					System.out.println("학생정보를 삭제했습니다.");
				}
				break;
			case 4 :
				printStudent(list);
				break;
			case 5 : 
				System.out.println("프로그램을 종료합니다."); break;
			default : 
				System.out.println("올바른 메뉴가 아닙니다.");
			}
		}
		while(menu != 5); 
	}
	
	public static void printMenu() {		
		System.out.println("-----메뉴-----");
		System.out.println("1. 학생정보추가");
		System.out.println("2. 학생정보수정");
		System.out.println("3. 학생정보삭제");
		System.out.println("4. 학생정보출력");
		System.out.println("5. 종료");
	}	
	public static void printStudent(List<Student> list ) {
		if(list == null || list.size() ==  0)			
		System.out.println("학번----이름----전공----학년---");
		for(Student tmp : list) {
			System.out.println(tmp);
		}
	}						
	
	public static Student inputStudent(Scanner scan){
		Student s = new Student();
		System.out.println("학생의 학번을 입력하세요 : ");
		String num = scan.next();
		System.out.println("학생의 학년을 입력하세요 : ");
		String grade = scan.next();
		System.out.println("학생의 이름을 입력하세요 : ");
		String name = scan.next();
		System.out.println("학생의 전공을 입력하세요 : ");
		String major = scan.next();
		s.num = num;
		s.name = name;
		s.grade = grade;
		s.major = major;
		return s;
	}
	/* 기능 : Scanner를 이용하여 학생 정보를 입력하면 학생 객체를 반환하는 메소드
	 * 매개변수 : Scanner scan
	 * 리턴타입 : 학생 객체 -> Student
	 * 메소드명 : inputStudent
	 */
	
	public static boolean insertStudent(List<Student> list, Student s){//매개변수는 밖에서의 정보이다.
		if(list == null || s == null) return false;//학생정보 리스트가 없거나, 학생정보가 없으면 추가할 수 없기 때문에 실패
		if(list.contains(s)) 
			return false;
		list.add(s);					 
		return true;				
	}
	/* 기능 : 주어진 학생정보를 학생정보리스트에 저장하는 메소드로 이미 있는 학생이면 저장하지 않고 없는 학생이면 저장
	 * 매개변수 : 학생정보리스트, 주어진학생정보 => List<Student> list, Student s
	 * 리턴타입 : 저장 여부 -> boolean
	 * 메소드명 : insertStudent
	 */

	public static boolean modifyStudent(List<Student> list, Student s){
		if(list == null || s == null) return false;
		if(!list.contains(s))
			return false;
		//list에 있는 학생정보를 지우고 list에 학생 s의 정보를 추가한다.
		list.remove(s);
		list.add(s);
		return true;
	}
	/* 기능 : 주어진 학생 정보를 학생정보리스트에서 수정하는 메소드로 학생정보가 없으면 수정실패, 학생정보가 있으면 수정 성공을 알려줌
	 * 매개변수 : 주어진학생정보, 학생정보리스트 => List<Student> list, Student s
	 * 리턴타입 : 수정 여부 -> boolean
	 * 메소드명 : modifyStudent
	 */

	public static boolean deleteStudent(List<Student> list, Student s){
		if(list == null || s == null) return false;
		if(!list.contains(s))
			return false;
		list.remove(s);
		return true;
		
	}
	/* 기능 : 주어진 학생 정보를 학생정보리스트에서 삭제하는 메소드로 학생정보가 없으면 삭제실패, 학생정보가 있으면 삭제 성공을 알려줌
	 * 매개변수 : 주어진학생정보, 학생정보리스트 => List<Student> list, Student s
	 * 리턴타입 : 삭제 여부 -> boolean
	 * 메소드명 : deleteStudent
	 */
}
class Student{
	String name; //이름
	String num;  //학번 => 고유번호
	String major;//전공
	String grade;//학년
	
	public Student() {}
	public Student(String name, String num, String major, String grade) {
		this.name = name;
		this.num = num;
		this.major = major;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "이름 = " + name + ", 학번 = " + num + ", 전공 = " + major + ", 학년 " + grade;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((num == null) ? 0 : num.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (num == null) {
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		return true;
	}

}
