package timetask.demo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
 * time类 是一个线程实施，可以用来实现在某一个时间或者某一个时间段后安排某一个任务执行一次或者定期重复执行
 * timetask 是 timer对象安排的一次或者重复执行的某一个任务
 * 所以两者要配合使用
 * Timetask类是有一个抽象类，如果要使用该类，需要自己建立一个类来继承此类，来实现其中的抽象方法
 * time 的主要方法
 *  void	cancel() 
          终止此计时器，丢弃所有当前已安排的任务。
 int	purge() 
          从此计时器的任务队列中移除所有已取消的任务。
 void	schedule(TimerTask task, Date time) 
          安排在指定的时间执行指定的任务。
 void	schedule(TimerTask task, Date firstTime, long period) 
          安排指定的任务在指定的时间开始进行重复的固定延迟执行。
 void	schedule(TimerTask task, long delay) 
          安排在指定延迟后执行指定的任务。
 void	schedule(TimerTask task, long delay, long period) 
          安排指定的任务从指定的延迟后开始进行重复的固定延迟执行。
 void	scheduleAtFixedRate(TimerTask task, Date firstTime, long period) 
          安排指定的任务在指定的时间开始进行重复的固定速率执行。
 void	scheduleAtFixedRate(TimerTask task, long delay, long period) 
          安排指定的任务在指定的延迟后开始进行重复的固定速率执行。  
  timetask
          public abstract class TimerTask
          方法：
    boolean	cancel() 
          取消此计时器任务。
    abstract  void	run() 
          此计时器任务要执行的操作。
    long	scheduledExecutionTime() 
          返回此任务最近实际 执行的已安排 执行时间
     
 */
/*
 * 需求：定时的打印系统的当前时间
 */
//创建一个类继承timetask
class MyTask extends TimerTask{
	//复写run()方法
	public void run(){
		//创建一个时间格式化的对象
		SimpleDateFormat sd = new SimpleDateFormat("yyy-MM-dd HH:mm:ss:SSS");
		//打印系统时间
		System.out.println(sd.format(new Date()));
		
	}
}
public class TimeDemo {
	public static void main(String[] args) {
		//创建 timer对象
		Timer t = new Timer();
		//创建timertask对象
		MyTask mt = new MyTask();
		//用timer的这个方法   void	schedule(TimerTask task, long delay, long period) 
        t.schedule(mt, 1000,2000);				
	}

}
