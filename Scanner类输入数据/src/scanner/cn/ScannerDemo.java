package scanner.cn;

import java.util.Scanner;
/*
 * Scanner类 输入数据
 * 
 */
public class ScannerDemo {
 public static void main(String[] args) {
	//new 一个scanner 对象，从键盘接收对象
	 Scanner s = new Scanner(System.in);
	 System.out.println("请输入数据：");
	 String str = s.next();
	 System.out.println("输入的内容为："+str);
	 
}
}
