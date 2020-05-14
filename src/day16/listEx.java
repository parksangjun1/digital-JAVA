package day16;

import java.util.*;


public class listEx {

	public static void main(String[] args) { 
		//1~10사이의 랜덤한 수를 생성하여 6개 리스트에 저장하고 출력하는 코드를 작성.(중복불가)	 
		//1. : 리스트 생성
		List<Integer>list = new ArrayList<Integer>();
		//2. : 반복문 실행
		while(list.size() < 6) {
			//2_1 : 1~10사이의 랜덤한 수 생성
			int r = new Random().nextInt(10)+1;
			//2_2 : 리스트에 생성된 랜덤수가 있는지 체크
			//2_3 : 없으면 리스트에 추가
			if(!list.contains(r)) {
				list.add(r);
			}
		}
		System.out.println(list);

	}	
}