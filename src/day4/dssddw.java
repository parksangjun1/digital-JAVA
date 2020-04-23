package day4;

public class dssddw {

	public static void main(String[] args) {
		// 배열에 임의의 수 넣는 예제
		int arr[] = new int[5];
		int max = 5;
		int min = 1;
		
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random()*(max-min+1)) + min;
			arr[i] = random;
		}
		for(int tmp:arr) {
			System.out.print(tmp + " ");
		}System.out.println();
		
		int arr2[] = new int[5];
		int cnt = 0;
		while(cnt < arr2.length) {
			int random = (int)(Math.random()*(max-min+1)) + min;
			
			
		int i = 0;
		while(i < cnt) {
			if(arr2[i]==random) {
				break;
			}
			i++;
		}
		if(i == cnt) {
			arr2[cnt] = random;
			cnt++;
		}
		
		}for(int tmp:arr2) {
			System.out.print(tmp + " ");
		}
		
	
		

	}

}
