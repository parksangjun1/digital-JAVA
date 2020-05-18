package day18;

import java.util.*;


public class TestEx8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("입력받을 정수의 개수 : ");
		int size = scan.nextInt();
		//int arr[] = new int[size];
		Stack<Integer> arr = new Stack<Integer>();
		System.out.print("정수"+  size + "개를 입력하세요.");
		for(int i = 0; i < size; i++) {			
			int tmp = scan.nextInt();
			//arr[i] = tmp;
			arr.push(tmp);
			//arr.add(scan.nextInt);
			
		}
		System.out.println("입력 받은 정수를 거꾸로 출력");
		Stack<Integer> tmp = new Stack<Integer>();
		tmp.addAll(arr);
		for(int i = size-1; i>= 0; i--) {
			//System.out.print(arr[i] + " ");
			System.out.print(tmp.pop() + " ");
		}
		scan.close();
	}	
}
