package Genericity;

public class AppleTest
{
	public static void main(String[] args)
	{
		Apple<String> a1 = new Apple<String>("500¿Ë");
		Apple<Integer> a2 = new Apple<Integer>(500);
		Apple<Double> a3 = new Apple<Double>(500.0);
		
		System.out.println(a1.getWeight());
		System.out.println(a2.getWeight());
		System.out.println(a3.getWeight());
	}
}

class Apple<T>
{
	private T weight;

	public Apple(T weight)
	{
		this.weight = weight;
	}

	public T getWeight()
	{
		return weight;
	}
}