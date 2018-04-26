package print.cn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * 字节打印流 ： 类 PrintStream
 * 字符打印流：类 PrintWriter
 * 类 PrintStream 构造方法：
 * PrintWriter(OutputStream out) 
          根据现有的 OutputStream 创建不带自动行刷新的新 PrintWriter。
          主要方法：
  void	print(boolean b) 
          打印 boolean 值。
  void	print(char c) 
          打印字符。
  void	print(char[] s) 
          打印字符数组。
  void	print(double d) 
          打印 double 精度浮点数。
  void	print(float f) 
          打印一个浮点数。
  void	print(int i) 
          打印整数。
  void	print(long l) 
          打印 long 整数。
  void	print(Object obj) 
          打印对象。
  void	print(String s) 
          打印字符串。
          
       PrintWriter 相关操作详见api文档   
 */
public class PrintDemo {
	public static void main(String[] args) {
		PrintStream ps =null;
		try {
			 ps = new PrintStream(new FileOutputStream(new File("d:"+File.separator+"test2.txt")));
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        ps.print("hello");
	    ps.println("world!!!");
	    ps.print("1+1 =22");
	}

}
