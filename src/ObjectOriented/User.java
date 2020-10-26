package ObjectOriented;

public class User
{
	String name;
	int age;
	
	User(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj == this) return true;
		
		if(obj instanceof User)
		{
			User u = (User)obj;
			return this.age == u.age && this.name.equals(u.name);
		}
		
		return false;
	}
	
	public static void main(String[] args)
	{
		User u1 = new User("Jack", 18);
		User u2 = new User("Jack", 18);
		
		System.out.println(u1.equals(u2));
		
		//字符串和原生数据类型的转换
		int i = 10;
		String str = String.valueOf(i);
		
		System.out.println(str);
		
		i = Integer.parseInt(str);
		
		System.out.println(i);
	}
}
