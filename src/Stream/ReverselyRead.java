package Stream;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ReverselyRead
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("forCopy.txt");
		RandomAccessFile raf = new RandomAccessFile(file, "r");
		
		long len = raf.length();
        while(0 != len--) 
        {   
            raf.seek(len);   
            char ch = (char)raf.read();
            if(ch == '\r') continue;
            else System.out.print(ch);   
        }   
		
		raf.close();
	}
}
