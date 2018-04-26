package outputstreamwriter.cn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/*
 * 将字节输出流变成字符输出流  类 OutputStreamWriter
 * 构造方法
 * OutputStreamWriter(OutputStream out) 
          创建使用默认字符编码的 OutputStreamWriter。
          常用的方法：
  void	close() 
          关闭此流，但要先刷新它。
 void	flush() 
          刷新该流的缓冲。
 String	getEncoding() 
          返回此流使用的字符编码的名称。
 void	write(char[] cbuf, int off, int len) 
          写入字符数组的某一部分。
 void	write(int c) 
          写入单个字符。
 void	write(String str, int off, int len) 
          写入字符串的某一部分。
 * 
 */
public class OutputStreamWriterDemo {
 public static void main(String[] args) throws Exception{
	 //指定一个路径
	 File f = new File("d:"+File.separator+"test.txt");
	//利用转换流，将字节输出流变成字符输出流，并用字符接收
	Writer osw;
		osw = new  OutputStreamWriter(new FileOutputStream(f));
		osw.write("hello yuanfangwang");

		osw.close();

				
}
}
