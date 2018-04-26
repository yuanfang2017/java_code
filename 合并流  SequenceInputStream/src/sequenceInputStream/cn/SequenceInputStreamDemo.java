package sequenceInputStream.cn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;

/*
 * 合并流：主要功能是将两个文件的内容合并在一个文件里面
 * 构造方法：
 * SequenceInputStream(InputStream s1, InputStream s2)
 */
public class SequenceInputStreamDemo {
	public static void main(String[] args) throws Exception {
		File f1 = new File("d:"+File.separator+"a.txt");
		File f2 = new File("d:"+File.separator+"b.txt");
		//指定一个合并文件
		File f3 = new File("d:"+File.separator+"ab.txt");
		InputStream s1 = null;
		InputStream s2 = null;
		OutputStream s3 = null;
		try {
			 s1 = new FileInputStream(f1);
			 s2 = new FileInputStream(f2);
			 s3 = new FileOutputStream(f3);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SequenceInputStream si = new SequenceInputStream(s1,s2);
		int temp = 0 ;
		try {
			while ((temp = si.read())!=-1) {
			 s3.write(temp);			
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			s1.close();
			s2.close();
			s3.close();
			s1.close();		
	}

}
