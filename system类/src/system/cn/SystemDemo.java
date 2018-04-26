package system.cn;
/*
 * system类的方法 都是静态方法，可以直接用类名直接调用
 * 常用的方法：
 * static long	currentTimeMillis() 
          返回以毫秒为单位的当前时间。
static void	exit(int status) 
          终止当前正在运行的 Java 虚拟机。
static void	gc() 
          运行垃圾回收器。
 static Properties	getProperties() 
          确定当前的系统属性。
static String	getProperty(String key) 
          获取指定键指示的系统属性。
static String	getProperty(String key, String def) 
          获取用指定键描述的系统属性。
 */
public class SystemDemo {
	public static void main(String[] args) {
		//接收当前时间
		long starttime = System.currentTimeMillis();
		int sum = 0;
		for (int i = 0; i <10000000; i++) {
			sum = sum+i;
		}
		//接收结束时间
		long endtime = System.currentTimeMillis();
		//获取总共耗时
		long totaltime = endtime-starttime;
		System.out.println("总共耗时："+totaltime);
	}

}
