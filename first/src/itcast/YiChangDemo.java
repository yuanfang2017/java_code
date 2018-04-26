package itcast;
/*
 * 写一个处理异常的demo  
 * try{
 *   有可能出现异常的语句
 * } catch(异常类  异常对象){
 *     编写异常的处理语句
 *   }
 *   catch(异常类  异常对象){
 *     编写异常的处理语句
 *   }
 *     ....  catch可以有很多个
 *   1、 如果 try中产生异常，则执行catch中的语句-finally中的语句-其他语句
 *   2、如果try中没有产生异常，则执行finally中的语句-其他语句
 *   ArithmeticException
 *     算数异常
 *   
 */

public class YiChangDemo {
	public static void main(String[] args) {
		int i=10;
		int j= 0;
		try{
			int temp = i/j;} catch(ArithmeticException e){
				System.out.println("erro!"+e);
			}
		  
		System.out.println("捕获异常成功！");
		
	}
}
