package inputstream.cn;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/*
 * 第五种读取方式：文件读到末尾了，会返回-1
 * 得到len的值，还给b数组赋值
 * 	int temp;
		int len = 0;
		while ((temp = is.read())!=-1) {
			b[len] = (byte)temp;
			len++;
		}
 * 
 */
public class InputStreamDemo5 {
	public static void main(String[] args) throws Exception {
		//使用file 找到一个文件
		File f = new File("d:"+File.separator+"test.txt");
		//通过子类实例化父类
		InputStream is =new FileInputStream(f);
		//开辟一个1024的字节数组，把所有的类容读到此数组中
		byte[] b = new byte[1024];
		int temp;
		int len = 0;
		while ((temp = is.read())!=-1) {
			b[len] = (byte)temp;
			len++;
		}
		//关闭输入流
		is.close();
		//打印读的数据,将byte类型转换为string类型输出
		System.out.println(new String(b,0,len));
		
	}
}
