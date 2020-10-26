package ObjectOriented;

public class StudentTest
{
	public static void main(String[] args)
	{
		Student[] student = new Student[20];
		
		for(int i = 0; i < 20; i++)
		{
			student[i] = new Student();
			student[i].number = i + 1;
			student[i].state = (int)(Math.random() * 9) + 1;
			student[i].score = (int)(Math.random() * 100);
		}
		
		System.out.println("���꼶��ѧ����Ϣ��");
		System.out.println();
		for(Student i: student)
		{
			if(i.state == 3)
			{
				System.out.println("ѧ�ţ�" + i.number);
				System.out.println("�꼶��" + i.state);
				System.out.println("�ɼ���" + i.score);
				System.out.println();
			}
		}
		
		for(int i = 0; i < student.length - 1; i++)
		{
			for(int j = 0; j < student.length - 1 - i; j++)
			{
				if(student[j].score < student[j + 1].score)
				{
					Student temp = student[j];
					student[j] = student[j + 1];
					student[j + 1] = temp;
				}
			}
		}
		
		System.out.println("����ѧ����Ϣ��");
		System.out.println();
		for(Student i: student)
		{
			System.out.println("ѧ�ţ�" + i.number);
			System.out.println("�꼶��" + i.state);
			System.out.println("�ɼ���" + i.score);
			System.out.println();
		}
	}
}

class Student
{
	int number;
	int state;
	int score;
}