package fanxingjiekou.cn;

import java.nio.charset.MalformedInputException;

/*
 * 泛型接口
 * 有两种实现方式：
 * 1、在子类的定义上申明泛型
 * 2、直接在接口中指定具体的类型
 * 本case 以方式 2实现
 */
//定义泛型 接口
interface jiekou <t> {
//抽象方法
	public t getinfo();
}
//子类实现接口 jiekou
class JieKouDemo implements jiekou <String>{
	private String  t;
	public JieKouDemo(String  t){
		this.t = t;
	}
	public void setinfo(String  t){
		this.t = t;
	}
	public String getinfo(){
		return t;
	}
}
public class FanXingDemo4 {
	public static void main(String[] args) {
		//定义接口对象
		jiekou<String> jdk = new JieKouDemo("lixinhua");
		System.out.println(jdk.getinfo());
	}

}
