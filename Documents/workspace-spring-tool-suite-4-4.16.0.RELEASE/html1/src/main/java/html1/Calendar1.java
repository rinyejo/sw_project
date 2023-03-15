package html1;

import java.util.Calendar;
public class Calendar1 {
	
	
	
/*
 * 달력 출력 
 * 
 * firstDayOfWeek 1일의 요일
 *  월:1, 화:2, .. 토:6, 일:7
 *  lastDay: 마지막 날
 * */
	
	static void printCalendar(int firstDayOfWeek, int lastDay) {
		
	}
	
	public static void main(String[] args) {
		
		int year = 2015, month= 7; //2015년 7월
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month -1,1,0,0);
		
		int 요일 = calendar.get(Calendar.DAY_OF_WEEK); //2015년 7월 1일의 요일 구하기
		
		calendar.add(Calendar.MONTH, 1);
		calendar.add(Calendar.DATE, -1);
		int 마지막날 = calendar.get(Calendar.DATE); //2015년 7월의 마지막 날 구하기 
		
		printCalendar(요일, 마지막날);

		System.out.print(year);
		
	}

}
