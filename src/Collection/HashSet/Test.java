package Collection.HashSet;

import java.util.HashSet;

//�ۺϹ�ϣ���Set������
public class Test
{
	public static void main(String[] args)
	{
		HashSet<Person> set = new HashSet<Person>();
		
		Person p1 = new Person(1001, "AA");
		Person p2 = new Person(1002, "BB");
		
		set.add(p1);
		set.add(p2);
		
		p1.name = "CC";
		
		//p1���Ըı��λ�ò��䣬��ɾ��λ�õ�hashֵ�������Ծ�����
		set.remove(p1);
		
		System.out.println(set);
		
		//��Ϊp1λ�ò��䣬hashֵ��λ��Ϊ��
		set.add(new Person(1001, "CC"));
		
		System.out.println(set);
		
		//hashֵλ����ͬ�����Բ�ͬ����Ȼ���Լ���
		set.add(new Person(1001, "AA"));
		
		System.out.println(set);
	}
}
