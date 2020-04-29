package day9;

public class Circle extends shape {
	private static int CircleCount;
	private double centerX, centerY; //
	public void print() {		
		System.out.println("-------원의 정보----------");
		System.out.printf("중심점은 (%.1f,%.1f)\n", centerX,centerY);//메서드라서 괄호를 쓴다.
		System.out.printf("반지름 : %.2f\n", getRadius());
		System.out.println("-----------------------");		
	}
	//생성자
	public Circle() {CircleCount++;} //생성자가 없는경우에 자동으로 생긴다.
	public Circle(int left, int up, double radius) {
		super(left, up, radius*2, radius*2);//부모생성자를 부를때에는 super를 호출한다.		
		/*setLeft(left);
		setUp(up);
		setWidth(radius*2);
		setHeight(radius*2);*/
		centerX = left + radius;
		centerY = up - radius;
		CircleCount++;
		
		
	}//오버라이딩 : 부모와 형태가 같기 때문에 오버라이딩이다.
	public void move(int left, int up) {
		super.move(left, up);
		centerX = left + getRadius();//getWidth() / 2;
		centerY = up - getRadius(); //getWidth() / 2;
	}//오버로딩 : 자료형과 변수개수가 다르면 오버로딩
	public void resize(double radius) {
		resize(2*radius, 2*radius);
		centerX = getLeft() + radius;
		centerY = getUp() - radius;
	}
	public double getRadius() {
		return getWidth() / 2;
	}
	public static void printCount() {
		System.out.println("현재까지 만들어진 원의 갯수 : " + CircleCount);
	}
}
