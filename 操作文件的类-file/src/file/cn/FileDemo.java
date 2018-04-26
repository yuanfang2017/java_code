package file.cn;

import java.io.File;
import java.io.IOException;

/*
 * file ：是文件操作类
 * 构造方法：
 * File(String pathname) 
          通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
          比较常用的方法：
      boolean	createNewFile() 
          当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件。
 */
public class FileDemo {
  public static void main(String[] args) throws IOException {
	//需求：在d盘建立一个文件夹
	  //创建file 对象
	  File f = new File("d://test.txt");
	  //创建一个文件
	  f.createNewFile();
	  //打印操作系统的分隔符
	  System.out.println("表示路径的分隔符："+File.pathSeparator);
	  System.out.println("表示路径的分隔符："+File.separator);
	  
}

}
