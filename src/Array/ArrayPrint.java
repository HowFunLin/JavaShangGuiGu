package Array;

public class ArrayPrint
{
	public static void main(String[] args)
	{
		int[] arr = new int[] {1, 2, 3};
		System.out.println(arr); //地址值
		
		int[] arr2 = new int[10];
		System.out.println(arr2); //地址值
		
		//查阅源码可得知原因
		char[] arr1 = new char[] {'a', 'b', 'c'};
		System.out.println(arr1); //abc
		
		char[] arr3 = new char[10];
		System.out.println(arr3); //无输出
	}
}
