package day21;

import java.util.*;



public class HouseholdLederEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Leder> list = new ArrayList<Leder>();
		Leder leder;
		int menu = 0;
		do {
			printMenu();
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.println("내용을 등록하세요 . ");
				leder = registration(scan);
				if(!registration(list, leder))
					System.out.println("이미 있는 내용 입니다.");
				else {
					System.out.println("내용을 등록하였습니다.");
				}
				registration(list, leder);
				break;
			case 2:
				break;
			case 3:
				
				break;
			case 4:
				printList(list);
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				break;
			default :
				System.out.println("잘못된 메뉴입니다.");
			}
			
		}while(menu != 5);
		
		/* 가계부 프로그램 작성
		 * 메뉴
		 *  1.등록
		 *  - 일시,내용,수입/지출,금액 분류를 등록
		 *  2.수정
		 *  - 등록된 리스트 중에 수정할 내용을 선택 -> 선택한 내용을 수정
		 *  3.확인
		 *  - 일시를 기준으로 확인
		 *  - 수입/지출을 기준으로 확인
		 *  - 분류를 기준으로 확인
		 *  4.종료
		 */
	}
	public static void printList(List<Leder> list ) {
		if(list == null || list.size() ==  0)			
		System.out.println("---------");
		for(Leder tmp : list) {
			System.out.println(tmp);
		}
	}
	public static void printMenu() {
		System.out.println("=========메뉴==========");
		System.out.println("1. 등록하시겠습니까 ?");
		System.out.println("2. 수정하시겠습니까 ?");
		System.out.println("3. 확인하시겠습니까 ?");
		System.out.println("4. 내역을출력합니까 ?");
		System.out.println("5. 프로그램 종료.");
	}
	
	public static Leder registration(Scanner scan) {
		Leder leder = new Leder();
		System.out.println("일시를 입력하세요 :");
		String day = scan.next();
		System.out.println("내용을 입력하세요 :");
		String contents = scan.next();
		System.out.println("수입을 입력하세요 :");
		String imp = scan.next();
		System.out.println("지출을 입력하세요 :");
		String expense = scan.next();
		System.out.println("금액을 입력하세요 :");
		String money = scan.next();
		leder.day = day;
		leder.contents = contents;
		leder.imp = imp;
		leder.expense = expense;
		leder.money = money;
		
		return leder;
	}
	public static boolean registration(List<Leder> list, Leder leder) {
		if(list == null || leder == null) return false;//영어단어장 리스트가 없거나, 영어단어 정보가 없으면 추가할 수 없기 때문에 실패
		if(list.contains(leder)) 
			return false;
		list.add(leder); 
		return true;
		
	}
	/* 기능 : 일시, 내용, 수입/지출, 금액을 입력받아 가계부에 저장
	 * 매개변수 : Scanner Scan
	 * 리턴타입 : Leder
	 * 메소드명 : registration
	 */
	public static boolean modify(Leder leder, List<Leder> list) {
		if(leder == null || list == null)
			return false;
		if(!list.contains(leder))
			return false;
		list.remove(list);
		list.add(leder);
		return true;
	}	
	/* 기능 : 등록된 가계부에서 수정할 내용을 선택하여 수정하여 알려주는 메소드로 수정항목이 없으면 false, 있으면 true
	 * 매개변수 : Leder leder, List<Leder> list
	 * 리턴타입 : boolean
	 * 메소드명 : modify
	 */
	public static boolean check(Leder leder, List<Leder> list) {
		if(leder == null || list == null)
			return false;
		if(!list.contains(leder))
			return false;
		for(Leder tmp : list) {
			if(tmp.equals(leder))//true;
				System.out.println(tmp);
		}
		return true;	
	}
	/* 기능 : 등록된 가게부를 확인하여 일시, 수입/지출을 기준으로 확인하는 메소드로 확인내용이 없으면 false, 있으면 true로 알려줌
	 * 매개변수 : Leder leder, List<Leder> list
	 * 리턴타입 : boolean
	 * 메소드명 : Check
	 */

}
class Leder{
	String day; // 일시
	String contents; // 내용
	String imp,expense; // 수입/지출
	String money;
	@Override
	public String toString() {
		return "Leder [day=" + day + ", contents=" + contents + ", imp=" + imp + ", expense=" + expense + ", money="
				+ money + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contents == null) ? 0 : contents.hashCode());
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		result = prime * result + ((expense == null) ? 0 : expense.hashCode());
		result = prime * result + ((imp == null) ? 0 : imp.hashCode());
		result = prime * result + ((money == null) ? 0 : money.hashCode());
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
		Leder other = (Leder) obj;
		if (contents == null) {
			if (other.contents != null)
				return false;
		} else if (!contents.equals(other.contents))
			return false;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		if (expense == null) {
			if (other.expense != null)
				return false;
		} else if (!expense.equals(other.expense))
			return false;
		if (imp == null) {
			if (other.imp != null)
				return false;
		} else if (!imp.equals(other.imp))
			return false;
		if (money == null) {
			if (other.money != null)
				return false;
		} else if (!money.equals(other.money))
			return false;
		return true;
	}
	
	
}