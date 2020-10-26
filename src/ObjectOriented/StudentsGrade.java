package ObjectOriented;

import java.util.Scanner;
import java.util.Vector;

public class StudentsGrade
{
	public static void main(String[] args)
	{
		Vector<Integer> v = new Vector<Integer>();
		Scanner s = new Scanner(System.in);
		Integer score = 0;
		
		System.out.println("Please enter students' score: ");
		while(score >= 0)
		{
			score = s.nextInt();
			v.addElement(score);
		}
		v.remove(v.size() - 1);
		s.close();
		
		Integer max = v.elementAt(0);
		for(Integer i: v) if(i > max) max = i;
		System.out.println("The highest score is " + max);
		
		for(int i = 0; i < v.size(); i++)
		{
			if(v.elementAt(i) > (max - 10))
				System.out.println("Student" + i + "'s grade is A.");
			else if(v.elementAt(i) > (max - 20))
				System.out.println("Student" + i + "'s grade is B.");
			else if(v.elementAt(i) > (max - 30))
				System.out.println("Student" + i + "'s grade is C.");
			else
				System.out.println("Student" + i + "'s grade is D.");
		}
	}
}
