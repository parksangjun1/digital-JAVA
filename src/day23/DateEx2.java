package day23;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateEx2 {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.add(Calendar.DATE, -7);
		Date today = date.getTime();
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(format.format(today));
		format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		System.out.println(format.format(today));
		System.out.println("=========================================");
		/* 날짜를 내가 지정한 형태의 문자열로 변환하는 코드
		 * 2020년 5월 25일
		 * 2020년-05-25
		 * P.546
		 */
		String strDate = "2020-05-25 15:24:10";
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		try {
			Date date1 = format1.parse(strDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/* 문자열을 Date로 변환하는 코드
		 * 
		 */
		
	}
}
