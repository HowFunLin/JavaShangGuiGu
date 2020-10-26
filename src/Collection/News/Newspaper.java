package Collection.News;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;

public class Newspaper
{
	public static void main(String[] args)
	{
		News n1 = new News("中国多地遭雾霾笼罩空气质量再成热议话题");
		News n3 = new News("春节临近北京“卖房热”");
		News n4 = new News("春节临近北京“卖房热”");
		News n2 = new News("民进党台北举行“火大游行”");
		
		System.out.println("News2: " + n2);
		
		System.out.println("Is news1 equals news2? " + n1.equals(n2));
		System.out.println("Is news3 equals news4? " + n3.equals(n4));
		
		HashSet<News> hs = new HashSet<News>();
		
		hs.add(n1);
		hs.add(n2);
		hs.add(n3);
		hs.add(n4);
		
		for(News n: hs) System.out.println(n);
		
		System.out.println("News number: " + hs.size());
		
		System.out.println("------------------------------------");
		
		ArrayList<News> a = new ArrayList<News>();
		
		a.add(n1);
		a.add(n2);
		
		ListIterator<News> li = a.listIterator();
		
		while(li.hasNext())
		{
			li.next();
		}
		
		while(li.hasPrevious())
		{
			News n = li.previous();
			
			System.out.println(n);
			
			String title = n.getTitle();
			
			if(title.length() >= 15)
			{
				String newTitle = title.substring(0, 14) + "…";
				n.setTitle(newTitle);
			}
		}
		
		System.out.println("Handling news titles...");
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
	}
}
