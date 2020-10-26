package Reflection.Student;

import java.lang.reflect.Constructor;

public class NewInstanceTest
{
	public static void main(String[] args) throws ReflectiveOperationException
	{
		Class<Student> sc = Student.class;
	
		Constructor<Student> npc = sc.getConstructor(null);
		Constructor<Student> pc = sc.getConstructor(String.class, int.class);
			
		npc.newInstance(null);
		pc.newInstance("Name", 20);
	}
}
