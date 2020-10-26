package Operator;

/*
  * 位运算符操作整型的数据
  * 在一定范围内：
 * <<：每左移一位，相当于 * 2
 * >>：每右移一位，相当于 / 2
 * >>>：无符号右移
 */

public class BitwiseOperator
{
	public static void main(String[] args)
	{
		int i = 21;
		
		System.out.println("i << 2 : " + (i << 2));
		System.out.println("i << 3 : " + (i << 3));
		System.out.println("i << 27 : " + (i << 27));
		
		//按二进制位与、或、异或
		int m = 12;
		int n = 5;
		
		System.out.println("m & n : " + (m & n));
		System.out.println("m | n : " + (m | n));
		System.out.println("m ^ n : " + (m ^ n));
		
		m = m ^ n;
		n = m ^ n;
		m = m ^ n;
		
		System.out.println("m = " + m + ", n = " + n);
	}
}
