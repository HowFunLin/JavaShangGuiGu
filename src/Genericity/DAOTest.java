package Genericity;

import java.util.List;
import org.junit.Test;

public class DAOTest
{
	@Test
	public void test()
	{
		DAO<User> d = new DAO<User>();
		
		User u1 = new User(1, 18, "Amy");
		User u2 = new User(2, 18, "Black");
		User u3 = new User(3, 18, "Cathy");
		
		d.save("1", u1);
		d.get("1");
		d.update("1", u2);
		d.save("2", u3);
		
		@SuppressWarnings("unused")
		List<User> list = d.list();
		
		d.delete("2");
	}
}
