package day23;

import java.util.*;

public class TestEx3 {

	public static void main(String[] args) {
		/* 중복되지 않는 정수 5개를 Set에 저장하고, 저장된 값의 합과 평균을 구하세요.
		 * 
		 */
		
		HashSet<Integer> hs = new HashSet<Integer>(5);
		//2. : 반복문 실행 
		int size = 5;
		
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < size; i++) {
			int tmp = scan.nextInt(); 
			if(!hs.contains(tmp)) { 
				hs.add(tmp); 
			} 		
		}
		int sum = 0;
		double avg = 0.0;
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext()) { 
			Integer tmp = it.next();			
			sum += tmp;
			avg = (double)sum / hs.size();
		}		
		System.out.println("주어진 수 : " + hs);
		System.out.println("합 : " +sum);
		System.out.println("평균 : " +avg);
	}

}
