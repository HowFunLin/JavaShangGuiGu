package CommonClasses.String;

public class AssignReverse
{
	public static void main(String[] args)
	{
		String str = "abcdefg";
		
		System.out.println(assignReverse(str, "cdef"));
	}
	
	public static String assignReverse(String oldStr, String assignStr)
	{
		char[] c = assignStr.toCharArray();
		char[] cr = reverse(c);
		String str = String.valueOf(cr);
		
		return oldStr.replaceAll(assignStr, str);
	}
	
	public static char[] reverse(char[] c)
	{
		for(int i = 0; i < c.length / 2; i++)
		{
			char temp = c[i];
			c[i] = c[c.length - 1 - i];
			c[c.length - 1 - i] = temp;
		}
		
		return c;
	}
}
