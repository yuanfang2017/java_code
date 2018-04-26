
/*
 * 程序的运行结果为 name ： null ，age :30 
 * 这是因为用transient 修饰的属性，在被序例化的时候没有被保存下来，
 * 这样对象在反序例化的时候输出姓名时就是默认值 null
 */

package tran.cn;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class TransientDemo {
 public static void main(String[] args) {
	 try {
		ser();
		dser();
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
}
//序例化类
	public static void ser() throws Throwable{
		File f = new File("d:"+File.separator+"e.txt");
		OutputStream out = new FileOutputStream(f);
		 ObjectOutputStream otp = new ObjectOutputStream(out);
		 //void	writeObject(Object obj)   将指定的对象写入 ObjectOutputStream。
		 otp.writeObject(new Person("张三",30));
        otp.close();
	}	
	//反序例化类
	  public static void dser() throws Throwable{
	   File f = new File("d:"+File.separator+"e.txt");
	   InputStream ip = new FileInputStream(f);
	   //new 一个对象输入流
	   ObjectInputStream oji = new ObjectInputStream(ip);
      Object object = oji.readObject();
      oji.close();
      System.out.println(object);
	  }
}
