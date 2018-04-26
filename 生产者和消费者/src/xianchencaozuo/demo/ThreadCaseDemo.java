package xianchencaozuo.demo;
/*
 * 生产者和消费者案例
 * 问题1：由于多线程的原因，消费者在加入消息名称，还未加入消息内容，就切到了消费者线程，这样会将消息名称和上一个消息的内容
 * 加在一起
 * 为了解决这个问题，可以使用同步
 * 
 */
//信息类，设置信息名，信息内容，获得信息名，信息内容
class Info{
	private String infoname;
	private String infoconnet;
	public void setinfoname(String infoname){
		this.infoname = infoname;
	}
	public String getinfoname(){
		return infoname;
	}
	public void setinfoconnet(String infoconnet){
		this.infoconnet = infoconnet;
	}
	public String getinfoconnet(){
		return infoconnet;
	}
	
}
//生产者类实现runnable
class product implements Runnable{
	//设置一个标志位
	private boolean flag = false;
	//product构造方法为属相赋值
	private Info info = null;
	public product (Info info){
		this.info = info;
	}
	public void run(){
		for (int i = 0; i < 50; i++) {
			if (flag) {
				this.info.setinfoname("sophia ");
				//在名称 和内容之间加入延迟
				try{Thread.sleep(500);}
				 catch(Exception e){
					 System.out.println(e.getStackTrace());
					 }
				this.info.setinfoconnet("欢迎老师");
			      //修改标志位
				flag = false;
			}
			else {
				this.info.setinfoname("测试开发 ");
				//在名称 和内容之间加入延迟
				try{Thread.sleep(500);}
				 catch(Exception e){
					 System.out.println(e.getStackTrace());
					 }
				this.info.setinfoconnet("我要测试开发");
			      //修改标志位
				flag = true;
			}
		}
	}
}
//消费者类
class consumer implements Runnable{
	private Info info = null ;
	public consumer(Info info){
	this.info = info;
	}
	public void run(){
		for (int i = 0; i <50; i++) {
			//取信息名称 和信息内容，并加入延迟
			System.out.println(this.info.getinfoname());
			try{Thread.sleep(500);}
			 catch(Exception e){
				 System.out.println(e.getStackTrace());
				 }
			System.out.println(this.info.getinfoconnet());
		}
	}
}
//测试类
public class ThreadCaseDemo {
public static void main(String[] args) {
	Info in = new Info();
	product pd = new product(in);
	consumer cs = new consumer(in);
	new Thread(pd).start();
	new Thread(cs).start();
}
}
