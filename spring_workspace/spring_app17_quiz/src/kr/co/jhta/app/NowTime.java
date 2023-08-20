package kr.co.jhta.app;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NowTime {
	Date d = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일hh시mm분ss초");
	String now = sdf.format(d);
}
