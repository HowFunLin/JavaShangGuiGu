package Reflection.Mytxt;

import java.lang.reflect.Method;

public class NewInstanceTest
{
	public static void main(String[] args) throws ReflectiveOperationException
	{
		Class<Mytxt> mytxt = Mytxt.class;
		
		Method myCreate = mytxt.getMethod("myCreate");
		
		myCreate.invoke(mytxt.getDeclaredConstructor().newInstance());
	}
}
