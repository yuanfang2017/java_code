package piped.cn;

import java.io.IOException;

/*
 * 管道流：可以进行两个线程之间的通信
 * 管道输出流：PipedOutputStream
 * 管道输入流  类 PipedInputStream
 * 要实现管道输出，则必须将输出流连接在输入流上
 * 
 */
/*   管道输出流：PipedOutputStream
 * 构造方法：
 * PipedOutputStream() 
          创建尚未连接到管道输入流的管道输出流。
         主要 方法:
          void	close() 
          关闭此管道输出流并释放与此流有关的所有系统资源。
 void	connect(PipedInputStream snk) 
          将此管道输出流连接到接收者。
 void	flush() 
          刷新此输出流并强制写出所有缓冲的输出字节。
 void	write(byte[] b, int off, int len) 
          将 len 字节从初始偏移量为 off 的指定 byte 数组写入该管道输出流。
 void	write(int b) 
          将指定 byte 写入传送的输出流。
          
 * 
 */
/*   管道输入流  类 PipedInputStream
 * 构造方法：
 * PipedInputStream() 
          创建尚未连接的 PipedInputStream。
          主要的方法：
           int	available() 
          返回可以不受阻塞地从此输入流中读取的字节数。
 void	close() 
          关闭此管道输入流并释放与该流相关的所有系统资源。
 void	connect(PipedOutputStream src) 
          使此管道输入流连接到管道输出流 src。
 int	read() 
          读取此管道输入流中的下一个数据字节。
 int	read(byte[] b, int off, int len) 
          将最多 len 个数据字节从此管道输入流读入 byte 数组。
protected  void	receive(int b) 
          接收数据字节。
 * 
 */


public class PipedDemo {
	public static void main(String[] args) {
		//创建 send receive 对象
		Send s = new Send();
		Receive  r = new Receive ();
		//使用 PipedOutputStream 中的 void	connect(PipedInputStream snk) 方法连接
		try {
			s.getPost().connect(r.gitPis());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//开启线程
		new Thread(s).start();
		new Thread(r).start();
	}

}
