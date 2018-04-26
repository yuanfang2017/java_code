package fanzhuan.cn;
/*
 * 字符串的反转
 * api方法：
 *  StringBuffer	reverse() 
          将此字符序列用其反转形式取代。
 */
public class StringBufferDemo2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
	    sb.insert(sb.length(), "world");
	    sb.reverse();
	     System.out.println(sb);    
	}

}
