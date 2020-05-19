package day19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestEx4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Student1> list = new ArrayList<Student1>();
		Student1 s1;
		int menu = 0;
		do {
			printMenu();
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.println("학생정보를 입력하세요.");
				s1 = intputStudent(scan);
				if(!insertStudent(list, s1))
					System.out.println("이미있는학생입니다.");
				else {
					System.out.println("학생정보를 추가했습니다.");
				}
				insertStudent(list, s1);
				break;
			case 2:
				System.out.println("학생정보를 수정하세요.");
				s1 = intputStudent(scan);
				if(!modifyStudent(list, s1))
					System.out.println("없는 학생정보입니다.");
				else {
					System.out.println("학생정보를 수정했습니다.");
				}				
				break;
			case 3:
				System.out.println("학생정보를 삭제하세요.");
				s1 = intputStudent(scan);
				if(!deleteStudent(list, s1))
					System.out.println("없는 학생정보입니다.");
				else {
					System.out.println("학생정보를 삭제했습니다.");
				}	
				break;
			case 4:
				printStudent(list);
				System.out.println("학생정보 입니다.");
				
				break;
			case 5:
				System.out.println("프로그램을 종료하겠습니다.");
				break;
			default :
				System.out.println("번호를 잘못 입력했습니다.");
			}
			
		}while(menu != 5);
		scan.close();
	}
	public static void printMenu() {		
		System.out.println("메뉴를 입력하세요.");
		System.out.println("1. 학생정보를 추가하시겠습니까?");
		System.out.println("2. 학생정보를 수정하시겠습니까?");
		System.out.println("3. 학생정보를 삭제하시겠습니까?");
		System.out.println("4. 학생정보를 출력하시겠습니까?");
		System.out.println("5. 종료");		
	}
	public static void printStudent(List<Student1> list) {
		if(list == null || list.size() == 0)
			System.out.println("--이름---학번---학년---전공----");
		for(Student1 tmp : list) {
			System.out.println(tmp);
		}
	}
	
	public static Student1 intputStudent(Scanner scan) {
		Student1 s1 = new Student1();
		System.out.println("이름 : ");
		String name = scan.next();
		System.out.println("학번 : ");
		String num = scan.next();
		System.out.println("학년 : ");
		String grade = scan.next();
		System.out.println("학과 : ");
		String major = scan.next();
		s1.name = name;
		s1.num = num;
		s1.grade = grade;
		s1.major = major;
		return s1;						
	}
	/* 기능 : Scanner를 이용하여 학생 정보를 입력하면 학생 객체를 반환하는 메소드
	 * 매개변수 : Scanner scan
	 * 리턴타입 : 학생 객체 -> Student
	 * 메소드명 : inputStudent
	 */
	 public static boolean insertStudent(List<Student1> list, Student1 s1) {
		 if(list == null || s1 == null)
			 return false;
		 if(list.contains(s1)) 
			 return false;
		 list.add(s1);
		 return true;
	 }
	
	/* 기능 : 주어진 학생정보를 학생정보리스트에 저장하는 메소드로 이미 있는 학생이면 저장하지 않고 없는 학생이면 저장
	 * 매개변수 : 학생정보리스트, 주어진학생정보 => List<Student> list, Student s
	 * 리턴타입 : 저장 여부 -> boolean
	 * 메소드명 : insertStudent
	 */
	 public static boolean modifyStudent(List<Student1> list, Student1 s1) {
		 if(list == null || s1 == null)
			 return false;
		 if(!list.contains(s1))
			 return false;
		 list.remove(s1);
		 list.add(s1);
		 	return true;
	 }
	
	/* 기능 : 주어진 학생 정보를 학생정보리스트에서 수정하는 메소드로 학생정보가 없으면 수정실패, 학생정보가 있으면 수정 성공을 알려줌
	 * 매개변수 : 주어진학생정보, 학생정보리스트 => List<Student> list, Student s
	 * 리턴타입 : 수정 여부 -> boolean
	 * 메소드명 : modifyStudent
	 */
	 public static boolean deleteStudent(List<Student1> list, Student1 s1) {
		 if(list == null || s1 == null)
			 return false;
		 if(!list.contains(s1))
			 return false;
		 list.remove(s1);
		 	return true;
	 }
}
class Student1{
	String name; //이름
	String num;  //학번 => 고유번호
	String major;//전공
	String grade;//학년
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
		Student1 other = (Student1) obj;
		if (num == null) {
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "이름 : " + name + ", 학번 : " + num + ", 학과 : " + major + ", 학년 : " + grade;
	}
	public Student1() {}
	public Student1(String name, String num, String major, String grade) {		
		this.name = name;
		this.num = num;
		this.major = major;
		this.grade = grade;
	}
	
}
