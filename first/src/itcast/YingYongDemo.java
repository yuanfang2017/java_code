package itcast;
/*
 * public static int parseInt(String s) throws NumberFormatException
     但是在调用处并没有try catch
     结论：
     exception ：必须要用 try catch 处理
     RunTimeException :可以不使用 try catch，如果产生异常，就交给虚拟机处理 
 */
public class YingYongDemo {
	public static void main(String[] args) {
		//申明一个字符串
		String str = "1234";
		//将 字符串转换为常量，用包装类里面的方法
	     int temp = Integer.parseInt(str);
	      System.out.println(temp);
	}
	
}
