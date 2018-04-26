package jvm.cn;
/*
 * runtime类可以取得一些系统的信息
 * static Runtime	getRuntime() 
          返回与当前 Java 应用程序相关的运行时对象。
          long	maxMemory() 
          返回 Java 虚拟机试图使用的最大内存量。
           long	freeMemory() 
          返回 Java 虚拟机中的空闲内存量。
 */
public class RunTimeDemo {
	public static void main(String[] args) {
		//静态方法为其进行实例化
		Runtime rt = Runtime.getRuntime();
		//得到jvm的最大内存量
		System.out.println("jvm的最大内存量"+rt.maxMemory());
		//得到jvm的空闲内存量
		System.out.println("jvm的空闲内存量"+rt.freeMemory());
		//设计一个方法，频繁的消耗垃圾内存
		String str = "hello"+"world";
	    for (int i = 0; i < 100000; i++) {
			str= str+i;
		}
	    System.out.println("执行string后的内存空闲量"+rt.freeMemory());
	    //释放垃圾内存
	    rt.gc();  
	    System.out.println("释放垃圾后的内存空闲量"+rt.freeMemory());
	}

}
