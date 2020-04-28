package day8;

public class constructorEx {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.print();
		Point p2 = new Point(1,2);
		p2.print();

	}

}
class Point{ //멤버변수는 파란색
	int x=1;//x,y는 기본값이 0이다.
	int y=1;
	{
		//초기화블럭
		x=10;
		y=10;
	}
	static {
		//클래스 초기화 블럭
		//클래스 변수만 초기화 가능
	}
	void print() {
		System.out.printf("(%d,%d)", x,y);
	}
	public Point(int x,int y) {//int x,y는 매개변수 -> 매개변수가 멤버변수보다 우선순위이다.
		this.x = x;
		this.y = y;
	}
	public Point() {
		//this (0,0);
		this(100,100);
	}
	//복사 생성자
	public Point(Point p) {
		//this = p; -> p가 참조변수이기 때문에 각각 복사를 해줘야된다.
		this(p.x,p.y); //다른생성자 this()를 이용할 때에는 메서드의 첫번째줄에 넣어주어야된다.
		//this.x = p.x;  
		//this.y = p.y;  
		
	}
}