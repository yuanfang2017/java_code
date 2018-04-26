package tianjia.cn;
/*
 * 在任意位置 添加内容
 * api方法：
 *  StringBuffer	insert(int offset, boolean b) 
          将 boolean 参数的字符串表示形式插入此序列中。
 StringBuffer	insert(int offset, char c) 
          将 char 参数的字符串表示形式插入此序列中。
 StringBuffer	insert(int offset, char[] str) 
          将 char 数组参数的字符串表示形式插入此序列中。
 StringBuffer	insert(int index, char[] str, int offset, int len) 
          将数组参数 str 的子数组的字符串表示形式插入此序列中。
 StringBuffer	insert(int dstOffset, CharSequence s) 
          将指定 CharSequence 插入此序列中。
 StringBuffer	insert(int dstOffset, CharSequence s, int start, int end) 
          将指定 CharSequence 的子序列插入此序列中。
 StringBuffer	insert(int offset, double d) 
          将 double 参数的字符串表示形式插入此序列中。
 StringBuffer	insert(int offset, float f) 
          将 float 参数的字符串表示形式插入此序列中。
 StringBuffer	insert(int offset, int i) 
          将 int 参数的字符串表示形式插入此序列中。
 StringBuffer	insert(int offset, long l) 
          将 long 参数的字符串表示形式插入此序列中。
 StringBuffer	insert(int offset, Object obj) 
          将 Object 参数的字符串表示形式插入此字符序列中。
 StringBuffer	insert(int offset, String str) 
          将字符串插入此字符序列中。
 */
public class StingBufferDemo1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.insert(1, "world");
		//在最后添加
		sb.insert(sb.length(), "!!!");
		System.out.println(sb);
	}

}
