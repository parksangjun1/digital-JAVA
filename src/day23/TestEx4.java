package day23;

import java.util.*;

public class TestEx4 {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>(5);
		int size = 5;
		/* 문제에서 정수 5개를 입력받는게 아니라 중복되지 않은 정수 5개를 입력받아야 하기 때문에
		 * 반복 횟수는 5번으로 고정된 것이 아니라 Set에 5개가 저장될 때 까지 반복해야 한다.
		 */
		Scanner scan = new Scanner(System.in);
		for(; set.size() < size;) {		
			set.add(scan.nextInt());
			//int tmp = scan.nextInt();
			//set.add(tmp);
		}
		int sum = sum(set);
		System.out.println(sum);
		double avg = (double)sum / set.size();
		System.out.println(avg);
		List<Integer>list = new ArrayList<Integer>();
		list.add(1); 
		list.add(2);
		System.out.println(sum(list));
	}
	public static int sum(Collection<Integer> c) {
		Iterator<Integer> it = c.iterator();
		int sum = 0;
		while(it.hasNext()) {
			Integer tmp = it.next();
			if(tmp != null)
				sum += tmp;
		}
		return sum;
	}

}
