package Collection.TreeSet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee("Amy", 18, new MyDate(2000, 12, 21));
		Employee e2 = new Employee("Black", 18, new MyDate(2000, 05, 21));
		Employee e3 = new Employee("Cathy", 20, new MyDate(1998, 04, 21));
		Employee e4 = new Employee("David", 20, new MyDate(1998, 04, 01));
		Employee e5 = new Employee("Elly", 22, new MyDate(1996, 12, 21));
		
		TreeSet<Employee> t1 = new TreeSet<Employee>();
		
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		
		Iterator<Employee> i1 = t1.iterator();
		while(i1.hasNext()) System.out.println(i1.next());
		
		System.out.println();
		
		TreeSet<Employee> t2 = new TreeSet<Employee>(new Comparator<Employee>()
		{
			@Override
			public int compare(Employee o1, Employee o2)
			{
				if(o1.getBirthday().getYear() < o2.getBirthday().getYear()) return -1;
				else if(o1.getBirthday().getYear() > o2.getBirthday().getYear()) return 1;
				else
				{
					if(o1.getBirthday().getMonth() < o2.getBirthday().getMonth()) return -1;
					else if(o1.getBirthday().getMonth() > o2.getBirthday().getMonth()) return 1;
					else
					{
						if(o1.getBirthday().getDay() < o2.getBirthday().getDay()) return -1;
						else if(o1.getBirthday().getDay() > o2.getBirthday().getDay()) return 1;
						else return 0;
					}
				}
			}
		});
		
		t2.add(e1);
		t2.add(e2);
		t2.add(e3);
		t2.add(e4);
		t2.add(e5);
		
		Iterator<Employee> i2 = t2.iterator();
		while(i2.hasNext()) System.out.println(i2.next());
	}
}
