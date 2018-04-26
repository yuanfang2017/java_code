package getname;

import java.util.MissingFormatArgumentException;

/*
 * 写一个demo 设置线程名称和获得当前线程的名称
 * thread 的方法：
 *  String	getName() 返回该线程的名称。
 *  static Thread	currentThread()  返回对当前正在执行的线程对象
             
 */
//写一个类去实现 runnable接口
class RunnableDemo implements Runnable {
	public void run(){
		//返回当前线程&获得名称
		//static Thread	currentThread()  返回对当前正在执行的线程对象  ，静态方法直接用类名直接调用
		System.out.println(Thread.currentThread().getName());
		}
	}

public class GetThreadName {
 public static void main(String[] args) {
	//RunnableDemo 的实例
	 RunnableDemo rl = new RunnableDemo();
	 //2、Thread(Runnable target, String name)  分配新的 Thread 对象。
	 new Thread(rl,"线程A").start();
	 new Thread(rl,"线程B").start();
	 //自动分配线程名
	 new Thread(rl).start();
	 new Thread(rl).start();
	 new Thread(rl).start();
	 
}
 
}
