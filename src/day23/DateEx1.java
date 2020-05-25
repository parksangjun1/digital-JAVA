package day23;

import java.util.Calendar;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

public class DateEx1 {

	public static void main(String[] args) {
		/* month - 달은 0~11까지 입력하기 때문에 5월을 입력하려면 4로 입력하거나 Calendar.MAY를 입력
		 * Calendar.MAY는 상수 4를 의미한다.
		 * 
		 */
		Calendar date = Calendar.getInstance();
		date.set(2020, Calendar.MAY, 5);
		System.out.println(toString(date));
		date.add(Calendar.DATE, -14);
		System.out.println(toString(date));
		date.add(Calendar.DATE, 14);
		System.out.println(toString(date));
	}
	public static String toString(Calendar date) {
	return date.get(Calendar.YEAR)+"-"+
				(date.get(Calendar.MONTH)+1)+"-" +
					date.get(Calendar.DATE);
	}
}
