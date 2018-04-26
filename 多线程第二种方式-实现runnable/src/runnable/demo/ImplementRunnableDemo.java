package runnable.demo;
/*
 * 线程的第二种实现方式 - 实现 runnable 的接口\
 * 备注： start()方式是 thread 独有的，如果用runnable 实现的话 就不能用 start()方式开启线程
 * 解决方法：thread 类提供了两种构造方法 ,接收runnable子类的实例化对象
 * 1、   分配新的 Thread 对象。
 * 2、Thread(Runnable target, String name)      分配新的 Thread 对象。
  
 */
// 写一个类去实现 runnable接口
class RunnableDemo implements Runnable {
	//构造方法为属性赋值
	private String name;
	public RunnableDemo(String name){
		this.name = name;
	}
	//重写run()方法
	public void run(){
		for (int i = 0; i <10; i++) {
			System.out.println(name+"i="+i);
		}
	}
}
public class ImplementRunnableDemo {
  public static void main(String[] args) {
	// new 两个实例化对象出来
	  RunnableDemo  rd = new RunnableDemo("线程A");
	  RunnableDemo  rd2 = new RunnableDemo("线程A");
	  //通过 thread 构造方法 创造新的Thread 对象   Thread(Runnable target) 
	  Thread th1 =new Thread(rd);
	  Thread th2 = new Thread(rd2);
	  //因为 th1，th2 是thread类型的，所以可以调用start()方法
	  th1.start();
	  th2.start();
	 
	  
}
}
