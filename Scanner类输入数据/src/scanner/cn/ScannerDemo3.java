package scanner.cn;

import java.util.Scanner;

/*
 * 如果要输入int float 类型的数据，在scanner 类中也是支持的，但是在输入之前最好先使用hasnex方法进行判断
 */
public class ScannerDemo3 {
	public static void main(String[] args) {
		//从键盘接收数据
		Scanner s = new Scanner(System.in);
		int i = 0;
		float f = 0f;
		System.out.println("请输入整数：");
		if (s.hasNextInt()) {
			i = s.nextInt();
			System.out.println("输入的整数位："+i);
		}
		else {
			System.out.println("输入的不是整数！！");
		}
	   System.out.println("请输入小数：");
		if (s.hasNextFloat()) {
			f = s.nextFloat();
			System.out.println("输入的小位："+f);
		}
		else {
			System.out.println("输入的不是小数！！");
		}
	}

}
