package Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CountCharacter
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis = new FileInputStream("forCopy.txt");
		FileOutputStream fos = new FileOutputStream("forWrite.txt");
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		int i;
		while((i = fis.read()) != -1)
		{
			char c = (char)i;
			if(hm.containsKey(c)) 
			{
				int sum = hm.get(c) + 1;
				hm.put(c, sum);
			}
			else hm.put(c, 1);
		}
		
		fis.close();
		
		Set<Entry<Character, Integer>> data = hm.entrySet();
		String s = data.toString();
		byte[] b = s.getBytes();
		fos.write(b);
		
		fos.close();
	}
}
