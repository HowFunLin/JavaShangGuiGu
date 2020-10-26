package CommonClasses.String;

public class NumberOfOccurrences
{
	public static void main(String[] args)
	{
		String s = "abkkcadkabkebfkabkskab";
		String su = "ab";
		
		int num = count(s, su);
		
		System.out.println("The numer of occurrences of " + su + " is " + num);
	}

	public static int count(String str, String subStr)
	{
		int num = 0;
		
		while(true)
		{
			if(str.contains(subStr) == false) break;
			int beginIndex = str.indexOf(subStr);
			str = str.substring(beginIndex + subStr.length());
			num++;
		}
		
		return num;
	}
}
