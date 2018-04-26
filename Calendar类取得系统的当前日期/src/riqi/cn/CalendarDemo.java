package riqi.cn;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.sound.midi.SysexMessage;

/*
 * Calendar 类是一个抽象类,
 * 要想使用一个抽象类，则必须依靠对象的多态性，通过子类进行父类的实例化操作
 * 直接已知子类：
 GregorianCalendar
 常用的方法：
 static Calendar	getInstance() 
          使用默认时区和语言环境获得一个日历。
          常见得常量是：
          public static final int YEAR
          public static final int MONTH
          public static final int DAY_OF_MONTH
 */
public class CalendarDemo {
	public static void main(String[] args) {
		//通过多态，申明一个Calendar对象
		Calendar cd = new GregorianCalendar();
		System.out.println("年"+cd.get(Calendar.YEAR));
		System.out.println("月"+cd.get(Calendar.MONTH));
	    System.out.println("日"+cd.get(Calendar.DAY_OF_MONTH));  
		
	}

}
