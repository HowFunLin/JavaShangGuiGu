package StreamAPI.Trade;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test
{
	public static void main(String[] args)
	{
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brain", "Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
				new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710),
				new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950)
		);
		
		transactions.stream()
			.filter((t) -> t.getYear() == 2011)
			.sorted((t1, t2) -> Integer.compare(t1.getValue(), t2.getValue()))
			.forEach(System.out::println);
		
		System.out.println("-----------------------------------------------");
		
		transactions.stream()
			.map((t) -> t.getTrader().getCity())
			.distinct()
			.forEach(System.out::println);
		
		System.out.println("-----------------------------------------------");
		
		transactions.stream()
			.filter((t) -> t.getTrader().getCity().equals("Cambridge"))
			.map(Transaction::getTrader)
			.sorted((t1, t2) -> t1.getName().compareTo(t2.getName()))
			.distinct()
			.forEach(System.out::println);
		
		System.out.println("-----------------------------------------------");
		
		transactions.stream()
			.map((t) -> t.getTrader().getName())
			.sorted()
			.distinct()
			.forEach(System.out::println);
		
		System.out.println("-----------------------------------------------");
		
		boolean isAnyOneInMilan =
				transactions.stream()
					.anyMatch((t) -> t.getTrader().getCity().equals("Milan"));
		
		System.out.println(isAnyOneInMilan);
						
		System.out.println("-----------------------------------------------");
		
		Optional<Integer> sum = 
			transactions.stream()
				.filter((t) -> t.getTrader().getCity().equals("Cambridge"))
				.map(Transaction::getValue)
				.reduce(Integer::sum);
		
		System.out.println(sum.get());
		
		System.out.println("-----------------------------------------------");
		
		Optional<Integer> max = 
				transactions.stream()
					.map(Transaction::getValue)
					.max(Integer::compare);
		
		System.out.println(max.get());
		
		System.out.println("-----------------------------------------------");
		
		Optional<Integer> min = 
				transactions.stream()
					.map(Transaction::getValue)
					.min(Integer::compare);
		
		System.out.println(min.get());
	}
}