package file.cn;

import java.io.File;

/*
 * file 的删除操作
 *  boolean	delete() 
          删除此抽象路径名表示的文件或目录。
 */
public class FileDemo2 {
	public static void main(String[] args) {
		//给出删除路径，最好用这种格式
		File f = new File("d:"+File.separator+"test.txt");
		//判断文件是否存在，如果存在再删除
	   if (f.exists()) {
		   boolean flag = f.exists();
		   System.out.println(flag);
		 f.delete();
	}
	}

}
