package objectOutputStream.cn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.ObjectInputStream;

/*
 * ObjectInputStream  对象的输入流
 * 构造方法：
 * 	ObjectInputStream(InputStream in) 
          创建从指定 InputStream 读取的 ObjectInputStream。
          
 */
public class ObjectInputStreamDemo {
	public static void main(String[] args) throws Exception {
		File f = new File("d:"+File.separator+"e.txt");
		InputStream ip = new FileInputStream(f);
		//new 一个对象输入流
		ObjectInputStream oji = new ObjectInputStream(ip);
	   Object object =  oji.readObject();
	   oji.close();
	   System.out.println(object);
	}

}
