package day16;

import java.util.*;

import Student.Student;
import Student.Subject;


public class MapEx2 {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();

		
		Set set = map.entrySet();
		Iterator it = set.iterator();
						
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		while(menu != 3) {			
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
			moidfy(scan,map);
			break;	
		case 4:
			System.out.println("프로그램을 종료합니다.");
			break;	
		}
		}
	}
	public static void printMenu() {
		System.out.println("-----메뉴------");
		System.out.println("1. 등록");
		System.out.println("2. 검색");
		System.out.println("3. 수정");
		System.out.println("4. 종료");
		System.out.println("메뉴를 선택하세요 :");
	}
	public static void inputInfo(Scanner scan, Map<String, String>map) {
		System.out.println("ID : ");
		String ID = scan.next();
		System.out.println("PW : ");
		String PW = scan.next();
		map.put(ID,PW);
	}
	public static void searchInfo(Scanner scan, Map<String, String>map) {		
		System.out.println("id : ");
		String ID = scan.next();
		String PW = map.get(ID);					
		if(PW == null) {
			System.out.println(ID + "는 없는 ID 입니다.");						
		}else{
			System.out.print(ID + "의 비밀번호는 : " + PW + "입니다.");
		}
	}
	
	public static void moidfy(Scanner scan, Map<String, String>map) {
		System.out.println("ID : ");
		String ID = scan.next();	
		String PW = map.get(ID);
				
		if(PW != null) {
			System.out.println(PW);
		}	
		
	}
}

