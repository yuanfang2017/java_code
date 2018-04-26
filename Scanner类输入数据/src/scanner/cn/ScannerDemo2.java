package scanner.cn;

import java.util.Scanner;
/*
 * 修改输入数据的分隔符
 * scanner 类只能取出空格之前的内容，空格之后的内容就没有了，这是因为scanner将空格当做了一个分隔符，所以为了保证程序的正确性
 * 可以将分隔符号修改为/n回车
 */
public class ScannerDemo2 {
	 public static void main(String[] args) {
			//new 一个scanner 对象，从键盘接收对象
			 Scanner s = new Scanner(System.in);
			 //修改输入数据的分隔符
			 s.useDelimiter("\n");
			 System.out.println("请输入数据：");
			 String str = s.next();
			 System.out.println("输入的数据为："+str);			 
		}

}
