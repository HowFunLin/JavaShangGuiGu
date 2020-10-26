package ObjectOriented.JourneyToTheWest;

public class Test
{
	public static void main(String[] args)
	{
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		p1.setName("Sun Wukong");
		p1.setRace("Immortal");
		p2.setName("Tang Monk");
		p2.setRace("Human");
		p3.setName("White Bone Demon");
		p3.setRace("Demon");
		
		System.out.println(p1);
		p1.skill();
		
		System.out.println(p2);
		p2.skill();
		
		System.out.println(p3);
		p3.skill();
		
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
	}
}
