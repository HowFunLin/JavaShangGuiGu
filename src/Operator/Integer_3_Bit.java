package Operator;

public class Integer_3_Bit
{
	public static void main(String[] args)
	{
		int i = 159;
		
		System.out.println("��λ��Ϊ��" + i % 10); // i % 10 / 1
		System.out.println("ʮλ��Ϊ��" + i % 100 / 10);
		System.out.println("��λ��Ϊ��" + i / 100); // i % 1000 / 100
	}
}
