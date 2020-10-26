package ObjectOriented.FruitGarden;

class Strawberry implements Fruit
{
	@Override
	public void grow()
	{
		System.out.println("Strawberries is growing");
	}

	@Override
	public void harvest()
	{
		System.out.println("Harvest the strawberries");
	}

	@Override
	public void plant()
	{
		System.out.println("Strawberries has been planted");
	}
}
