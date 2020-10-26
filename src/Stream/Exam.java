package Stream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exam
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("exam.txt");
		FileReader fr = new FileReader(file);
		Scanner scan = new Scanner(System.in);
		
		String[] a = new String[4];
		int i = 0;
		int p = 0;
		int ch;
		while((ch = fr.read()) != -1)
		{
			char c = (char) ch;
			if(c == '*')
			{
				i++;
				if(i % 20 == 0)
				{
					System.out.print("请输入选择的答案（A、B、C、D）：");
					a[p] = scan.next();
					p++;
					continue;
				}
				else continue;
			}
			System.out.print(c);
		}
		
		System.out.println();
		int score = 0;
		if(a[0].equals("A")) score += 25;
		if(a[1].equals("C")) score += 25;
		if(a[2].equals("D")) score += 25;
		if(a[3].equals("D")) score += 25;
		System.out.println("你的得分是：" + score + "分");
		
		fr.close();
		scan.close();
	}
}
