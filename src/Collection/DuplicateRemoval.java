package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplicateRemoval
{
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(1);
		list.add(2);
		
		duplicateRemoval(list);
		
		for(Integer i: list) System.out.println(i);
	}
	
	public static List<Integer> duplicateRemoval(List<Integer> list)
	{
		HashSet<Integer> hs = new HashSet<Integer>(list);
		
		list.clear();
		list.addAll(hs);
		
		return list;
	}
}
