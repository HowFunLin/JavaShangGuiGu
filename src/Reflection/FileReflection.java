package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class FileReflection
{
	public static void main(String[] args) throws ReflectiveOperationException
	{
		Class<?> fileClass = Class.forName("java.io.File");
		
		Constructor<?>[] constructors = fileClass.getDeclaredConstructors();
		
		for(Constructor<?> constructor: constructors)
		{
			System.out.println(constructor);
		}
		
		Object file = fileClass.getConstructor(String.class).newInstance("D:\\mynew.txt");
		
		Method create = fileClass.getDeclaredMethod("createNewFile");
		create.invoke(file);
	}
}
