package Stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBS
{
	public static void main(String[] args) throws IOException
	{
		long start = System.currentTimeMillis();
		
		FileInputStream fis = new FileInputStream("forCopy.txt");
		
		File copy = new File("copy.txt");
		copy.createNewFile();
		
		FileOutputStream fos = new FileOutputStream(copy);
		
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		byte[] b = bis.readAllBytes();
		
		bos.write(b);
		
		bis.close();
		bos.close();
		
		long end = System.currentTimeMillis();
		
		System.out.println("Used time: " + (end - start));
	}
}
