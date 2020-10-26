package Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFS
{
	public static void main(String[] args) throws IOException
	{
		long start = System.currentTimeMillis();
		
		FileInputStream fis = new FileInputStream("forCopy.txt");
		
		File copy = new File("copy.txt");
		copy.createNewFile();
		
		FileOutputStream fos = new FileOutputStream(copy);
		
		byte[] b = fis.readAllBytes();
		
		fos.write(b);
		
		fis.close();
		fos.close();
		
		long end = System.currentTimeMillis();
		
		System.out.println("Used time: " + (end - start));
	}
}
