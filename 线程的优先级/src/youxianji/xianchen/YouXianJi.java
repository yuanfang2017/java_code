package youxianji.xianchen;

import java.util.MissingFormatArgumentException;

/*
 * 设置线程的优先级
 * setPriority
public final void setPriority(int newPriority)  
参数：
newPriority - 要为线程设定的优先级

Java中 三种 优先级
  static int	MAX_PRIORITY 
          线程可以具有的最高优先级。
  static int	MIN_PRIORITY 
          线程可以具有的最低优先级。
  static int	NORM_PRIORITY 
          分配给线程的默认优先级。
 */
//写一个类去实现runnable
class YouXianJiDemo implements Runnable{
	//重写 run 方法
	public void run(){
		//循环 5次
		for (int i = 0; i <5; i++) {
			try {Thread.sleep(500);}
			catch(Exception e){
				System.out.println(e);
			}
			//获取当前线程
			System.out.println(Thread.currentThread().getName()+"运行"+i);
			
		}
		
	}
}
public class YouXianJi {
	public static void main(String[] args) {
		//YouXianJiDemo yx =new YouXianJiDemo();
		//Thread t1 =new Thread(yx,"线程a");
		Thread t1 = new Thread(new YouXianJiDemo(),"线程a");
		Thread t2 = new Thread(new YouXianJiDemo(),"线程b");
		Thread t3 = new Thread(new YouXianJiDemo(),"线程c");
		t1.setPriority(Thread.NORM_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		//启动线程
		t1.start();
		t2.start();
		t3.start();
		
	}

}
