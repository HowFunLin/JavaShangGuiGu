package Lambda;

interface Operate
{
	public String getValue(String str);
}

public class LambdaTest
{
	static String operate(String str, Operate p)
	{
		return p.getValue(str);
	}
	
	public static void main(String[] args)
	{
		String upper = operate("riyad", String::toUpperCase);
		System.out.println(upper);
		
		String substr = operate("riyad", (str) -> str.substring(2, 5));
		System.out.println(substr);
	}
}