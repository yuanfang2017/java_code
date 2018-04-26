package itcast;
/*
 * 异常类的继承构造
 * 在Java的异常结构中，有两种常用的类，分别为exception 和 error  ，这两个类全部都是thowable 的子类
 * exception：程序的异常，可以用try catch 处理
 * error：  一般是jvm 虚拟机的 问题
 */
public class YiChangClass {
 public static void main(String[] args) {
	 int i = 10;
		int j = 0;
		try {int temp =i/j;}  catch(ArithmeticException e){
			e.printStackTrace();  //printStackTrace() 是exception的方法，输出的异常信息最完整，以后会经常用到
		}
		finally{
			System.out.println("不管有没有异常，都要执行 finally");
		}
	    System.out.println("捕获异常成功！");
		
	}
}

