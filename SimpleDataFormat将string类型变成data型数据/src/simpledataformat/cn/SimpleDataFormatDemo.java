package simpledataformat.cn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * 在开发中经常将string 类型变成data型数据
 * 常用的方法为：
 * SimpleDateFormat(String pattern) 
          用给定的模式和默认语言环境的日期格式符号构造 SimpleDateFormat。
           Date	parse(String text, ParsePosition pos) 
          解析字符串的文本，生成 Date。
          StringBuffer	format(Date date, StringBuffer toAppendTo, FieldPosition pos) 
          将给定的 Date 格式化为日期/时间字符串，并将结果添加到给定的 StringBuffer。
          public final string format(data datd)
             将一个data 类型按照指定格式变成 string 类型      
 */
public class SimpleDataFormatDemo {
public static void main(String[] args) throws Exception {
	//定义一个常量
	String ing = "2017-5-9 12:34:23";
	//定义一个模板
	String str = "yyyy-MM-dd HH:mm:ss";
	//创建 SimpleDateFormat一个实例化对象
	SimpleDateFormat sd = new SimpleDateFormat(str);
	//解析字符串的文本，生成 Date
	Date d = sd.parse(ing);
	System.out.println(d);	
}
}
