package Operator;

/*
  * λ������������͵�����
  * ��һ����Χ�ڣ�
 * <<��ÿ����һλ���൱�� * 2
 * >>��ÿ����һλ���൱�� / 2
 * >>>���޷�������
 */

public class BitwiseOperator
{
	public static void main(String[] args)
	{
		int i = 21;
		
		System.out.println("i << 2 : " + (i << 2));
		System.out.println("i << 3 : " + (i << 3));
		System.out.println("i << 27 : " + (i << 27));
		
		//��������λ�롢�����
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
