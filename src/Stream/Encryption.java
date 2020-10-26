package Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Encryption
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis = new FileInputStream("forCopy.txt");
		
		File copy = new File("copy.txt");
		copy.createNewFile();
		
		FileOutputStream fos = new FileOutputStream(copy);
		
		int b = 0;
		while((b = fis.read()) != -1) fos.write(b ^ 5);
		
		fis.close();
		fos.close();
	}
}
