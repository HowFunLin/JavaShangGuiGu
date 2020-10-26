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
	  *  读取目录f中所有java文件，并拷贝进目录dir
	 * @param f 源目录
	 * @param dir 目标目录
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
					System.out.println("存在同名文件，仅保存原来的版本");
				}
			}
			if(file.isDirectory())
			{
				traversalCopy(file, dir);
			}
		}
	}
}