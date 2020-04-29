package day9;

public class RecursiveEx3 {

	public static void main(String[] args) {
		ClassB b = new ClassB();
		b.print(5);

	}

}
class ClassA{
	public void print() {
		System.out.println("A클래스입니다.");
	}
}
class ClassB extends ClassA{
	//print메소드를 오버라이딩
	public void print() {
		//printf();//재귀 호출이 되어 스택오버플로우 에러가 발생한다.
		super.print(); //목적에 맞게 부모 클래스를 의미하는 super를 붙여줘야한다.
		System.out.println("B클래스입니다.");
	}
	//print 메소드를 오버로딩
	public void print(int num) {
		print();
		System.out.println("B클래스입니다.");
	}
}