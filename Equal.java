package onesoft.day3;

public class Equal 
{
	public static void main (String[] argn)
	{
		String a1="word";
		String a2="Word";
		boolean a3=a1.equals(a2);
		System.out.println(a3);
		
		
		
		String b1="Word";
		String b2="word";
		boolean b3=a1.equals(b2);
		System.out.println(b3);
		
		String c1="tree";
		boolean c2=c1.contains("re");
		System.out.println(c2);
		
		
		String d1="tree";
		boolean d2=d1.startsWith("ee");     
		System.out.println(d2);
		
		
		
		String e1="tree";
		boolean e2=e1.endsWith("ee");
		System.out.println(e2);
		
			}

}
