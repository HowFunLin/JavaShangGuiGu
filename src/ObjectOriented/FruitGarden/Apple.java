package ObjectOriented.FruitGarden;

class Apple implements Fruit
{
	@Override
	public void grow()
	{
		System.out.println("Apples is growing");
	}

	@Override
	public void harvest()
	{
		System.out.println("Harvest the apples");
	}

	@Override
	public void plant()
	{
		System.out.println("Apples has been planted");
	}
}
