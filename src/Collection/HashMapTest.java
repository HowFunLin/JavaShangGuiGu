package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest
{
	public static void main(String[] args)
	{
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		
		hashMap.put("Amy", 92);
		hashMap.put("Cathy", 93);
		hashMap.put("Black", 97);
		
		//按key所属类型的hashCode方法进行排序，取出时按该顺序取出
		Set<String> s = hashMap.keySet();
		
		for(String str: s) System.out.println(str);
		
		//value和Entry的取出同理
		Collection<Integer> se = hashMap.values();
		
		for(Integer i: se) System.out.println(i);
		
		Set<Entry<String, Integer>> set = hashMap.entrySet();
		
		for(Entry<String, Integer> entry: set) System.out.println(entry);
	}
}
