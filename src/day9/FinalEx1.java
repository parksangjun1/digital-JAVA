package day9;

public class FinalEx1 {

	public static void main(String[] args) {
		/*지역변수는 자동 초기화가 안됨*/
		final double PI;
		PI = 3.141592;; //이 때 초기화를 함
		//PI = 3.14; 에러발생 : 초기화 된 final상수를 수정하려고 했기 때문에 
		A a = new A();
		a.print();
		D d = new D();
		d.print();
		int arr[] = new int[10];
		System.out.println(arr.length);
		//arr.length = 11; //에러발생 //파이널 맴버변수임으로 수정이 불가능
		Array array = new Array(5);
		array.push(1);
		array.push(2);
		array.push(3);
		array.push(4);
		//System.out.println(array.get(3));
		//System.out.println(array.get(4)); // 예외처리를 안했기때문에 0이된다.
		for(int i=0; i<5; i++) {
			System.out.println(array.pop());
		}
	}
}
final class A{
	public void print() {
		System.out.println("A클래스입니다.");
	}
}
class B{// extends A{// 클래스 A는 final 클래스이기 때문에 상속하려면 에러 발생한다.
	
}
class D{
	//print 메서드에 final을 붙이면 아래 클래스 E에서 print 메서드를 오버라이드 할 수 없다.
	//하려면 에러 발생
	public /*final*/ void print() {
		System.out.println("D클래스입니다.");
	}		
}
class E extends D{
	@Override
	public void print() {
		System.out.println("E클래스입니다.");
	}		
}
class Array{//final을 사용했기때문에 length에 값을 넣어주어야된다. -> length = 0;
	public final int length;
	private int arr[];//클래스를 이용하여 객체를 만듬
	private int index = 0; //현재 저장된 원소의 수
	public Array() {
		length = 10;
		arr = new int[length];
	}
	public Array(int length) {
		this.length = length;
		arr = new int[length];
	}
	public void push(int num) {
		if(index < length) {
		arr[index] = num;
		index++;
		}
		/*
		 * else{
		 * 1. 안내메세지만 처리한다.
		 * 2. 배열의 확장하여 추가하는 경우
		 */
	}
	public int get(int index) {
		if(this.index > index) {
			return arr[index];
		}
		return 0;//잘못된 접근이므로 예외처리 클래스를 이용하여 처리하여야하는데 
				//아직 안배워서 0으로 처리.
	}
	public int pop() {
		if(index == 0) {
			return 0;//throw를 이용하여 예외를 발생시켜야하는데 아직 안배워서 그냥 0으로 return함
		}
		index--;
		int res = arr[index];		
		return res;
	}
}
