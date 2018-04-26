package outputstream.cn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/*
 * 类 OutputStream
 * 字节的输出流   抽象类
 * 主要的方法：
 * void	close() 
          关闭此输出流并释放与此流有关的所有系统资源。
 void	flush() 
          刷新此输出流并强制写出所有缓冲的输出字节。
 void	write(byte[] b) 
          将 b.length 个字节从指定的 byte 数组写入此输出流。
 void	write(byte[] b, int off, int len) 
          将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流。
abstract  void	write(int b) 
          将指定的字节写入此输出流。
 */
public class OutputStreamDemo {
	public static void main(String[] args) throws Exception {
		//使用file 类找到一个文件
		File f = new File("d:"+File.separator+"test.txt");
		//由于OutputStream 是抽象类，所以通过子类实例化 父类对象
		OutputStream op = new FileOutputStream(f);
		//定义一个字符串
		String str = "hello world !!";
		//由于OutputStream的方法只接受byte【】类型，所以需要将string 类型转换为byte类型
		byte[] b = str.getBytes();
		op.write(b);
		//关闭输出流
		op.close();
		
	}

}
