package dataoutputstream.cn;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 两个与平台无关的数据操作流，分别为数据输出流dataoutputstream，和数据输入流 datainputstream 通常数据
 * 输出流会按照一定的格式将数据输出，在通过数据输入流按照一定的格式将数据读入，这样就可以方便的对数据进行处理
 * 
  构造方法：
  DataOutputStream(OutputStream out) 
          创建一个新的数据输出流，将数据写入指定基础输出流。
 * 
 */
public class DataOutputStreamDemo {
public static void main(String[] args) throws Exception {
	//指定路径
	File f =new File("d:"+File.separator+"test3.txt");
	//new 一个数据输出对象
	DataOutputStream ds = null;
	try {
		 ds = new DataOutputStream(new FileOutputStream(f));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//定义几个数据
	String [] name = {"毛衣","衬衣","短裤"};
	float [] price = {68.99f,34.55f,23.00f};
	int [] nums = {3,2,1};
    for (int i = 0; i < name.length; i++) {
		ds.writeChars(name[i]);
		ds.writeChar('\t');
		ds.writeFloat(price[i]);
		ds.writeChar('\t');
		ds.writeInt(nums[i]);
		ds.writeChar('\n');	
	}
    //关闭数据输入流
     ds.close();
	
	
}
}
