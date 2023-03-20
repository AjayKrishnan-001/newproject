package onesoft.day3;

public class Substring 
{
	public static void main (String[] argn)
	{
		String a="Ajay kumar";
		String b=a.substring(3,8);
		System.out.println(b);//y kum
		char t=b.charAt(b.length()-2);//y kum
		System.out.println(t);
		
		
		
		String a1="croma";
		char[] b1=a1.toCharArray();
		System.out.println(b1[0]);
		System.out.println(b1[1]);
		System.out.println(b1[2]);
		System.out.println(b1[3]);
		System.out.println(b1[4]);
		
		
		String c1="croma,ajay,vijay";
		String[] c2=c1.split(",");
		System.out.println(c2[0]);
		System.out.println(c2[1]);
		System.out.println(c2[2]);
		char[] c3=c2[1].toCharArray();//ajay
		System.out.println(c3[1]);
		
		
		String d1="TN92f0099";
		String[] d2=d1.split("[a-z A-Z]");
		System.out.println(d2[0]);
		System.out.println(d2[1]);
		System.out.println(d2[2]);
		System.out.println(d2[3]);
		System.out.println(d2[4]);
		System.out.println(d2[5]);
		System.out.println(d2[6]);

		
		
		
	}

}