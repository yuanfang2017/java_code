package xiancheng.interrup;
/*
 * 当一个线程运行时，另外一个线程可以将其中断
 * Thread void	interrupt()  中断线程。
 */
class XianChenInterrupt implements Runnable{
	public void run(){
		System.out.println("开始启动了！");
		try{
		Thread.sleep(10000);
		System.out.println("线程休眠结束了！");
		}catch(Exception e){
		 System.out.println("线程被中断了！");
		}
	}
}
public class InterruptDemo {
public static void main(String[] args) {
	XianChenInterrupt xci =new XianChenInterrupt();
	Thread t = new Thread(xci);
	t.start();
	//主线程也来休眠一下
	try {Thread.sleep(500);}
	  catch(Exception e){
		  System.out.println(e);
	  }
	//mian主线程休眠500毫秒之后中断子线程
	t.interrupted();
			}
}
