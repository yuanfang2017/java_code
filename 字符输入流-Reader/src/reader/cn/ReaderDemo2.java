package reader.cn;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

/*
 * 改进2 使用循环的方式读取内容
 */
public class ReaderDemo2 {
	public static void main(String[] args) throws Exception {
		//利用file 指定路径
		File f = new File("d:"+File.separator+"test.txt");
		//通过子类实例化父类对象
		Reader r = new FileReader(f);
		//开辟一个字符空间
		char[] ch = new char[(int)f.length()];
		int temp;
		int len = 0;
		while ((temp = r.read())!=-1) {
			 ch[len] = (char)temp;
			 len++;		
		}
		
		System.out.println(new String (ch));
		
	}

}
