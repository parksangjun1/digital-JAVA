package day4;

public class arrayEx5 {

	public static void main(String[] args) {
		/* 배열의 내용을 정렬하는 예제
		 * 
		 */
		int arr[] = new int[10];
		int rmax = 10;
		int rmin = 1;
	
		
		for(int i = 0; i < arr.length; i++ ) {
			arr[i] = (int)(Math.random()*(rmax-rmin+1)) + rmin;			
		}
		
		for(int tmp:arr) {
			System.out.printf("%3d ",tmp);
		}
		System.out.println();
		//7 3 2 1 7 4 3 8 10 3 
		//3 2 1 7 4 3 8
		//
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
				
			}
			
		}
		for(int tmp:arr) {
			System.out.printf("%3d ",tmp);
		}
		
		
	}

}
