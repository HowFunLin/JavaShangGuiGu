package Exception.EcmException;

public class EcmDef
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println(args[0] + " / " + args[1] + " = " + + ecm(args));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static double ecm(String[] args) throws NumberFormatException, ArrayIndexOutOfBoundsException, ArithmeticException, EcDef
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		if(a < 0 || b < 0) throw new EcDef("Cannot enter minus!");
		
		return a / b;
	}
}
