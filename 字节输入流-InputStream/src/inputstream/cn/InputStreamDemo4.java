package inputstream.cn;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/*
 * 改进版 4
 * 使用read()通过循环读取
 * byte[] b = new byte[(int)f.length()];
			for (int i = 0; i < b.length; i++) {
				    b[i] = (byte)is.read();
			}
 */
public class InputStreamDemo4 {
		public static void main(String[] args) throws Exception {
			//使用file 找到一个文件
			File f = new File("d:"+File.separator+"test.txt");
			//通过子类实例化父类
			InputStream is =new FileInputStream(f);
			//开辟一个1024的字节数组，把所有的类容读到此数组中
			byte[] b = new byte[(int)f.length()];
			for (int i = 0; i < b.length; i++) {
				    b[i] = (byte)is.read();
			}
			//关闭输入流
			is.close();
			//打印读的数据,将byte类型转换为string类型输出
			System.out.println(new String(b));
			
		}
	}


