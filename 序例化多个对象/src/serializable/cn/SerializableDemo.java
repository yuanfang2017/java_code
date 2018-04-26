package serializable.cn;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
public class SerializableDemo {
public static void main(String[] args) throws Throwable {
	//new 多个对象出来
 	 Person [] per = {new Person("张三",30),new Person("李四",40),new Person("王五",50)};
 	 //ser()接收的是数组类型的参数
 	 ser(per);
 	 //dser()返回的是一个数组
 	Object[] ct = dser();
 	//遍历数组
 	for (int i = 0; i < ct.length; i++) {
		//  方法 1：System.out.println(ct[i]);
 		//方法2 ：将数组内容 转换为person对象
 		Person p = (Person)ct[i];
 		System.out.println(p);	
	}	
}
//序例化类，传一个object类型的数组参数
	public static void ser(Object[] obj) throws Throwable{
		File f = new File("d:"+File.separator+"e.txt");
		OutputStream out = new FileOutputStream(f);
		 ObjectOutputStream otp = new ObjectOutputStream(out);
		 //void	writeObject(Object obj)   将指定的对象写入 ObjectOutputStream。
		 otp.writeObject(obj);		 
         otp.close();
	}	
	//反序例化类,返回一个object 数组
	  public static Object[] dser() throws Throwable{
	   File f = new File("d:"+File.separator+"e.txt");
	   InputStream ip = new FileInputStream(f);
	   //new 一个对象输入流
	   ObjectInputStream oji = new ObjectInputStream(ip);
      Object[] jec = ( Object[])oji.readObject();
        oji.close();
        return jec;     
	  }
}
