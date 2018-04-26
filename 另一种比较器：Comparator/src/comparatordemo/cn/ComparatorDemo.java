package comparatordemo.cn;

import java.util.Comparator;

/*
 * 一个对象的初期，并没有实现comparable 接口，此时肯定无法进项对象的排序操作，所以为了解决这个问题，
 * Java又定义了另一个比较器的操作接口,但是前提是：必须先定义好一个比较规则类出来
 * 接口的定义如下：
 * public interface Comparator<T>{
 * public int compare(T o1, T o2) ;
 * boolean equals(Object obj) ;
 *}
 */
//定义一个person类
 class Person{
	 private String name;
	 private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	 //复写equals方法
	public boolean equals(Object obj){
		if (this==obj) {
			return true;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person p = (Person)obj;
		if (this.age==p.age&&this.name.equals(p.name)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	//重写tostring方法
			public String toString(){
				return this.getName()+this.getAge();
			}
	
 }
 //定义一个比较规则
 class PersonComparator implements Comparator<Person>{
	 public int compare(Person p1, Person p2){
		 if (p1.equals(p2)) {
			return 0;
		}
		 else if (p1.getAge()<p2.getAge()) {
			return 1;
		}
		 else {
			return -1;
		}	
	 }
 }
 
public class ComparatorDemo {
	public static void main(String[] args) {
		//创建一个对象数组
		Person stu[] = {new Person("张三",22),new Person("张三",20),new Person("李四",22),new Person("王五",30),new Person("赵六",40)};
		 //排序
		 java.util.Arrays.sort(stu,new PersonComparator());
		 //遍历数组
		 for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i]);
		}
	}

}
