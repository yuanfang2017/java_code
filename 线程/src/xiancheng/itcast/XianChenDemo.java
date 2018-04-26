package xiancheng.itcast;
/*
 * 线程的第一种实现方式 ：继承thread 类，并重写 run()方法，注意：run()方法必须重写
 * 开始线程 用 start()方法 
 * 问：开启线程 为什么要用  start()方法 ，而不用run()方法
 * 答： 线程的运行需要本机操作系统的支持
 */

//写一个类继承thread 类
class MyThread extends Thread{
	//构造方法为属性赋值
	private String name;
	public MyThread(String name){
		this.name = name;
	}
	//重写 run()方法
	public void run(){
		for (int i = 0; i < 10; i++) {
			System.out.println(name+"运行"+"i="+i);
		}
	}
	
}
public class XianChenDemo {
	public static void main(String[] args) {
		MyThread my1 = new MyThread("线程A");
		MyThread my2 = new MyThread("线程B");
		my1.start();
		my2.start();
	}

}
