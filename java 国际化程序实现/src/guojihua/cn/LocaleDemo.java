package guojihua.cn;

import java.util.ResourceBundle;

/* 三个常用的方法
 * static ResourceBundle	getBundle(String baseName) 
          使用指定的基本名称、默认的语言环境和调用者的类加载器获取资源包。
static ResourceBundle	getBundle(String baseName, Locale locale) 
          使用指定的基本名称、语言环境和调用者的类加载器获取资源包。
   String	getString(String key) 
          从此资源包或它的某个父包中获取给定键的字符串。
 */
public class LocaleDemo {
	public static void main(String[] args) {
		//找到资源文件
		ResourceBundle rb = ResourceBundle.getBundle("Message");
		System.out.println(rb.getString("info"));
	}

}
