package day15;

import java.util.*;


public class TestEx1 {

	public static void main(String[] args) {
		/* 오늘의 할일을 리스트에 저장하고 출력하는 코드를 ArrayList를 이용하여 작성하세요.
		 * 예)
		 * 오늘의 할일을 추가하시겠습니까?(y/n) : y
		 * 오늘의 할일을 입력하세요: 수업
		 * 오늘의 할일을 추가하시겠습니까?(y/n) : y
		 * 오늘의 할일을 입력하세요: 수업
		 * 오늘의 할일을 추가하시겠습니까?(y/n) : n
		 * 오늘의 할일
		 * 1.수업
		 * 2.점심
		 * 프로그램을 종료합니다.
		 */
		/*ArrayList<Work>list = new ArrayList<Work>();
		list.add(new Work());
		printList(list);
		*/

		Scanner scan = new Scanner(System.in);
		ArrayList<String>list = new ArrayList<String>();
		while(true) {			
			System.out.print("오늘의 할일을 추가하시겠습니까? (y/n)");			
			char menu = scan.next().charAt(0);
			scan.nextLine();	
			if(menu=='y' || menu == 'Y') {				
				System.out.print("오늘의 할일을 입력하세요 :");
				String name  = scan.nextLine();				
				/*list.add(0,new Work(cnt));
				System.out.println("1번지에 200을 추가 후 list");
				printList(list);*/
				list.add(name);
			}else if(menu == 'n' || menu == 'N') {
				for(int i = 0; i < list.size(); i++) {
					System.out.println(i+1 +"." + list.get(i));
				}
				break;
			}
			
		}
		System.out.println("프로그램을 종료합니다.");
		scan.close();

	}
	/*
	private static void printList(List<Work> list) {
		for(Work tmp : list) {
			System.out.print(tmp+" ");
		}	
		System.out.println();
	}


}
class Work{
	String work;

	@Override
	public String toString() {
		return "Work [work=" + work + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((work == null) ? 0 : work.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Work other = (Work) obj;
		if (work == null) {
			if (other.work != null)
				return false;
		} else if (!work.equals(other.work))
			return false;
		return true;
	}
	
	public Work() {}
	public Work(String work) {this.work = work;}
	
	
	*/
}
	