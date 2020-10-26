package ObjectOriented.JourneyToTheWest;

public class Person
{
	private String name;
	private int height;
	private String weapon;
	private String race;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public void setHeight(int height)
	{
		this.height = height;
	}
	
	public String getWeapon()
	{
		return weapon;
	}
	
	public void setWeapon(String weapon)
	{
		this.weapon = weapon;
	}
	
	public String getRace()
	{
		return race;
	}
	
	public void setRace(String race)
	{
		this.race = race;
	}
	
	@Override
	public String toString()
	{
		return "Name: " + name + ", Race: " + race;
	}
	
	void skill()
	{
		if(this.name.equals("Sun Wukong")) System.out.println("Seventy-two Metamorphoses");
		if(this.name.equals("Tang Monk")) System.out.println("The Incantation of the Golden Hoop");
		if(this.name.equals("White Bone Demon")) System.out.println("Nine Yin White Bone Claw");
	}

	@Override
	public boolean equals(Object obj)
	{
		Person p = (Person) obj;
		
		if(p.race.equals("Human") || p.race.equals("Immortal")) return true;
		if(p.race.equals("Demon")) return false;
		
		return false;
	}
}
