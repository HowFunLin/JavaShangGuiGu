package Stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadTxt
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("forCopy.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		File newFile = new File("forWriter.txt");
		newFile.createNewFile();
		FileWriter fw = new FileWriter(newFile);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String str;
		while((str = br.readLine()) != null)
		{
			str += "ºÃ";
			bw.write(str + "\r\n");
		}
		bw.write("Íê±Ï");
		
		br.close();
		bw.close();
	}
}
