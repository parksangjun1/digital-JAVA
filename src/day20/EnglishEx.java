package day20;

import java.util.*;

public class EnglishEx {

	public static void main(String[] args) {
		//3. 영어사전을 프로그램으로 만들려고 할 때, 단어를 저장할 수 있는 클래스를 생성해세요.
		Scanner scan = new Scanner(System.in);		
		List<Word> EngList = new ArrayList<Word>();
		Word w;
		int menu = 0;
		do {
			printMenu();			
			menu = scan.nextInt();
			switch(menu) {
			case 1 :
				System.out.println("등록할 영어단어를 입력하세요.");
				w = insertEngWord(scan);
				if(!insertEngWord(EngList, w))
					System.out.println("이미 있는 단어입니다.");
				else {
					System.out.println("단어를 등록하였습니다.");
				}
				insertEngWord(EngList,w);
				break;
			case 2 :
				System.out.println("수정할 영어단어를 입력하세요.");
				w = insertEngWord(scan);
				if(!modifyEngWord(EngList, w))
					System.out.println("입력하신 단어가 단어장에 없습니다.");
				else {
					System.out.println("단어가 수정되었습니다.");
				}
				break;
			case 3 :
				System.out.println("삭제할 영어단어를 입력하세요.");
				w = insertEngWord(scan);
				if(!deleteEngWord(EngList, w))
					System.out.println("입력하신 단어가 단어장에 없습니다.");
				else{
					System.out.println("단어가 삭제되었습니다.");
				}				
				break;
			case 4 :
				System.out.println("검색할 영어단어를 입력하세요.");
				w = searchInsertEngWord(scan);		
				if(!SearchEngWord(EngList, w))
					System.out.println("입력하신 단어가 단어장에 없습니다.");
				else{
					System.out.println("단어가 검색되었습니다.");
				}
				break;
			case 5 :
				printEnglish(EngList);
				break;
			case 6 :
				System.out.println("프로그램을 종료하겠습니다.");
				break;
			default : 
				System.out.println("올바른 메뉴가 아닙니다.");
			}
		}while(menu != 6);

	}
	public static void printMenu() {		
		System.out.println("-----메뉴-----");
		System.out.println("1. 영어단어등록");
		System.out.println("2. 영어단어수정");
		System.out.println("3. 영어단어삭제");
		System.out.println("4. 영어단어검색");
		System.out.println("5. 영어단어출력");
		System.out.println("6. 프로그램종료");
		
	}
	public static void printEnglish(List<Word> EngList ) {
		if(EngList == null || EngList.size() ==  0)			
		System.out.println("단어--품사--의미--");
		for(Word tmp : EngList) {
			System.out.println(tmp);
		}
	}
	public static Word searchInsertEngWord(Scanner scan) {
		Word w = new Word();
		System.out.println("검색할 단어를 입력하세요 : ");
		String word = scan.next();	
		w.word = word;
		return w;
	}
	public static Word insertEngWord(Scanner scan) {
		Word w = new Word();
		System.out.println("단어를 입력하세요 : ");
		String word = scan.next();	
		w.word = word;
		char menu = 'y';
		do {
			if(menu=='y') { 
			System.out.println("품사를 입력하세요 : ");
			String wordClass = scan.next();
			System.out.println("의미를 입력하세요 : ");
			String meanning = scan.next();				
			w.wordClass.add(wordClass);
			w.meanning.add(meanning);	
			System.out.print("더 입력하시겠습니까 : (y/n)"); 
			menu = scan.next().charAt(0);  						
			} 
		}while(menu != 'n');		  								
		return w;///////////////////반복문만들기.
	}
	
	/* 기능 : Scanner를 이용하여 영어단어를 입력하며 영어단어장 객체를 반환하는 메소드
	 * 매개변수 : Scanner scan
	 * 리턴타입 : 학생 객체 -> Word
	 * 메소드명 : inputEngWord
	 */
	public static boolean insertEngWord(List<Word> EngList, Word w) {
		if(EngList == null || w == null) return false;//영어단어장 리스트가 없거나, 영어단어 정보가 없으면 추가할 수 없기 때문에 실패
		if(EngList.contains(w)) 
			return false;
		EngList.add(w); 
		return true;
		
	}
	/* 기능 : 주어진 영어단어를 영어 단어장에 저장하는 메소드로 영어단어가 이미 있으면 저장하지 않고 없는 단어이면 저장
	 * 매개변수 : 영어단어장, 주어진영어 => List<String> EngList, Work w
	 * 리턴타입 : 저장 여부 -> boolean
	 * 메소드명 : insertEngWord
	 */
	public static boolean modifyEngWord(List<Word> EngList, Word w) {
		if(EngList == null || w == null) return false;
		if(!EngList.contains(w))
			return false;
		EngList.remove(w);
		EngList.add(w);
		return true;
		
	}
	/* 기능 : 주어진 영어단어를 영어단어장에서 수정하는 메소드로 해당 영어단어가 없으면 수정실패, 영어단어가 있으면 수정 성공을 알려줌
	 * 매개변수 : 영어단어장, 주어진영어 => List<String> EngList, Work w
	 * 리턴타입 : 수정 여부 -> boolean
	 * 메소드명 : modifyEngWord
	 */
	public static boolean deleteEngWord(List<Word> EngList, Word w) {
		if(EngList == null || w == null) return false;
		if(!EngList.contains(w))
			return false;
		EngList.remove(w);		
		return true;
		
	}
	/* 기능 : 주어진 영어단어를 영어단어장에서 삭제하는 메소드로 영어단어가 없으면 삭제실패, 영어단어가 있으면 삭제 성공을 알려줌
	 * 매개변수 : 영어단어장, 주어진영어 => List<String> EngList, Work w
	 * 리턴타입 : 삭제 여부 -> boolean
	 * 메소드명 : deleteEngWord
	 */
	public static boolean SearchEngWord(List<Word> EngList, Word w) {
		if(EngList == null || w == null) return false;
		if(!EngList.contains(w))
			return false;
		for(Word tmp : EngList) {
			if(tmp.equals(w))//true;
				System.out.println(tmp);
		}						
		return true;
	}
	/* 기능 : 주어진 영어단어를 영어단어장에서 검색하는 메소드로 영어단어가 없으면 검색실패, 영어단어가 있으면 검색해서 알려줌
	 * 매개변수 : 영어단어장, 주어진영어 => List<String> EngList, Work w
	 * 리턴타입 : 검색 여부 -> boolean
	 * 메소드명 : SearchEngWord
	 */
	
 
 /* 단어, 품사, 뜻을 저장하여 관리하는 클래스
 */
}
class Word{
	String word;
	List<String>wordClass = new ArrayList<String>();
	List<String>meanning = new ArrayList<String>();
	//단어는 중복되면 안되기 때문에, 해당하는 단어와 같은지를 판별하는 equals가 필요하다.
	// : 단어만 비교한다. word
	
	
	@Override
	public int hashCode() {// 분류를 하기 위한 기능이다. 
		final int prime = 31;
		int result = 1;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		return result;
	}
	@Override
	public String toString() {
		String str = "단어 : " + word + "\n";
		for(int i = 0; i < meanning.size(); i++) {
			str += (i+1) + "." + wordClass.get(i) + " : " + meanning.get(i) + "\n";
		}
		return str;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		return true;
	}
	
}