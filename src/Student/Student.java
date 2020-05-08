package Student;

public class Student{
	private String name = " ";
	private int grade;
	private int classNum;
	private int num;
	private Subject[] score;
	

	public boolean equal(int grade, int classNum, int num, String name) {
		if(this.grade != grade) return false;
		if(this.classNum != classNum) return false;
		if(this.num != num) return false;
		if(!this.name.equals(name)) return false;
		return true;
		
	}
	public boolean equal(Student s) {
		if(this.grade != s.grade) return false;
		if(this.classNum != s.classNum) return false;
		if(this.num != s.num) return false;		
		return true;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setScore(Subject...score) {
		this.score = new Subject[score.length];
		for(int i = 0; i<score.length; i++) {
			this.score[i] = new Subject(score[i]);
			//this.score[i].setMidterm(score[i]);
		}
		
	}
	public Subject[] getScore() {
		return score;
	}
	public void printScore() {
		if(score == null) return;
		for(Subject tmp : score) {
			tmp.print();
		}
	}
	public void addScore(Subject[] addscore) {
		//과목배열이 꽉차있어서 배열을 추가해야한다.
		int aSize = 0, bSize = 0;
		if(score != null) aSize = score.length;
		if(addscore != null)bSize = addscore.length;
		Subject []tmp = new Subject[aSize + bSize];
		
		for(int i = 0; i < aSize; i++) {
			tmp[i] = score[i];
		}
		for(int j = 0; j<bSize; j++) {
			tmp[aSize+j] = addscore[j]; 
		}
		score = tmp;
	}
}	
