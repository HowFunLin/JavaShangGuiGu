package Reflection.Private;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectTest
{
	public static void main(String[] args) throws ReflectiveOperationException
	{
		Class<PrivateTest> test = PrivateTest.class;
		
		PrivateTest pt = test.getDeclaredConstructor().newInstance();
		
		Field name = test.getDeclaredField("name");
		name.setAccessible(true);
		name.set(pt, "Riyad");
		
		Method gn = test.getMethod("getName");
		System.out.println(gn.invoke(pt));
	}
}
