package itcast;
/*
 * 自定义异常
 * throw :可以直接使用throw 人为的抛出一个异常，抛出时直接抛出异常类的实例化对象 即可，一般不建议单独使用throw
 * throws ：方法的申明处使用，一般教给被调用的地方处理异常
 */
//自定义一个异常类继承 exception
class myexception extends Exception{
	//构造方法接受异常信息
	public myexception(String msg){
		super(msg);
	}
}
public class DefaultDemo {
public static void main(String[] args) {
	try{
		throw new myexception("自定义异常");
	} catch(Exception e){
	  System.out.println(e);
	}
}
}


//    记得写请假条 