package piped.cn;

import java.io.IOException;
import java.io.PipedOutputStream;

//创建一个发送信息的线程
class Send implements Runnable{
	//输出管道流对象
	PipedOutputStream pos = null;
	//通过构造函数实例化 管道流输出对象
	public Send(){
		this.pos = new PipedOutputStream();
	}
  public void run(){
	  //定义一个字符串
	  String str = "hello wangyuanfang,hahahha";
	  try {
		  //write()接收的参数类型是byte，所以要转一下
		this.pos.write(str.getBytes());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  //关闭流
	  try {
		this.pos.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  //通过线程类得到输出流
	 
  }
  public PipedOutputStream getPost(){
		return this.pos; 
  }
}