package inputstream.cn;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/*
 * 改进版2
 * //读取数据,read()方法返回的是 int 类型，返回值是读取的数据的长度
		int len = is.read(b);
	//打印读的数据,将byte类型转换为string类型输出
		System.out.println("读入的数据的长度:"+len);
		System.out.println(new String(b,0,len));
		
 * 
 */
public class InputStreamDemo2 {
	public static void main(String[] args) throws Exception {
		//使用file 找到一个文件
		File f = new File("d:"+File.separator+"test.txt");
		//通过子类实例化父类
		InputStream is =new FileInputStream(f);
		//开辟一个1024的字节数组，把所有的类容读到此数组中
		byte[] b = new byte[1024];
		//读取数据,read()方法返回的是 int 类型，返回值是读取的数据的长度
		int len = is.read(b);
		//关闭输入流
		is.close();
		//打印读的数据,将byte类型转换为string类型输出
		System.out.println("读入的数据的长度:"+len);
		System.out.println(new String(b,0,len));

}
}
