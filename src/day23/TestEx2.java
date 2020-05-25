package day23;

import java.util.*;

public class TestEx2 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>(5);

		int size = 5;
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < size; i++) {
			int tmp = scan.nextInt();
			list.add(tmp);
		}
		int sum = 0;
		double avg = 0.0;
		Iterator<Integer> it = list.iterator();
		
		avg = (double) sum / list.size();
		sum = sum(list);
		avg = avg(list);
		System.out.println(sum);
		System.out.println(avg);
	}
	public static int sum(List<Integer> list) {
		int sum = 0;
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {		
			Integer tmp = it.next();			
			sum += tmp;
		}
		return sum;
	}
	public static double avg(List<Integer> list) {
		return (double)sum(list) / list.size();
	}
		
}