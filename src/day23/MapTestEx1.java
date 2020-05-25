package day23;

import java.util.*;

public class MapTestEx1 {

	public static void main(String[] args) {
		/* 카페 등급을 프론트에서 요청을 하면 서버에서 해당 카페 등급에 맞는 카페리스트와
		 * 카페등급을 프론트로 보내려고 한다.
		 * 이때 카페등급 : int이고, 카페이름 : String, 카페리스트 : List<String>
		 * 
		 */
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("cafeGrade", new Integer(1));//카페 등급이 1등급
		List<String> list = new ArrayList<String>();
		list.add("네이버 카페1");
		list.add("네이버 카페2");
		map.put("cafeList", list);
	}

}
