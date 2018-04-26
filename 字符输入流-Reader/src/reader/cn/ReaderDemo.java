package reader.cn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

/*
 * 字符输入流 Reader  抽象类
 * 主要的方法
 * abstract  void	close() 
          关闭该流并释放与之关联的所有资源。
 void	mark(int readAheadLimit) 
          标记流中的当前位置。
 boolean	markSupported() 
          判断此流是否支持 mark() 操作。
 int	read() 
          读取单个字符。
 int	read(char[] cbuf) 
          将字符读入数组。
abstract  int	read(char[] cbuf, int off, int len) 
          将字符读入数组的某一部分。
 int	read(CharBuffer target) 
          试图将字符读入指定的字符缓冲区。
 boolean	ready() 
          判断是否准备读取此流。
 void	reset() 
          重置该流。
 long	skip(long n) 
          跳过字符。
 * 
 * 
 */
public class ReaderDemo {
	public static void main(String[] args) throws Exception {
		//利用file 指定路径
		File f = new File("d:"+File.separator+"test.txt");
		//通过子类实例化父类对象
		Reader r = new FileReader(f);
		//开辟一个字符空间
		char[] ch = new char[1024];
		int len = r.read(ch);
		System.out.println(new String (ch,0,len));
		
	}

}
