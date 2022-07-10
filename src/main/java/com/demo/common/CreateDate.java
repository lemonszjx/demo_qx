package com.demo.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CreateDate {

	// 获取系统日期
	public static String getDate() {
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
		String d = s.format(new Date());
		return d;
	}
	
	public static String getDateHHMM() {
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String d = s.format(new Date());
		return d;
	}
	
	public static String getDateA() {
		SimpleDateFormat s = new SimpleDateFormat("yyyy.MM.dd");
		String d = s.format(new Date());
		return d;
	}

	// 获取系统日期和时�?
	public static String getDateTimes() {
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String d = s.format(new Date());
		return d;
	}

	// 获取系统年份
	public static String getYear() {
		SimpleDateFormat s = new SimpleDateFormat("yyyy");
		String d = s.format(new Date());
		return d;
	}

	// 获取系统月份
	public static String getMoon() {
		SimpleDateFormat s = new SimpleDateFormat("MM");
		String d = s.format(new Date());
		return d;
	}

	// 获取系统当天
	public static String getDay() {
		SimpleDateFormat s = new SimpleDateFormat("dd");
		String d = s.format(new Date());
		return d;
	}

	// 获取系统当天
	public static int getTs(String date) {
		// 算两个日期间隔多少天
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = null;
		try {
			date1 = format.parse(date);
		} catch (ParseException e) {
			// TODO 自动生成�? catch �?
			e.printStackTrace();
		}
		int a = (int) ((new Date().getTime() - date1.getTime()) / (1000 * 3600 * 24));
		return a;
	}
	
	// 获取系统当天
		public static String getTs_yyyy_mm() {
			SimpleDateFormat s = new SimpleDateFormat("yyyy-MM");
			String d = s.format(new Date());
			return d;
		}

	// 算两个日期间隔多少天
	public static int differentDays(String date1s, String date2s) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = null;
		Date date2 = null;
		try {
			date1 = sdf.parse(date1s);
			date2 = sdf.parse(date2s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(date1);

		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date2);
		int day1 = cal1.get(Calendar.DAY_OF_YEAR);
		int day2 = cal2.get(Calendar.DAY_OF_YEAR);

		int year1 = cal1.get(Calendar.YEAR);
		int year2 = cal2.get(Calendar.YEAR);
		if (year1 != year2) // 同一�?
		{
			int timeDistance = 0;
			for (int i = year1; i < year2; i++) {
				if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) // 闰年
				{
					timeDistance += 366;
				} else // 不是闰年
				{
					timeDistance += 365;
				}
			}
			return timeDistance + (day2 - day1);
		} else // 不同�?
		{
			System.out.println("判断day2 - day1 : " + (day2 - day1));
			return day2 - day1;
		}
	}
	
	
	
	
	
	
	
	
	

}
