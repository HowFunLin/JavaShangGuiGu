package Collection.ExaminationRanking;

import java.util.TreeSet;

public class ShowRanking
{
	public static void main(String[] args)
	{
		TreeSet<Student> treeSet = new TreeSet<Student>();
		
		Student student1 = new Student("Amy", 75, 3);
		Student student2 = new Student("Black", 85, 2);
		Student student3 = new Student("Cathy", 95, 1);
		
		treeSet.add(student1);
		treeSet.add(student2);
		treeSet.add(student3);
		
		for(Student student: treeSet) System.out.println(student);
	}

}
