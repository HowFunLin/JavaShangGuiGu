package CommonClasses.Sort;

import java.util.Arrays;
import java.util.Comparator;

//两种方式均默认为从小到大排列
public class NaturalSorting
{
	public static void main(String[] args)
	{
		Person p1 = new Person("Amy", 18);
		Person p2 = new Person("Cathy", 16);
		Person p3 = new Person("Black", 17);
		
		Person[] pa1 = {p1, p2, p3};
		Person[] pa2 = {p1, p2, p3};
		
		Arrays.sort(pa1);
		Arrays.sort(pa2, new Comparator<Person>() 
		{
			@Override
			public int compare(Person o1, Person o2)
			{
				if(o1.getAge() == o2.getAge()) return 0;
				else if(o1.getAge() > o2.getAge()) return 1;
				else return -1;
			}
		});
		
		for(Person p: pa1) System.out.print(p.getName() + " ");
		System.out.println();
		for(Person p: pa2) System.out.print(p.getName() + " ");
	}
}
