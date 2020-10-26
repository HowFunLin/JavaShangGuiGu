package Reflection.Student;

class Student
{
	private String name;
	private int age;
	
	public Student()
	{
		System.out.println("No parameter constructor.");
	}

	public Student(String name, int age)
	{
		this.name = name;
		this.age = age;
		System.out.println("The parameter constructor.");
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
}
