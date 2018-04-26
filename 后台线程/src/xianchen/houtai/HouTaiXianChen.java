package xianchen.houtai;

/*
 * 后台线程，用这个方法：
 * setDaemon
public final void setDaemon(boolean on)
 */
//要想设置为后台线程，可以把run()方法设置为 死循环
//定义一个类，实现runnable
class HouTaiXianChenDemo implements Runnable{
	//重写 run方法
	public void run(){
		//写一个死循环
		while (true) {
			System.out.println(Thread.currentThread().getName()+"在运行");
			
		}
	}
}
public class HouTaiXianChen{
public static void main(String[] args) {
	HouTaiXianChenDemo ht = new HouTaiXianChenDemo();
	Thread t = new Thread(ht);
	//设置线程在后台运行
	t.setDaemon(true);
	//启动线程
    t.start();	
}

}
