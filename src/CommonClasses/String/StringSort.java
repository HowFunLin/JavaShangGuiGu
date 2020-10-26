package CommonClasses.String;

import java.util.Arrays;

public class StringSort
{
	public static void main(String[] args)
	{
		String str = "abcwerthelloyuiodef";
		
		System.out.println(stringSort(str));
	}
	
	public static String stringSort(String str)
	{
		char[] c = str.toCharArray();
		Arrays.sort(c);
		str = String.valueOf(c);
		return str;
	}
}
