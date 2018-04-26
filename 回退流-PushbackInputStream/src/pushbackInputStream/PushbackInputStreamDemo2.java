package pushbackInputStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/*
 * 自己再写一次
 */
public class PushbackInputStreamDemo2 {
	public static void main(String[] args) throws Exception {
		//定义一个字符串
		String str = "hello.hai.heihei.laiba...";
		//定义一个内存输入流对象
		ByteArrayInputStream bai = new ByteArrayInputStream(str.getBytes());
		//定义一个回退流对象
		PushbackInputStream pbi = new PushbackInputStream(bai);
		System.out.println("读取的数据为：");
		int temp = 0;
		while ((temp = pbi.read())!=-1) {
		  if (temp =='.') {
			pbi.unread(temp);
			 temp = pbi.read();
			 System.out.print("(回退"+(char)temp+")");
		}
		  else {
			  System.out.print((char)temp);
		}
			
		}
		
	}

}
