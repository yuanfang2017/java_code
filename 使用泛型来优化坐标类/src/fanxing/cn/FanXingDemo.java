package fanxing.cn;
/*
 * 使用泛型来优化 坐标类的demo
 */
//申明泛型类
class Point <t> {
private t x;
private t y;
public void setx(t  x){
	this.x = x;
}
public t getx(){
	return x;
}
public void sety(t  y){
	this.y = y;
}
public t gety(){
	return y;
}
}
public class FanXingDemo {
	public static void main(String[] args) {
		//泛型对象定义
		//问题：这里为啥不用int ，要用Integer 呢，因为泛型中只能使用包装类
		Point <Integer>p = new Point<Integer>();
		p.sety(89);
		p.setx(34);
		System.out.println(p.getx());
		System.out.println(p.gety());
	}

}
