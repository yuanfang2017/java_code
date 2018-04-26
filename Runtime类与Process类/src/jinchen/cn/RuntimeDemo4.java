package jinchen.cn;

/*
 * Runtime类除了观察内存使用量外，可以直接使用runtime 类运行本机的可执行程序
 *  Process	exec(String command) 
          在单独的进程中执行指定的字符串命令。
          返回类型是：process类的类型
 */
public class RuntimeDemo4 {
public static void main(String[] args) {
	//取得runtime的实例化对象
	Runtime rt = Runtime.getRuntime();
	//打开记事本
	try{rt.exec("notepad.exe");}
	 catch(Exception e){
		 System.out.println(e.getStackTrace());
	 }
	//实现一个功能，打开记事本停留5s后自动关闭
	//声明一个process 对象，用于接收启动的进程
	//Process p = null;
	
	try{Thread.sleep(5000);}
	 catch(Exception e){
		 System.out.println(e.getStackTrace());
	 }
      //p.destroy();
	try{rt.exec("notepad.exe").destroy();}
	catch(Exception e){
		System.out.println(e.getStackTrace());
	}
	
}
}
