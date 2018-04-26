package write.cn;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
 * 字符 输出流 Writer
 * 抽象类
 * 主要的方法：
 * Writer	append(char c) 
          将指定字符添加到此 writer。
 Writer	append(CharSequence csq) 
          将指定字符序列添加到此 writer。
 Writer	append(CharSequence csq, int start, int end) 
          将指定字符序列的子序列添加到此 writer.Appendable。
abstract  void	close() 
          关闭此流，但要先刷新它。
abstract  void	flush() 
          刷新该流的缓冲。
 void	write(char[] cbuf) 
          写入字符数组。
abstract  void	write(char[] cbuf, int off, int len) 
          写入字符数组的某一部分。
 void	write(int c) 
          写入单个字符。
 void	write(String str) 
          写入字符串。
 void	write(String str, int off, int len) 
          写入字符串的某一部分。
 * 
 */
public class WriteDemo {
public static void main(String[] args) throws Exception {
	//使用File 类找到一个文件
	File f = new File("d:"+File.separator+"test.txt");
	//通过子类实例化父类对象
	Writer w = new FileWriter(f);
	//定义一个字符
	String str = "hello world !!";
	w.write(str);
	//关闭输出流
	w.close();
	/*
	 * 1、跟字节输出流差不多，唯一的好处是 不用将字符串变成byte【】后输出
	 * 2、字符输出流要使用close后 才能看到写入的数据，而字节流是不用的
	 */
}
}
