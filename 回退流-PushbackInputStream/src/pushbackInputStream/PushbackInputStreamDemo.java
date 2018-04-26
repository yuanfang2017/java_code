package pushbackInputStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

/*
 * 回退输入流 ：类 PushbackInputStream
 * 
 * 构造方法：
 * PushbackInputStream(InputStream in) 
          创建 PushbackInputStream 并保存其参数（即输入流 in），以供将来使用。
 */
public class PushbackInputStreamDemo {
	public static void main(String[] args) throws Exception {
		//定义一个字符串
		String str = "hello.world.hah.heihei";
		//定义一个内存输入流
		ByteArrayInputStream ba  = new ByteArrayInputStream(str.getBytes());
		//定义一个回退流对象
		PushbackInputStream pd = null;
		pd = new PushbackInputStream(ba);
		System.out.println("读取之后的数据为：");
		int temp = 0;
		while ((temp =pd.read())!=-1){
			if (temp == '.') {
			   pd.unread(temp);
			   temp = pd.read();
			   System.out.print("(退回"+(char)temp+")");
			
			}
			   else {
					System.out.print((char)temp);
				}
		}
		
				
	}
}
