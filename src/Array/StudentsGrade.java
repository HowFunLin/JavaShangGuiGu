package Array;

import java.util.Scanner;

public class StudentsGrade
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter student's number: ");
		int num = scan.nextInt();
		int[] score = new int[num];
		
		System.out.println("Please enter " + num +" students' score: ");
		for(int i = 0; i < num; i++) score[i] = scan.nextInt();
		scan.close();
		
		int max = score[0];
		for(int i = 0; i < num; i++) if(score[i] > max) max = score[i];
		System.out.println("The highest score is " + max);
		
		for(int i = 0; i < num; i++)
		{
			char grade;
			if(score[i] >= max - 10) grade = 'A';
			else if(score[i] >= max - 20) grade = 'B';
			else if(score[i] >= max - 30) grade = 'C';
			else grade = 'D';
			System.out.println("Student " + i + " score is " + score[i] + ". Grade is " + grade);
		}
	}
}