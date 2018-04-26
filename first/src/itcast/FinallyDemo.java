package itcast;
/*
 * 写一个finally 语句
 */
public class FinallyDemo {
	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		try {int temp =i/j;}  catch(ArithmeticException e){
			System.out.println("erro!"+e);
		}
		finally{
			System.out.println("不管有没有异常，都要执行 finally");
		}
	    System.out.println("捕获异常成功！");
		
	}

}
