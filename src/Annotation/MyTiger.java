package Annotation;

import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Target;

@Target(METHOD)
@interface MyTiger
{
	public String value();
}

class Person
{
	@MyTiger("Tiger")
	protected void say()
	{
		System.out.println();
	}
}
