package kr.co.jhta.app;

import java.util.Calendar;

public class NowTime {
	public int getHours(){
		Calendar c = Calendar.getInstance();
		int hour = c.get(Calendar.HOUR_OF_DAY);
		return hour;
	}
}
