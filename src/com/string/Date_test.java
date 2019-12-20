package com.string;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Date_test {

	public static void main(String[] args) throws ParseException {
		Date date1=new Date();
		long d2=System.currentTimeMillis()+1000;
		Date date2=new Date(d2);
		System.out.println(date1);
		System.out.println(date2);
		
		//SimpleDateFormat:日期格式化类
		// G:公元 
		SimpleDateFormat sdf=new SimpleDateFormat("今天是：Gyyyy年MM月dd日  HH时mm分ss秒  E");
		System.out.println(sdf.format(new Date()));
		
		//Calendar：日历
		//获取当前时间
		Calendar calendar=Calendar.getInstance();
		int year=calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH)+1;
		int date=calendar.get(Calendar.DATE);
		int hour=calendar.get(Calendar.HOUR);
		int minute=calendar.get(Calendar.MINUTE);
		int second=calendar.get(Calendar.SECOND);
		System.out.println("当前时间为："+year+"年"+month+"月"+date+"日"+hour+"时"+minute+"分"+second+"秒");
		
		//设置指定日期
		calendar.set(year, month,date,hour,minute,second);
		//为指定日期增加时间，100天
		calendar.add(calendar.DATE, 100);
		year=calendar.get(Calendar.YEAR);
		month=calendar.get(Calendar.MONTH);
		date=calendar.get(Calendar.DATE);
		hour=calendar.get(Calendar.HOUR);
		minute=calendar.get(Calendar.MINUTE);
		second=calendar.get(Calendar.SECOND);
		System.out.println("100天以后的时间为："+year+"年"+month+"月"+date+"日"+hour+"时"+minute+"分"+second+"秒");
		
		//LocalDateTime的使用
		LocalDateTime localDateTime=LocalDateTime.now();
		//plusDays(100)-->增加100天
		System.out.println("100天以后的时间为："+localDateTime.plusDays(100));
		
		LocalDate dqrq=LocalDate.now();
		LocalDate D_100=dqrq.plusDays(100);
		System.out.println( D_100);
		
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
		//将localDate对象的值改为String类的对象用toString方法
		String ybtyh_zfc=D_100.toString();
		//先通过SimpleDateFormat对一百天以后的字符串进行解析，用parse方法
		Date date_100=sdf1.parse(ybtyh_zfc);
		//先通过SimpleDateFormat对一百天以后的Date对象进行格式化，用format方法
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println("一百天以后是："+sdf2.format(date_100));
		
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy/MM/dd");
		String rqzfc="2018/01/27";
		Date date3=sdf3.parse(rqzfc);
		System.out.println(date3.toString());
		SimpleDateFormat sdf4=new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println(sdf4.format(date3));
		
		String str1="abc";
		String str2="abc";
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		String str3=new String("abc");
		String str4=new String("abc");
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		
		
		
	}

}
