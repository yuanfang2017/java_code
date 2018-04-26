package duogefanxing.cn;
/*
 * 使用多个泛型
 */
class Point <t,v> {
private t x;
private v y;
public void setx(t  x){
	this.x = x;
}
public t getx(){
	return x;
}
public void sety(v  y){
	this.y = y;
}
public v gety(){
	return y;
}
}
public class FanXingDemo3 {
public static void main(String[] args) {
			Point <Integer,String>p = new Point<Integer,String>();
			p.sety("xixianghua");
			p.setx(78);
			System.out.println(p.getx());
			System.out.println(p.gety());
}

}
