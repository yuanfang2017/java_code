package stringbuffer.cn;
/*
 * stringbuffer的实际应用，
 * 频繁的修改字符串内容的地方，建议使用stringbuffer，代码的性能有了很大的提高
 * string 不断的修改对象的引用来实现的，所以性能很差
 */

public class StringBufferDemo {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer();
	sb.append("hello").append("world");
	for (int i = 0; i < 100; i++) {
		sb.append(i);
	}
	System.out.println(sb);
}
}
