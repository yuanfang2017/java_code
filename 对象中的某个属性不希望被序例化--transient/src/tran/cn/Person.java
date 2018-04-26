package tran.cn;

import java.io.Serializable;

/*
 * 一个对象中的属性不希望序例化，可以用transient 修饰
 */
public class Person implements Serializable{
	//name 不希望被序例化
	transient private String name;
	private int age;
	public Person(String name,int age){
		this.age = age;
		this.name = name;
	}
	public String toString(){
		return "姓名:"+this.name+"，年龄："+this.age;
	}
}
