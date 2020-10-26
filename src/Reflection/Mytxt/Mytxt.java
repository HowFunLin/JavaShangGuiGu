package Reflection.Mytxt;

import java.io.File;
import java.io.IOException;

class Mytxt
{
	public void myCreate() throws IOException
	{
		File file = new File("D:\\myhello.txt");
		file.createNewFile();
	}
}
