package File;

import java.io.File;
import java.io.IOException;

public class DeleteOrCreate
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("D:\\my.txt");
		
		if(f.exists()) f.delete();
		else f.createNewFile();
	}
}
