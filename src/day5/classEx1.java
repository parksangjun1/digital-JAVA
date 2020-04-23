package day5;

import day4.*;
//접근제한자 class 클래스명
import day5_1.*;
public class classEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		practiceEx3.main(null);
		
		DefaultclassEx1.main(null);
		/* defaultclassEx2는 다른 패키지에 있는 클래스인데 접근제한자가 default라서
		 * 사용할 수 없기 때문에 에러가 발생한다.		 
		 */
		//DefaultclassEx2.main(null);
		Point p1 = new Point();
		//p1.x1 = 10;
		p1 = new Point(1,2);
		//p1 = new point()//x2는 private 이므로 다른 클래스에서 사용할 수 없다.
					//p1.y2 = 10; 
	}

}
//point : 2차원 좌표평면에서 점 한개를 나타내는 class
class Point{
	int x1;//x축의 좌표
	int y1;//y축의 좌표
	private int x2;
	private int y2;
	public int x3;
	public int y3;
	public Point() {
		x1= x2 = x3 = 0;
		y1= y2 = y3 = 0;
		System.out.println("Point의 기본 생성자 호출");
	}
	//생성자 오버로딩
	public Point(int x,int y) {
		x1= x2 = x3 = x;
		y1= y2 = y3 = y;
		System.out.println("Point의 생성자 오버로딩 호출");
	}
}
