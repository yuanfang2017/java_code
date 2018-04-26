package code.cn;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/*
 * 获得系统的编码
 */
public class CodeDemo {
	public static void main(String[] args) throws Exception {
		System.out.println("系统的默认编码为："+System.getProperty("file.encoding"));
		//转换编码
		File f = new File("d:"+File.separator+"c.txt");
		OutputStream out  = new FileOutputStream(f);
		String str = "中国，你好！";
		//byte [] b = str.getBytes("ISO8859-1");
		byte [] b = str.getBytes("GBK");
		out.write(b); 
		out.close();
	}
}
