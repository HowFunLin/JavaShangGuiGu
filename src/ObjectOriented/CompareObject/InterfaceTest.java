package ObjectOriented.CompareObject;

public class InterfaceTest
{
	public static void main(String[] args)
	{
		ComparableCircle cc1 = new ComparableCircle(1);
		ComparableCircle cc2 = new ComparableCircle(1);
		ComparableCircle cc3 = new ComparableCircle(2);

		System.out.println(cc1.compareTo(cc2));
		System.out.println(cc1.compareTo(cc3));
		System.out.println(cc3.compareTo(cc1));
	}
}
