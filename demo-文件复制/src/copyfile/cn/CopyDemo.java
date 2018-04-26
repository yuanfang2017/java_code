package copyfile.cn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * 
 * 写一个demo 实现文件的复制
 * 如果源文件不存在，则提示文件不存在
 * 格式：copy 源文件 ，目标文件
 */
public class CopyDemo {
	public static void main(String[] args) throws Exception {
		//判断是否是两个参数
		if (args.length!=2) {
			System.out.println("输入的参数不正确");
			//系统退出
			System.exit(1);
		}
		//创建file 对象
		File f1 = new File(args[0]);
		File f2 = new File(args[1]);
		//判断源文件是否存在
		if (!f1.exists()) {
			System.out.println("该文件不存在");
			System.exit(1);
			
		}
		//创建输入，输出流
		OutputStream os = new FileOutputStream(f1);  //输出流对象，写入目标文件
		InputStream  ip  = new FileInputStream(f2);  //输入流对象，读取源文件
		//判断输入输出是否准备好
		if (os!=null&&ip!=null) {
			int temp ;
		  //开始复制
			while ((temp = ip.read())!=-1) {
				//边读边写
			     os.write(temp);
			     System.out.println("复制完成");
				
			}
		}
		//关闭输入输出流
		os.close();
		ip.close();
		
	}

}
