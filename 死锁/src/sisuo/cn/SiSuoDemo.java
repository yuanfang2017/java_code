package sisuo.cn;
/*
 * 多个线程操作同一个资源时，要用同步，确保资源操作的完整性，但是过多的同步，会造成死锁
 */
//写一个李四 的类
class LiSi {
	//写一个 say方法
	public void say(){
		System.out.println("张三把书给我，我就是给你画");
	}
	//写一个get方法 来得到张三的书
	public void get(){
		System.out.println("李四 得到书了！！");
	}
}
//写一个张三的类
class ZhangSan  {
	//写一个 say方法
	public void say(){
		System.out.println("李四把画给我，我就给你书");
	}
	//写一个get方法 来得到李四的画
	public void get(){
		System.out.println("张三得到画了");
	}
}
//定义多线程的类
class ThreadLock implements Runnable{
	//定义一个标记，用于判断哪个对象先执行
	private boolean flag = false;
	public void fun(){
		
	}
}
public class SiSuoDemo {

}
