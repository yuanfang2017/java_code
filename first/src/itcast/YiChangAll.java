package itcast;
/*
 * exception捕获全部异常
 * 注意：捕获小的异常必须放在捕获大的异常的前面
 * 程序如果有多个异常 最好是分开捕获，而不建议用exception捕获全部异常
 */
public class YiChangAll {
	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		try {int temp =i/j;}  catch(Exception e){
			System.out.println("捕获全部异常"+e);
		}
		finally{
			System.out.println("不管有没有异常，都要执行 finally");
		}
	    System.out.println("捕获异常成功！");
		
	}
	}


