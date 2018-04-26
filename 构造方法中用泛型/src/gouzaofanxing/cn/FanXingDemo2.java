package gouzaofanxing.cn;
/*
 * 构造方法中用泛型
 */
//泛型类
class Point <t> {
private t x;
private t y;
public Point(t x,t y){
	this.x = x;
	this.y = y;
}
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
public class FanXingDemo2 {
public static void main(String[] args) {
	Point<Integer> p = new Point<Integer>(67,87);
     System.out.println(p.getx());	
     System.out.println(p.gety());	
}
}
