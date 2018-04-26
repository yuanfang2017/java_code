package scanner.cn;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * 实例操作 3： 从文件中得到 数据
 */
public class ScannerDemo4 {
	public static void main(String[] args) {
		//指定文件
		File f = new File("d:"+File.separator+"test.txt");
		  Scanner sc = null;
	     try {
	    	 //以文件作为输入对象
		   sc = new Scanner(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     //由于文件里面的数据是可以变动的，所以最好用stringbuffer 接收
	     StringBuffer sb = new StringBuffer();
	     while (sc.hasNext()) {			
	    	 sb.append(sc.next());
		}
		   System.out.println(sb);
	}

}
