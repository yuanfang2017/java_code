package serializable.cn;

import java.io.Serializable;

/*
 * 多个对象序例化
 */
public class Person implements Serializable {
	private String name;
	private int age;
	public Person(String name,int age){
		this.age = age;
		this.name = name;
	}
	public String toString (){
		 return "姓名:"+this.name+"，年龄："+this.age;
	}
}