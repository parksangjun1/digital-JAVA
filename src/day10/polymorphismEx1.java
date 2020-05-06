package day10;// p.356 

public class polymorphismEx1 {


	public static void main(String[] args) {
		Tv t = new Tv();
		CaptionTv ct = new CaptionTv();
		//자식객체를 생성하여 부모가 참조하는 경우에는 자식클래스의 멤버변수 power,ch,text가 
		 //만들어진 후 부모가 power와 ch만 사용하기 때문에 이경우에는 가능
		Tv t1 = new CaptionTv();
		//부모객체를 생성하여 자식이 참조하는 경우에는 부모클래스의 멤버변수 power,ch만 만들어진 상태에서 
		//자식이 text를 사용하려면, 문제가 되기 때문에 이 경우는 불가능		
		//CaptionTv ct1 = new Tv();
		
		t = ct; //자손타입 -> 조상타입
		//t = new Tv(); -> 이코드가 없는경우에는 아래가 가능하지만 이코드를 활성화하면 아래코드는 에러
		/* 조상타입에서 자손타입은 항상 가능한 것이 아니라
		 * 조건부로 가능하다. 상황에 따라서 ClassCastException이 발생한다.
		 * 되는경우는 부모객체 t가 부모클래스를 통해 생성된 객체가 아니라 자식 클래스를 통해
		 * 생성된 객체와 연결이 된 경우는 가능
		 */
		ct = (CaptionTv)t; //조상타입 -> 자손타입
		
		SmartTv st = new SmartTv();
		ct = new CaptionTv();
		Tv.display(st);
		Tv.display(ct);
		
	}
}
class Tv{
	boolean power = false;
	int ch;
	void power() {power = !power;}//토굴작업시 많이 사용한다.	
	void chUp() {ch++;}
	void chDown() {ch--;}
	//매개변수의 다형성 예제
	public static void display(Tv t) {
		if(t instanceof CaptionTv) {//instanceof 보통 조건문과 같이 쓰인다.
			System.out.println("캡션TV");
		}else if(t instanceof SmartTv) {
			System.out.println("스마트TV");
		}
	}
}
class CaptionTv extends Tv{
	String text;
	void caption() {System.out.println("캡션 : " + text);}
}
class SmartTv extends Tv{
	String ip;
}