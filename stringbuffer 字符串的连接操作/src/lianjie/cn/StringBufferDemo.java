package lianjie.cn;
/*
 * 字符串的连接操作
 *api:方法
 StringBuffer	append(boolean b) 
          将 boolean 参数的字符串表示形式追加到序列
 */
public class StringBufferDemo {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer();
	//追加字符串
	sb.append("hello").append("world").append("!!!").append("\n");
	//追加数字
	sb.append(123).append(456).append(789).append("\n");
	//追加字符
	sb.append('A').append('B').append('C').append("\n");
	//追加布尔类型的
	sb.append(true).append(false).append("\n");
	System.out.println(sb);
}
}
