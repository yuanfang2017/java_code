package file.cn;
/*
 * 练习一个实例
 * 给定一个文件路径，如果文件已存在则删除，如果这个文件不存在，则创建一个新的
 */

import java.io.File;
import java.io.IOException;
import java.util.MissingFormatArgumentException;

public class FileDemo3 {
	public static void main(String[] args) throws IOException {
		//给定一个路径
		File f = new File("d:"+File.separator+"test.txt");
		if (f.exists()) {
			f.delete();
		}
		else {
			f.createNewFile();
		}
	}

}
