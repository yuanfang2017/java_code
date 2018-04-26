package runnabledemo2;
/*
 * 用runnable 实现资源共享，thread不能实现资源共享
 * ps:由于runnable可以实现资源共享，可以开启线程去处理同一资源，以后就尽量用实现runnable接口的形式去开启线程
 */
//写一个类实现runnable接口
class GongXiangDemo implements Runnable{
	private int tiket = 5;
	//重写 run()方法
	public void run(){
		//控制循环次数
		for (int i = 0; i <100; i++) {
			//判断循环条件
			if (tiket>0) {
				
				System.out.println("卖票" +"tiket="+tiket--);
			}
			
		}
	}
}

public class RunnableDemo2 {
	public static void main(String[] args) {
		//构造GongXiangDemo的实例化对象
		GongXiangDemo gx = new GongXiangDemo();
		//转换为thread 实例化对象
		//开启三个线程，用匿名对象
		new Thread(gx).start();
		new Thread(gx).start();
		new Thread(gx).start();
		
	}

}
