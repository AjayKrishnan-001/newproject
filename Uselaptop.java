package onesoft.day3;

/**
 * @author user
 *
 */
public class Uselaptop 
{
	public static void main (String[] argn)
	{
		Laptop l1=new Laptop();
		l1.name="dell";
		l1.price=500000;
		l1.color="RED";
		System.out.println(l1.name.toUpperCase());
		System.out.println(l1.name.length());
		System.out.println(l1.name.startsWith("D"));
		System.out.println(l1.name.charAt(l1.name.length()-1));
		System.out.println(l1.color.toLowerCase());
		
		
	}

}
