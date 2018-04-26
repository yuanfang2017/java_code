package objectOutputStream.cn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/*
 * 类 ObjectOutputStream:对象输出流
 * 构造方法：
 *  ObjectOutputStream(OutputStream out) 
          创建写入指定 OutputStream 的 ObjectOutputStream。
 */
public class ObjectOutputStreamDemo2 {
	public static void main(String[] args) throws Exception {
		File f = new File("d:"+File.separator+"e.txt");
		OutputStream out = new FileOutputStream(f);
		 ObjectOutputStream otp = new ObjectOutputStream(out);
		 //void	writeObject(Object obj)   将指定的对象写入 ObjectOutputStream。
		 otp.writeObject(new Person("张三",30));
         otp.close();
	}

}
