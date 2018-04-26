package random.cn;

import java.util.Random;

/*
 * random 类是一个随机数产生类
 * 常用的方法：
 *  boolean	nextBoolean() 
          返回下一个伪随机数，它是取自此随机数生成器序列的均匀分布的 boolean 值。
           double	nextDouble() 
          返回下一个伪随机数，它是取自此随机数生成器序列的、在 0.0 和 1.0 之间均匀分布的 double 值。
           float	nextFloat() 
          返回下一个伪随机数，它是取自此随机数生成器序列的、在 0.0 和 1.0 之间均匀分布的 float 值
           int	nextInt() 
          返回下一个伪随机数，它是此随机数生成器的序列中均匀分布的 int 值。
          int	nextInt(int n) 
          返回一个伪随机数，它是取自此随机数生成器序列的、在 0（包括）和指定值（不包括）之间均匀分布的 int 值。
 */
//实例：生成10个随机数，且数字不大于100
public class RandomDemo {
	public static void main(String[] args) {
		Random rd = new Random();
		//循环10次，产生10个随机数
		for (int i = 0; i < 10; i++) {
			System.out.print(rd.nextInt(100)+"\t");
		}
		
	}

}
