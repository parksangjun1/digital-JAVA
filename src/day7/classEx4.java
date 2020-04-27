package day7;

public class classEx4 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.in();
		s1.printInfo();
		System.out.println("");
		Student s2 = new Student("디지털 컨버젼스 ... JAVA", "이순신");
		s2.in();
		s2.out();
		s2.printInfo();				
	}

}
//맴버변수
class Student{
	
	//학생이름
	private String name;
	//입실여부
	private boolean isEntrance;	
	//수강과정
	private String course;
	//입실시간,퇴실시간
	private String inTime, outTime;
	
	
	
	//멤버 메서드
	//입/퇴실 기능
	public void in() {
		System.out.println(name + "님 입실하였습니다.");
		isEntrance = true;
		inTime = "9 : 00";
	}
	public void out() {
		System.out.println(name + "님 퇴실하였습니다.");
		isEntrance = false;
		outTime = "18 : 00";
	}
	//학생정보 출력 기능
	public void printInfo() {
		System.out.println("과정 : " + course );
		System.out.println("이름 : " + name);
		if(isEntrance) {
			System.out.println("입실중입니다.");
			System.out.println("입실시간 : "+ inTime);
		}else {
			System.out.println("퇴실 했습니다.");
			System.out.println("입실 시간 : " + inTime);
			System.out.println("퇴실 시간 : " + outTime);
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isEntrance() {
		return isEntrance;
	}
	public void setEntrance(boolean isEntrance) {
		this.isEntrance = isEntrance;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getInTime() {
		return inTime;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}
	public String getOutTime() {
		return outTime;
	}
	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}
	
	//생성자
	
	public Student() {
		course = "JAVA";
		name = "박상준";		
	}
	public Student(String course, String name) {
		this.course = course;
		this.name = name;
	}
	
}
