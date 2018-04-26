package externalizable.cn;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/*
 * 接口 Externalizable  用户自己指定序例化的内容
 * public interface Externalizable extends Serializable{
 *  public void	readExternal(ObjectInput in);
 *   public void	writeExternal(ObjectOutput out); 
 * }
 */
public class Person implements Externalizable {
	private String name;
	private int age;
	//无参构造：要实现 Externalizable 接口，必须得有一个无参构造
	public Person(){}
	public Person(String name,int age){
		this.age = age;
		this.name = name;
	}
	public String toString (){
		 return "姓名:"+this.name+"，年龄："+this.age;
	}
	//实现两个抽象方法
	public void	readExternal(ObjectInput in) throws IOException{
	   try {
		this.name = (String)in.readObject();
		this.age = (int)in.readInt();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public void	writeExternal(ObjectOutput out) throws IOException{
		out.writeObject(this.name);
		out.writeInt(this.age);
	}

}
