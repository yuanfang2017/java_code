package inputstream.cn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/*
 * 类 InputStream
 * 字节输入流  ，抽象类
 * 主要的方法：
 *  int	available() 
          返回此输入流下一个方法调用可以不受阻塞地从此输入流读取（或跳过）的估计字节数。
 void	close() 
          关闭此输入流并释放与该流关联的所有系统资源。
 void	mark(int readlimit) 
          在此输入流中标记当前的位置。
 boolean	markSupported() 
          测试此输入流是否支持 mark 和 reset 方法。
abstract  int	read() 
          从输入流中读取数据的下一个字节。
 int	read(byte[] b) 
          从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。
 int	read(byte[] b, int off, int len) 
          将输入流中最多 len 个数据字节读入 byte 数组。
 void	reset() 
          将此流重新定位到最后一次对此输入流调用 mark 方法时的位置。
 long	skip(long n) 
          跳过和丢弃此输入流中数据的 n 个字节。
 */
public class InputStreamDemo {
	public static void main(String[] args) throws Exception {
		//使用file 找到一个文件
		File f = new File("d:"+File.separator+"test.txt");
		//通过子类实例化父类
		InputStream is =new FileInputStream(f);
		//开辟一个1024的字节数组，把所有的类容读到此数组中
		byte[] b = new byte[1024];
		//读取数据
		is.read(b);
		//关闭输入流
		is.close();
		//打印读的数据,将byte类型转换为string类型输出
		System.out.println(new String(b));
		
	}

}
