package piped.cn;

import java.io.IOException;
import java.io.PipedInputStream;

class Receive implements Runnable {
	//通过构造函数实例化 管道流输入对象
	PipedInputStream pis = null;
	//通过构造方法 实例化对象
	public Receive(){
	  pis = new PipedInputStream();
	}
	public void run(){
		//开辟一个存储空间
		byte[] by = new byte[1024];
		int len = 0 ;
	  try {
		len =  pis.read(by);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		try {
			pis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("输出的内容为："+new String(by,0,len));
		
	}
	//创建获得线程接收类
	public PipedInputStream gitPis(){
		return this.pis;
	}

}
