package itcast;

import javax.sound.midi.SysexMessage;

/*
 * 写一个throws demo
 * throws 是写在方法体的后面，交给被调用处 解决
 */
//写一个类 ，封装一个除法的方法
class math{
	public int chufa(int i,int j) throws Exception{  //抛异常
		int temp = i/j;
		return temp;			
	}
}
public class ThrowsDemo {
	public static void main(String[] args) {
		//实例化对象
		math m = new math();
		
		try{  System.out.println("捕获异常成功！"+m.chufa(10, 2));} catch(Exception e){
			e.printStackTrace();
		}
		   
	}
}
