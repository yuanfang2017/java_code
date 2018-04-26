package externalizable.cn;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
public class ExternalizableDemo {
	public static void main(String[] args) throws Throwable {
		ser();
		dser();	
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
