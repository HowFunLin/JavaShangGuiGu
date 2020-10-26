package Collection.HashSet;

import java.util.HashSet;

//综合哈希表和Set的性质
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
		
		//p1属性改变而位置不变，而删除位置的hash值是由属性决定的
		set.remove(p1);
		
		System.out.println(set);
		
		//因为p1位置不变，hash值的位置为空
		set.add(new Person(1001, "CC"));
		
		System.out.println(set);
		
		//hash值位置相同而属性不同，仍然可以加入
		set.add(new Person(1001, "AA"));
		
		System.out.println(set);
	}
}
