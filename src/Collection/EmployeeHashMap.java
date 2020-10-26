package Collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class EmployeeHashMap
{
	public static void main(String[] args)
	{
		HashMap<String, Integer> hs = new HashMap<String, Integer>();
		
		hs.put("Tom", 1000);
		hs.put("Jack", 1000);
		hs.put("Amy", 900);
		
		System.out.print("Employees: ");
		Set<String> s = hs.keySet();
		for(String name: s) System.out.print(name + " ");
		System.out.println();
		
		Set<Entry<String, Integer>> se = hs.entrySet();
		for(Entry<String, Integer> info: se) 
		{
			System.out.println(info.getKey() + "'s wage: " + info.getValue());
		}
		
		System.out.print("Now Employees: ");
		hs.remove("Tom");
		s = hs.keySet();
		for(String name: s) System.out.print(name + " ");
		System.out.println();
		
		int wage = hs.get("Jack");
		hs.put("Jack", wage + 1000);
		System.out.println("Jack's wage: " + hs.get("Jack"));
		
		for(String name: s)
		{
			int w;
			if((w = hs.get(name)) < 1000) 
			{
				w *= 1.2;
				hs.put(name, w);
				System.out.println(name + " has new wage: " + w);
			}
		}
	}
}
