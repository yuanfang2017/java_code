package tongbu.cn;
/*
 * 多个线程同时操作同一资源，会引起卖出的票为负数，为了解决这个问题，就要使用同步
 * 所谓同步，就是多个操作在同一时间段内 只能有一个线程进行
 * 同步代码块的格式
 * synchronized(同步对象){
 * 需要同步的代码
 * }
 */
//一个类实现runnable 
class TongBuDaiMa implements Runnable{
	private int tiket = 5;
	public void run(){
		for (int i = 0; i < 100; i++) {
			//判断票数是否大于0 ，大于0的话就卖票
			//同步代码块
			synchronized (this) {
			
			if (tiket>0) {
				//设置线程之间延迟
				try{Thread.sleep(50);}
				catch(Exception e){}
				System.out.println("tiket = "+ tiket--);
			}
		}
	}
}
}
public class TongBu {
	public static void main(String[] args) {
		TongBuDaiMa tb = new TongBuDaiMa();
		Thread tbd1 = new Thread(tb);
		Thread tbd2 = new Thread(tb);
		Thread tbd3 = new Thread(tb);
		tbd1.start();
		tbd2.start();
		tbd3.start();
	}

}
