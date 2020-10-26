package Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSort
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee("Black", 19);
		Employee e2 = new Employee("Amy", 19);
		Employee e3 = new Employee("Amy", 17);
		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		for(Employee e: list) System.out.println(e);
		
		System.out.println("---------------------------------");
		
		Collections.sort(list, (o1, o2) ->
		{
			if(o1.getName().compareTo(o2.getName()) == 0)
			{
				return Integer.compare(o1.getAge(), o2.getAge());
			}
			return o1.getName().compareTo(o2.getName());
		});
		
		for(Employee e: list) System.out.println(e);
	}
}

class Employee
{
	private String name;
	private int age;
	
	public Employee(String name, int age)
	{
		this.setName(name);
		this.setAge(age);
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	@Override
	public String toString()
	{
		return "Employee [name=" + name + ", age=" + age + "]";
	}
}