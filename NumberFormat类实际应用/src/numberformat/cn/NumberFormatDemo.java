package numberformat.cn;

import java.text.NumberFormat;

/*NumberFormat 是所有数值格式的抽象基类
 * 由于 抽象类必须要通过多态来实例化，但是NumberFormat中有一个静态方法，可以直接取得实例化对象
 * static NumberFormat	getInstance() 
          返回当前默认语言环境的通用数值格式。
   String	format(double number) 
          格式规范。
 */
public class NumberFormatDemo {
 public static void main(String[] args) {
	 //实例化NumberFormat对象
	 NumberFormat nf = NumberFormat.getInstance();
	 System.out.println(nf.format(800000));
	 System.out.println(nf.format(100000.789));
}
}
