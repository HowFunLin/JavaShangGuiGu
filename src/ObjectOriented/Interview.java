package ObjectOriented;

public class Interview
{
	public static void main(String[] args)
	{
		Base base = new Sub();
		base.add(1, 2, 3);
		
		Sub sub = (Sub)base;
		sub.add(1, 2, 3);
	}
}

class Base
{
	public void add(int a, int... arr)
	{
		System.out.println("Base");
	}
}

class Sub extends Base
{
	//������Ϊ�Ƕ�add��������д����������
	//public void add(int a, int[] arr)
	//{
	//	System.err.println("Sub_1");
	//}
	
	//�β���ȷ���ķ������ȵ���
	public void add(int a, int b, int c)
	{
		System.out.println("Sub_2");
	}
}