package tongbufangfa.cn;
/*
 * 同步方法 解决同步问题
 * 同步方法：使用synchronized 关键字将一个方法申明为 同步方法
 * 格式为：
 * synchronized 方法返回值   方法名称 （参数列表）{
 * }
 */
//一个类实现runnable 
class TongBu implements Runnable{
	private int tiket = 5;
	public void run(){
		for (int i = 0; i < 100; i++) {	
			//调用同步方法
			this.sale();
		}
	}
	        //使用同步方法
	      public synchronized void sale(){
				//判断票数是否大于0 ，大于0的话就卖票
				if (tiket>0) {
				//设置线程之间延迟
				try{Thread.sleep(50);}
				catch(Exception e){}
				System.out.println("tiket = "+ tiket--);
			}
		}	
}
public class TongBuFangFa {
	public static void main(String[] args) {
		TongBu tb = new TongBu();
		Thread tbd1 = new Thread(tb);
		Thread tbd2 = new Thread(tb);
		Thread tbd3 = new Thread(tb);
		tbd1.start();
		tbd2.start();
		tbd3.start();
	}
	

}
