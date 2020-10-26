package ControlFlow;
/*
  * 从键盘获取不同类型的变量
 */

import java.util.Scanner;

public class ScannerTest
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String name = scan.next();
		System.out.println(name);
		
		int age = scan.nextInt();
		System.out.println(age);
		
		double weight = scan.nextDouble();
		System.out.println(weight);
		
		boolean isTrue = scan.nextBoolean();
		System.out.println(isTrue);
		
		//Scanner类没有提供相关的方法获取char型
		String gender = scan.next();
		char genderChar = gender.charAt(0); //获取索引位置上的字符
		System.out.println(genderChar);
		
		scan.close();
	}
}
