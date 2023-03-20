package onesoft.day3;

public class Test 
{
	public static void main (String[] argn)
	{
	String a="world wide wonder";
	String[] a1=a.split(" ");
	System.out.println(a1[0]);//world
	System.out.println(a1[1]);//wide
	System.out.println(a1[2]);//wonder
	System.out.println(a1[0].toUpperCase());
	System.out.println(a+" programs");
	
	
	String b="soft";
	boolean b1=b.endsWith("y");
	System.out.println(b1);
	
	
	String c="wonder land";
	String c1="WONDER LAND";
	boolean c2=c.equalsIgnoreCase(c1);
	System.out.println(c2);
	
	
	           String r="MANGO";
	           String r1=r.toLowerCase();
	           System.out.println(r1);
	           
	           String g="Fantacy program";
	           boolean g1=g.startsWith("F");
	           System.out.println(g1);
	           boolean g2=g.endsWith("s");
	           System.out.println(g2);
	           
	           
	           int g3=g.length();
	           System.out.println(g3);
	           
	           char g4=g.charAt(g.length()-2);
	           System.out.println(g4);
	           
	           String n="reynolds";
	           char[] n1=n.toCharArray();
	           System.out.println(n1[0]);
	           System.out.println(n1[1]);
	           System.out.println(n1[2]);
	           System.out.println(n1[3]);
	           System.out.println(n1[4]);
	           System.out.println(n1[5]);
	           System.out.println(n1[6]);
	           System.out.println(n1[7]);
	           
	           
	           
	           
	           
	           
	           
	
	
	
	
	
	
	
	

}
}