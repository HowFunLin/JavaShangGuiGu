package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Count
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		Employee[] es = {e1, e2, e3};
		
		List<Employee> list = Arrays.asList(es);
		
		Optional<Integer> count = list.stream().map((e) -> 1).reduce(Integer::sum);
		
		System.out.println(count.get());
	}
}

class Employee
{
	
}