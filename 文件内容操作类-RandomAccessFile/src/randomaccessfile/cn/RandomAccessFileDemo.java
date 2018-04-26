package randomaccessfile.cn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*类 RandomAccessFile
 * File 是对文件的操作，而 RandomAccessFile是对文件内容的操作
 * 此类的实例支持对随机访问文件的读取和写入
 * 常用的构造方法：
 * RandomAccessFile(File file, String mode) 
          创建从中读取和向其中写入（可选）的随机访问文件流，该文件由 File 参数指定。
          常用的方法：
           void	close() 
          关闭此随机访问文件流并释放与该流关联的所有系统资源。
           void	writeBytes(String s) 
          按字节序列将该字符串写入该文件。
           void	writeInt(int v) 
          按四个字节将 int 写入该文件，先写高字节。

 * 
 */
public class RandomAccessFileDemo {
  public static void main(String[] args) throws IOException {
	  //创建文件对象
	  File f = new File("d:"+File.separator+"test.txt");
	//创建文件访问流对象，并设置为可读写
	  RandomAccessFile ra = new RandomAccessFile(f,"rw");
	  //在文件中写入几个数据
	  ra.writeBytes("zhangsan");
	  ra.writeInt(20);
	  ra.writeBytes("lisi");
	  ra.writeInt(30);
	  ra.writeBytes("wangwu");
	  ra.writeInt(40);
	  //关闭流
	    ra.close();
	    
	  
	  
}

}
