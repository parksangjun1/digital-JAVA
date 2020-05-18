package day18;

import java.util.*;

public class TestEx3 {

	public static void main(String[] args) {
		//3. 영어사전을 프로그램으로 만들려고 할 때, 단어를 저장할 수 있는 클래스를 생성해세요.
		ArrayList<String> EngList = new ArrayList<String>();

	}
/* 단어클래스
 * 단어, 품사, 뜻을 저장하여 관리하는 클래스
 */
}
class Word{
	String word;
	//String wordClass[];
	//String meanning[];
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
class Dic{
	List<Word> list = new ArrayList<Word>();
	//단어추가기능
	//단어수정기능 => 품사를 수정하거나 뜻을 수정
	//단어삭제기능
	//사전출력기능 => 한 단어의 정보를 출력하거나 특정단어가 들어간 단어들을 출력
}