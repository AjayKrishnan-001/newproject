package onesoft.day3;

public class Practice
{
	public static void main (String[] argn)
	{
		String a="hello";
		String a1=a.toUpperCase();
		System.out.println(a1);
		
		
		String b="WORLD";
		String b1=b.toLowerCase();
		System.out.println(b1);
		
		
		String c=a1.concat(b1);//helloworld
		int c1=c.indexOf('H');
		System.out.println(c1);
		
		String d="ajay";
		String d1="krishnan";
		String d2=d.concat(d1);//ajaykrishnan
		char d3=d2.charAt(7);
		System.out.println(d3);
		
		String e="vijay";
		int e1=e.length();
		System.out.println(e1);
		
		String f="Them";
		String f1="them";
		boolean f3=f.equals(f1);
		System.out.println(f3);
		
		
		
		String g="carrot";
		boolean g1=g.contains("rot");
		System.out.println(g1);
		
		
		String h="john";
		boolean h1=h.startsWith("jo");
		System.out.println(h1);
		
		String j="theie";
		char[] j1=j.toCharArray();
		System.out.println(j1[0]);
		
		String k="karan,vijay,ajay";
		String[] k1=k.split(",");
		System.out.println(k1[0]);
		
		//
		
		
		String l1="croma,ajay,vijay";
		String[] l2=l1.split(",");
		System.out.println(l2[0]);
		
		
		
		
		
		
	}
	

}
