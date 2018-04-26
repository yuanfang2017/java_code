package objectOutputStream.cn;
/*
 * 对象序例化：把一个对象变成二进制的数据流的一种方法，通过对象序例化可以方便的实现对象的传输和存储
 * 如果一个对象要被序例化，则所在的类必须实现 Java.io.Serializable接口
 */
//定义一个类，实现Serializable 接口

import java.io.Serializable;

class Person implements Serializable{
	private String name;
	private int age;
	public Person(String name,int age){
		this.age = age;
		this.name = name;
	}
	public String toString(){
		return "姓名:"+this.name+"，年龄："+this.age;
	}
}
public class ObjectOutputStreamDemo {

}
