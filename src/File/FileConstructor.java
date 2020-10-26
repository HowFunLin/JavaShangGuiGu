package File;

import java.io.File;
import java.io.IOException;

public class FileConstructor
{
	public static void main(String[] args) throws IOException
	{
		File fp = new File("D:\\WeGame\\Download");
		
		File fcd1 = new File(fp, "1");
		File fcd2 = new File(fp, "2");
		File fc1 = new File(fp, "FileTest1.txt");
		File fc2 = new File(fcd1, "FileTest2.txt");
		
		
		fcd1.mkdir();
		fcd2.mkdir();
		fc1.createNewFile();
		fc2.createNewFile();
		
		delete("D:\\WeGame\\Download\\FileTest1.txt");
		
		String[] name = fcd1.list();
		for(String s: name) if(s.endsWith(".jpg")) System.out.println(s);
		
		traversal("D:\\WeGame\\Download");
	}
	
	public static void delete(String pathname)
	{
		File f = new File(pathname);
		f.delete();
	}
	
	public static void traversal(String pathname)
	{
		File f = new File(pathname);
		String[] name = f.list();
		
		if(name != null) 
		{
			for(String s: name) 
			{
				System.out.println(s);
				s = pathname + "\\" + s;
				traversal(s);
			}
		}
	}
	//计算目录的大小以及删除目录同理，进行递归
	//建议传入的形参为File类型的，计算大小使用length()方法
}
