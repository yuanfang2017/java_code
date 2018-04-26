package tingzhixianchen.cn;
/*
 * 停止线程
 * 虽然thread 类中有stop()方法，不建议使用，会产生死锁
 * 我们可以通过修改标志位来停止线程
 */
//新类实现runnable
class Demo implements Runnable{
	//设置一个标志位
	private boolean flag = true;
	public void run(){
		int i = 0;
		while (this.flag) {
			while (true) {
				System.out.println(Thread.currentThread().getName()+"i="+(i++));
			}	
			
		}
		
	}
	//写一个停止线程的方法
	public void stop(){
		//修改标志位
		this.flag = false;
	}
}
public class TingZhiDemo {
	public static void main(String[] args) {
		Demo d =new Demo();
		Thread t = new Thread(d,"aaa");
		t.start();
		d.stop();
		
	}

}
