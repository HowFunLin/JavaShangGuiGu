package CommonClasses.String;

public class MaxSameSubstring
{
	public static void main(String[] args)
	{
		String str1 = "abcwerthelloyuiodef";
		String str2 = "cvhellobnmabcwe";
		
		System.out.println("The max same string is " + maxSameSubstring(str1, str2));
	}
	
	public static StringBuffer maxSameSubstring(String str1, String str2)
	{
		String maxStr;
		String minStr;
		String maxSame = "";
		StringBuffer maxSameString = new StringBuffer();
		
		if(str1.length() < str2.length()) minStr = str1;
		else minStr = str2;
		
		if(minStr == str1) maxStr = str2;
		else maxStr = str1;
		
		for(int i = 0; i < minStr.length(); i++)
		{
			for(int j = i; j < minStr.length(); j++)
			{
				String subStr = minStr.substring(i, j + 1);
				if(maxStr.contains(subStr) && subStr.length() >= maxSame.length()) 
				{
					if(subStr.length() > maxSame.length())
					{
						maxSame = subStr;
						maxSameString = new StringBuffer(maxSame);
					}
					else 
					{
						maxSame = subStr;
						maxSameString.append(" " + maxSame);
					}
				}
			}
		}
		
		return maxSameString;
	}
}
