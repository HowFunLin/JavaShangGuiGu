package ControlFlow;
/*
  * �Ӽ��̻�ȡ��ͬ���͵ı���
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
		
		//Scanner��û���ṩ��صķ�����ȡchar��
		String gender = scan.next();
		char genderChar = gender.charAt(0); //��ȡ����λ���ϵ��ַ�
		System.out.println(genderChar);
		
		scan.close();
	}
}
