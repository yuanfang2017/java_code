package duixiangkelong.cn;
/*
 * 对象的克隆技术
 * protected  Object	clone() 
          创建并返回此对象的一个副本。
          对象克隆必须要的两点：
          1、必须要实现Cloneable接口
          2、子类必须要重写clone()
 */
//创建一个类，必须要实现Cloneable接口
class Person implements Cloneable{
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//重写 clone() 方法，并扩大访问权限，以便外部调用
	public Object clone()throws CloneNotSupportedException
	{
		//具体的操作由父类完成
		return super.clone();
	}
}
public class KeLongDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		//new  一个person 实例化对象出来
		Person p1 = new Person("张三");
		//克隆一个 对象 p2(并没有 new 出来 哦)
		Person p2 = (Person)p1.clone();
		p2.setName("李四");
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		
	}

}
