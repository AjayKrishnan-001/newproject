package onesoft.day3;

public class Length 
{
	public static void main (String[] argn)
	{
		String a="ajay";
		int b=a.length();
		System.out.println(b);
		String c="vijay";
		int d=c.indexOf('j');
		System.out.println(d);
		String d1="hari";
        char d2=d1.charAt(3);
        System.out.println(d2);
        
        String e1="ajaykihfjrukfjk";
        char e2=e1.charAt(e1.length()-1);
        System.out.println(e2);
        
        
        
        
        String f1="ajay";
        String f2="kumar";
        String f3=f1.concat(f2);
	}

}
