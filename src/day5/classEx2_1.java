package day5;

public class classEx2_1 {

	public static void main(String[] args) {
		Point2.printCount();
		Point2 p2 = new Point2();
		p2.printPoint();
		p2.moveXY(2, 5);
		p2.printPoint();
		p2.setX1(2);
		p2.printPoint();
		p2.setY1(1);
		p2.printPoint();
  		Point2.printCount();
		Point2 p3 = new Point2(10,10);
		p3.printPoint();
		Point2.printCount();
	}
}
/* 클래스명 : Point1
 * 멤버변수 : x1좌표, y1좌표 => 외부에서 접근이 불가능하도록
 * 기능(메서드) 
 * - 현재좌표를 출력하는 기능
 * - x,y좌표가 주어지면 해당 좌표로 이동하는 기능
 * - x의 값이 주어지면 x1의 값을 수정하는 기능
 * - y의 값이 주어지면 y1의 값을 수정하는 기능
 * - x1의 값을 가져오는 기능( get)
 * - y1의 값을 가져오는 기능 (set)
 * 생성자
 * - 기본 생성자
 * x,y좌표가 주어졌을 때 객체를 생성하는 생성자
 */
class Point2{ //멤버변수
	private int x1, y1;		
	/*기능 : 현재좌표를 출력하는 기능
	 * 매개변수: 없음
	 * 리턴타입: 없음
	 * 메소드명: printPoint
	 * 
	 */
	private static int count; //클래스 변수
	
	public void printPoint() {
		System.out.printf("(%d,%d)\n",x1,y1);
	}
	/* 기능 : x,y좌표가 주어지면 해당좌표로 이동하는 기능
	 * 매개변수 : 내가 가야할 x,y좌표 => int x, y
	 * 리턴타입 : 없다
	 * 메소드명 : moveXY
	 */
	public void moveXY(int x, int y) {
		x1 = x;
		y1 = y;
	}
	/*getter와 setter
	 * getter는 멤버변수가 private인 경우 직접 멤버 변수의 값을 가져올 수 없기 때문에
	 * 멤버 변수의 값을 가져 올 수 있는 메서드이다.
	 * setter는 멤버변수가 private인 경우 직접 멤버 변수의 값을 설정할 수 없기 때문에
	 * 멤버 변수의 값을 가져 올 수 있는 메서드이다.
	 */
	public int getX1() {
		return x1;
	}
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public int getY1() {
		return y1;
	}
	public void setY1(int y1) {
		this.y1 = y1;
	}
	
	/*생성자가 하나도 없으면 기본 생성자를 생략해도 클래스에 기본생성자가 자동으로 만들어진다
	 *생성자 오버로딩이 되어 있고 기본 생성자가 없으면, 이때는 자동으로 기본 생성자를 만들지 않아서 기본생성자를 이용한 객체를 만들 수 없다.
	 */
	public Point2() { //생성자
		count++;      //클래스변수
	} //기본 생성자
	public Point2(int x,int y) {
		x1 = x; y1 = y;
		count++;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Point2.count = count;
	}
	public static void printCount() {
		//에러발생, 클래스 메소드에는 객체(멤버)변수 => x1를 사용할 수 없다.
		//클래스 메서드는 객체 생성없이 사용이 가능한데 x1이라는 객체변수는 객체를
		//생성해야 사용할 수 있는 변수이기 때문에 클래스 메서드에서는 사용할 수 없다.
		//System.out.println(x1);
		System.out.println("지금까지 만들어진 좌표의 개수 : " + count);
	}
	
	
}	 
