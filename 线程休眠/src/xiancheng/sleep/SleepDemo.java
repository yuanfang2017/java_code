package xiancheng.sleep;
/*
 * 线程休眠 demo
 * static void	sleep(long millis)   在指定的毫秒数内让当前正在执行的线程休眠（暂停执行）
 *                                   此操作受到系统计时器和调度程序精度和准确性的影响
 */
class XianChenSleep implements Runnable{
	//重写 run()
	public void run(){
		try{
		  Thread.sleep(5000);
		}catch(Exception e){
			System.out.println(e);
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+i);
		}
	}
}
public class SleepDemo {
 public static void main(String[] args) {
	 XianChenSleep xc = new XianChenSleep();
	 new Thread(xc,"线程").start();
	    
	 
}
}
