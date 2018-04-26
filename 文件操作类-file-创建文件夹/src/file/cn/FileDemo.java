package file.cn;

import java.io.File;

/*
 * File 不仅可以创建文件，还可以创建文件夹
 * 使用方法：
 *  boolean	mkdir() 
          创建此抽象路径名指定的目录。
  
 */
public class FileDemo {
	public static void main(String[] args) {
		//给出路径
		File f = new File("d:"+File.separator+"ceshi");
		//创建文件夹目录
		f.mkdir();
	}
	

}
