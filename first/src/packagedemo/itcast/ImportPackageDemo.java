package packagedemo.itcast;
/*
 * 遇到好多的坑 
 *  1、类名必须与文件名一致
 *  2、被导包的那个类必须是 public 
 *  3.import 后面不能再带package关键字
 */
//重新写一个类定义一个方法
public class ImportPackageDemo{
	public String getInfo(){
		return "helloworld";
	}
}
/*public class ImportPackageDemo {
	  public static void main(String[] args) {
		System.out.println(new PackageDemo().getInfo());
	}
	}
*/