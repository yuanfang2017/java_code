package file.cn;

import java.io.File;

/*
 *    String[]	list() 
          返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中的文件和目录。
     File[]	listFiles() 
          返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件。
 */
public class FileDemo2 {
	public static void main(String[] args) {
		File f = new File("d:"+File.separator);
		//遍历指定路径下的目录
		String[] s = f.list();
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		//遍历指定路径下的目录+路径
        File[] fi = f.listFiles();
        for (int i = 0; i < fi.length; i++) {
			System.out.println(fi[i]);
		}
  
	}

}
