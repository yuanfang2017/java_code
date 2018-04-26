/*
 * 静态 导包
 * 如果一个类中的全部方法是使用static 声明的静态方法，则导入时直接用 import static的方式导入
 * JingTaiImportDemo 中的静态方法可以直接在 JingTaiImportDemo2 中使用，不需要再使用类.静态方法（）的形式调用
 */

package packagedemo.itcast2;
import static packagedemo.itcast.JingTaiImportDemo.*;
public class JingTaiImportDemo2 {
 public static void main(String[] args) {
	System.out.println(jia(12,78));
	System.out.println(jian(10,2));
	System.out.println(chen(15,3));
	System.out.println(chu(12,3));
}
}
