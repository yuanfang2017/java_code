package inputstream.cn;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/*
 * 改进版3
 * //可以先判断文件的大小来开辟空间，避免造成浪费
		byte[] b = new byte[(int)f.length()];
 */
public class InputStreamDemo3 {
	public static void main(String[] args) throws Exception {
		//使用file 找到一个文件
		File f = new File("d:"+File.separator+"test.txt");
		//通过子类实例化父类
		InputStream is =new FileInputStream(f);
		//可以先判断文件的大小来开辟空间，避免造成浪费
		byte[] b = new byte[(int)f.length()];
		//读取数据
		is.read(b);
		//关闭输入流
		is.close();
		//打印读的数据,将byte类型转换为string类型输出
		System.out.println(new String(b));
		
	}

}
