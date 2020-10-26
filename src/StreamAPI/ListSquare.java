package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListSquare
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		Stream<Integer> stream = list.stream();
		
		Stream<Integer> newStream = stream.map((x) -> (x * x));
		
		List<Integer> newList = newStream.collect(Collectors.toList());
		
		for(Integer i: newList) System.out.print(i + " ");
	}
}
