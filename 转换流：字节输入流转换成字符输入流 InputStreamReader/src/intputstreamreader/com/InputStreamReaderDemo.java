
 /*
 * 将字节输入流变成字符输入流     类 InputStreamReader
 * 构造方法：
 * InputStreamReader(InputStream in) 
          创建一个使用默认字符集的 InputStreamReader。
          常用方法：        
    方法摘要
 void	close() 
          关闭该流并释放与之关联的所有资源。
 String	getEncoding() 
          返回此流使用的字符编码的名称。
 int	read() 
          读取单个字符。
 int	read(char[] cbuf, int offset, int length) 
          将字符读入数组中的某一部分。
 boolean	ready() 
          判断此流是否已经准备好用于读取。
 *
 */


package intputstreamreader.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderDemo {
	public static void main(String[] args){
		//指定一个路径
		File f = new File("d:"+File.separator+"test.txt");
		try {
			
			
			//利用转换流，将字节输入流变成字符输入流，并用字符接收
		    Reader ipr = new InputStreamReader(new FileInputStream(f));
		    char [] ch = new char[(int) f.length()];
		    ipr.read(ch);
		    ipr.close();
		    for (int i = 0; i < ch.length; i++) {
		    	 System.out.print(ch[i]);
			}
		   
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
