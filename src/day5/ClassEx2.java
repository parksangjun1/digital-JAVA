package day5;

public class ClassEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Point1 p2 = new Point1();
	
		
	}

}
class Point1{
	private int x1;
	private int y1;
	public Point1(int x1,int y1) {
		x1 = x1;
		y1 = y1;
		System.out.printfln("x1+y1");
		
	}
}
/* 클래스명 : Point1
 * 멤버변수 : x1좌표, y1좌표 => 외부에서 접근이 불가능하도록
 * 기능(메서드) 
 * - 현재좌표를 출력하는 기능
 * - x,y좌표가 주어지면 해당 좌표로 이동하는 기능
 * - x의 값이 주어지면 x1의 값을 수정하는 기능
 * - y의 값이 주어지면 y1의 값을 수정하는 기능
 * - x1의 값을 가져오는 기능
 * - y1의 값을 가져오는 기능
 * 생성자
 * - 기본 생성자
 * x,y좌표가 주어졌을 때 객체를 생성하는 생성자
 */
