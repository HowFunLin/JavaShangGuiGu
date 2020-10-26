package CommonClasses.SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fisherman
{
	public static void main(String[] args) throws ParseException
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
		Date date = sdf.parse("2020-09-08");
		System.out.println(fishingOrSunningNet(date));
	}

	public static String fishingOrSunningNet(Date date) throws ParseException
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
		Date d = sdf.parse("1990-01-01");
		long time = date.getTime() - d.getTime();
		long day = time / (1000 * 60 * 60 * 24) + 1;
		
		day = day % 3;
		
		if(day < 1) return "Fishing!";
		else return "Sunning net!";
	}
}
