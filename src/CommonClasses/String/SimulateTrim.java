package CommonClasses.String;

public class SimulateTrim
{
	public static void main(String[] args)
	{
		String str = " d s a ";
		System.out.print(simulateTrim(str));
	}

	public static String simulateTrim(String str)
	{
		int beginIndex = 0;
		int endIndex = str.length() - 1;
		
		while(str.charAt(beginIndex) == ' ' && beginIndex < endIndex) beginIndex++;
		while(str.charAt(endIndex) == ' ' && beginIndex < endIndex) endIndex--;
		
		String s = str.substring(beginIndex, endIndex + 1);
		
		return s;
	}
}
