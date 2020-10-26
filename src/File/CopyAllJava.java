package File;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class CopyAllJava
{
	public static void main(String[] args)
	{
		File mytemp = new File("D:\\mytemp");
		mytemp.mkdir();
		
		File d = new File("D:");
		traversalCopy(d, mytemp);
	}
	
	/**
	  *  ��ȡĿ¼f������java�ļ�����������Ŀ¼dir
	 * @param f ԴĿ¼
	 * @param dir Ŀ��Ŀ¼
	 */
	private static void traversalCopy(File f, File dir)
	{
		File[] files = f.listFiles();
		
		for(File file: files)
		{
			String name = file.getName();
			if(file.isFile() && name.endsWith(".java"))
			{
				System.out.println(name);

				File newFile = new File(dir.getAbsolutePath() + "\\" + name);
				try
				{
					Files.copy(file.toPath(), newFile.toPath());
				} 
				catch (IOException e) 
				{
					System.out.println("����ͬ���ļ���������ԭ���İ汾");
				}
			}
			if(file.isDirectory())
			{
				traversalCopy(file, dir);
			}
		}
	}
}