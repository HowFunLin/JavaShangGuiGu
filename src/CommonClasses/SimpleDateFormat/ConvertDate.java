package CommonClasses.SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ConvertDate
{
	public static void main(String[] args) throws ParseException
	{
		String date = "2020-08-12";
		
		System.out.println(convertSDF(date));
		System.out.println(convertDTF(date));
	}

	public static Date convertSDF(String date) throws ParseException
	{
		String format = "yyyy-MM-dd";
		
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		
		Date d = sdf.parse(date);
		
		java.sql.Date jsd = new java.sql.Date(d.getTime());
		
		return jsd;
	}
	
	public static LocalDate convertDTF(String date)
	{
		//String format = "yyyy-MM-dd";
		//DateTimeFormatter dtf =  DateTimeFormatter.ofPattern(format);
		//LocalDate ld = LocalDate.parse(date, dtf);
		
		LocalDate ld = LocalDate.parse(date); 
		
		return ld;
	}
}
