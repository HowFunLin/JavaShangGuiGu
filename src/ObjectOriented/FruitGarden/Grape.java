package ObjectOriented.FruitGarden;

class Grape implements Fruit
{
	@Override
	public void grow()
	{
		System.out.println("Grapes is growing");
	}

	@Override
	public void harvest()
	{
		System.out.println("Harvest the grapes");
	}

	@Override
	public void plant()
	{
		System.out.println("Grapes has been planted");
	}
}
