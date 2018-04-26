package bufferedreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * java.io 类 BufferedReader :用于从缓冲区中读取内容，所有的输入字节数据都讲
 * 构造方法：
 * BufferedReader(Reader in) 
          创建一个使用默认大小输入缓冲区的缓冲字符输入流。
     int	read() 
          读取单个字符。
    int	  read(char[] cbuf, int off, int len) 
          将字符读入数组的某一部分。
    String	readLine() 
          读取一个文本行。
 */
public class BufferedReaderDemo {
	public static void main(String[] args) {
		//声明一个BufferedReader的对象
		//BufferedReader只接受字符输入流，而system.in 是 字节输入流，所有要通过流的转换 InputStreamReader转换
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//接受输入的内容
		String str = null;
		System.out.println("请输入内容：");
		//读取输入的内容
		try {
			str = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//输出str
		System.out.println(str);	
	}

}
