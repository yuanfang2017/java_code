package guanchazhe.cn;

import java.util.Observable;
import java.util.Observer;

/*
 * 观察者模式：很多购房者都在关注房价的变化，每当房价发生变化时，所有的购房者都可以看到
 * 实现方式：
 * 被观察者 必须继承 observable 类， observable 类的常用方法：
 *  void	addObserver(Observer o) 
          如果观察者与集合中已有的观察者不同，则向对象的观察者集中添加此观察者。
     void	deleteObserver(Observer o) 
          从对象的观察者集合中删除某个观察者。
     void	deleteObservers() 
          清除观察者列表，使此对象不再有任何观察者。
    void	notifyObservers() 
          如果 hasChanged 方法指示对象已改变，则通知其所有观察者，并调用 clearChanged 方法来指示此对象不再改变。
     void	notifyObservers(Object arg) 
          如果 hasChanged 方法指示对象已改变，则通知其所有观察者，并调用 clearChanged 方法来指示此对象不再改变。
p    protected  void	setChanged() 
          标记此 Observable 对象为已改变的对象；现在 hasChanged 方法将返回 true。
          
          
          观察者必须实现 Observer 接口，Observer 接口定义如下：
          public interface Observer{
          public void update(Observable o,Object arg)
          }
          
 */
//被观察者类
class House extends Observable{
	private Float price;

	public House(Float price) {
		super();
		this.price = price;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		//设置变化点
		super.setChanged();
		super.notifyObservers(price);
		this.price = price;
	}
	
}
//观察者类
class HousePriceObserver implements Observer{
	//观察者姓名
	private String name;
	public HousePriceObserver(String name) {
		super();
		this.name = name;
	}

	//实现update方法
	public void update(Observable o,Object arg){
		//判断参数类型
		if (arg instanceof Float) {
			System.out.println(this.name+"观察到的价格变化为");
			System.out.println(((Float) arg).floatValue());
		}
	}
	
}
public class OberserableDemo {
	public static void main(String[] args) {
		//被观察着对象
		House hs =new House(1000f);
		//添加观察者
		hs.addObserver(new HousePriceObserver("观察者A"));
		hs.addObserver(new HousePriceObserver("观察者B"));
		hs.addObserver(new HousePriceObserver("观察者C"));
	    System.out.println("房子的价格是："+hs.getPrice());
	    hs.setPrice(600f);
	    //System.out.println("现在房子的价格是："+hs.getPrice());
		
	}

}
