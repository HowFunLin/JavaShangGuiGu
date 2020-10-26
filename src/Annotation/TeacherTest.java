package Annotation;

import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno
{
	public String value();
}

class Teacher extends Person
{
	@Override
	@Deprecated
	@SuppressWarnings("all")
	@MyAnno("Anno")
	public void say()
	{
		
	}
}

public class TeacherTest
{
	public static void main(String[] args)
	{
		try
		{
			Method method = Teacher.class.getDeclaredMethod("say", null);
			MyAnno annotation = method.getAnnotation(MyAnno.class);
			System.out.println(annotation);
		} catch (NoSuchMethodException | SecurityException e)
		{
			e.printStackTrace();
		}
	}
}