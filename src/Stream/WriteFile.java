package Stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("test.txt");
		f.createNewFile();
		
		FileOutputStream fos = new FileOutputStream(f);
		
		String str = "Java��һ�ֿ���׫д��ƽ̨Ӧ��������������ĳ���������ԣ�"
				+ "����Sun Microsystems��˾�� 1995��5���Ƴ���Java����������Ժ�Javaƽ̨"
				+ "����JavaSE, JavaEE, JavaME�����ܳơ�Java ��������׿Խ��ͨ���ԡ���Ч�ԡ�"
				+ "ƽ̨��ֲ�ԺͰ�ȫ�ԣ��㷺Ӧ���ڸ���PC���������ġ���Ϸ����̨����ѧ�����������"
				+ "�ƶ��绰�ͻ�������ͬʱӵ��ȫ�����Ŀ�����רҵ��Ⱥ����ȫ���Ƽ�����ƶ��������Ĳ�ҵ�����£�"
				+ "Java���߱����������ƺ͹���ǰ����";
		byte[] b = str.getBytes();
		fos.write(b);
		
		fos.close();
	}
}
