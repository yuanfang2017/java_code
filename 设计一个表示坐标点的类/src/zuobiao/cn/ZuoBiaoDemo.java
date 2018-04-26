package zuobiao.cn;
/*
 * 写一个表示坐标的类
 * 设计思路：接收两个参数 ，横坐标，纵坐标，由于表示的类型有三种： int float string
 * 要想一个类接收三种数据类型，只能使用 object，因为object类可以接收任何类型的数据
 */
//设计坐标 类 point
class Point{
	private  Object x;
	private Object y;
	public void setx(Object x){
		this.x = x;
	}
	public void sety(Object y){
		this.y = y;
	}
	public Object getx(){
		return x;
	}
public Object gety(){
		return y;
	}
		
}
public class ZuoBiaoDemo {
	public static void main(String[] args) {
		//构造对象
		Point p = new Point();
		p.setx(20);
		p.sety(78);
		//获得数据，由于是object 类型的，所以要 自动拆箱
		int m = (Integer)p.getx();
		int n = (Integer)p.gety();
		//输出坐标
		System.out.println("横坐标是："+m);
		System.out.println("纵坐标是："+n);
	}

}
