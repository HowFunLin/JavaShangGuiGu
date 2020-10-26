package ObjectOriented.FruitGarden;

class FruitGardener
{
	public Fruit getFruit(String fruitName)
	{
		if(fruitName.equals("Apple")) return new Apple();
		if(fruitName.equals("Grape")) return new Grape();
		if(fruitName.equals("Strawberry")) return new Strawberry();
		return null;
	}
	
	public void introduce()
	{
		System.out.println("There are apples, grapes, strawberries in my garden.");
	}
}
