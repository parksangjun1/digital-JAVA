package day16;

import java.util.*;

public class MapEx2_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Map 인터페이스를 이용하여 객체를 만들 수는 없지만(new를 통해서)
		//Map 인터페이스를 구현한 HashMap을 이용하여 객체를 만들어서
		//Map 인터페이스의 객체에 저장할 수 있다.
		Map<String, String> map = new HashMap<String, String>();//HashMap은 클래스으므로 구현이가능하지만 Map은 인터페이스이므로 구현이불가능하다.
		int menu = 4;
		do {
			printMenu();
			menu = scan.nextInt();
			switch(menu) {
			case 1: 
				inputInfo(scan,map);
				break;
			case 2:
				searchInfo(scan,map);
				break;
			case 3:
				moidfyInfo(scan,map);
				break;
			case 4:	
				System.out.println("프로그램을 종료하겠습니다."); break;
			default :
				System.out.println("잘못된메뉴입니다.");
			}
		}while(menu != 4);
	}
	
	public static void printMenu() {
		System.out.println("-----메뉴------");
		System.out.println("1. 등록");
		System.out.println("2. 검색");
		System.out.println("3. 수정");
		System.out.println("4. 종료");
		System.out.printf("메뉴를 선택하세요 :");
	}
	/* 기능 : 스캐너를 이용하여 id와 pw를 입력받아 map에 저장하는 메소드
	 * 매개변수 : scan, map => Scanner scan, Map<String, String>map 
	 * 리턴타입 : 
	 */
	public static void inputInfo(Scanner scan, Map<String, String>map){
		System.out.println("ID : ");
		String ID = scan.next();
		System.out.println("PW : ");
		String PW = scan.next();
		map.put(ID, PW);
	}
	/* 기능 : 스캐너를 이용하여 id를 입력받아 해당 id와 일치하는 id가 있는지 확인하여
	 * 		있으면 id와 pw를 출력하고, 없으면 없다고 출력하는 메소드
	 * 매개변수 : scan, map => Scanner scan, Map<String, String>map 
	 * 리턴타입 : void
	 */
	public static void searchInfo(Scanner scan, Map<String, String>map) {
		System.out.println("ID : ");
		String ID = scan.next();
		String PW = map.get(ID);
		if(PW == null) {
			System.out.println("ID는 없는 ID입니다.");
		}else {
			System.out.println(ID + "의 비밀번호는" + PW + "입니다.");
		}
		
	}
	/* 기능 : 스캐너를 이용하여 id를 입력받고, map에서 id와 일치하는 정보가 있으면 비밀번호를 입력받아
	 * 		수정하는 메소드
	 * 매개변수 : scan, map => Scanner scan, Map<String, String>map 
	 * 리턴타입 : void
	 */
	public static void moidfyInfo(Scanner scan, Map<String, String>map) {
		System.out.println("ID : ");
		String ID = scan.next();	
		String PW = map.get(ID);
				
		if(PW == null) {
			System.out.println(ID + "는 없는 ID입니다.");
			return;
		}
		System.out.print("PW(NOW) : ");
		String iPW = scan.next();
		System.out.print("PW(NEW) : ");
		String inewPW = scan.next();
		if(!PW.equals(iPW)) {
			System.out.println("비밀번호 수정에 실패했습니다.");
		}else {
			map.replace(ID, inewPW);
			System.out.println("비밀번호를 수정했습니다.");
		}
	}
}
