package fanxing.demo;

import java.nio.charset.MalformedInputException;
import java.util.MissingFormatArgumentException;

/*
 * 需求：
 * 人 person - 信息类型 - (1、基本类型，2、联系方式，3、其他)
 * 思路：
 * 做一个信息的标识类，只要传递的是此接口的子类就可以设置为泛型类型
 * 
 */
//定义一个表示接口——信息
interface Info{
	//无方法
}
//定义一个联系方式的类，此类实现info 接口
class Contact implements Info{
	//三个属性  电话，地址，邮编
	private String number;
	private String address;
	private String zipcode;
	//构造方法为属性赋值
	public Contact(String number,String address,String zipcode){
		this.number = number;
		this.address = address;
		this.zipcode = zipcode;	
	}
	// getter setter 方法
	public void setnumber(String number){
		this.number = number;
	}
	public String getnumber(){
		return this.number;
	}
	public void seaddress(String address){
		this.address = address;
	}
	public String geaddress(){
		return this.address;
	}
	public void setzipcode(String zipcode){
		this.zipcode = zipcode;
	}
	public String getzipcode(){
		return this.zipcode;
	}
	//重写object类中的toString 方法，返回对象信息
	public String toString(){
		return "联系电话:"+this.number+"\n"+"联系地址:"+this.address+"\n"+"联系邮编:"+this.zipcode+"\n";
	}
}
//写一个类 个人的基本信息，实现info 接口
class Introduction implements Info{
	//三个属性 ： 姓名，性别，年龄
	private String name;
	private String sex;
	private String age;
	//构造方法为属性赋值
	public Introduction(String name, String sex, String age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "姓名:"+this.name+"\n"+"联系性别:"+this.sex+"\n"+"联系年龄:"+this.age+"\n";
	
}
}
//定义一个person类，person类中info 属性的类型使用泛型
class Person<T extends Info>{
	private T info;

	public Person(T info) {
		super();
		this.info = info;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
		
	}
 //重写 toString 方法，返回info 属性中的toString 方法的内容
	@Override
	public String toString() {
		return this.info.toString();
	}
}
public class FanXingDemo6 {
	public static void main(String[] args) {
		//将contact类设置为泛型类型
		//Contact ct = new Contact("15507546429","lixinfih","789666");
	  //Person <Contact> p  = new Person <Contact>(ct);
	  //System.out.println(ct);
		//将instrution类设置为泛型类型
		Introduction id = new Introduction("wangyuanfang","女","24");
		Person <Introduction> p  = new Person <Introduction>(id);
		System.out.println(p);
		
	}
}


