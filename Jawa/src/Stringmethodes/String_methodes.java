package Stringmethodes;

public class String_methodes {
	public static void main(String[] args) {
		String cname="welcome to ojas  ";
		String cname2="welcome";
		System.out.println(cname.length());
		System.out.println(cname.charAt(12));
		/*if(cname.equals(cname2))
		{
			System.out.println("both strings are equal ");
		}
		else
		{
			System.out.println("both string are not equal ");
		}*/
		System.out.println(cname.equals(cname2));
		System.out.println(cname.equalsIgnoreCase(cname2));
		System.out.println(cname.trim());
		// it provides subpart of a string
		System.out.println(cname.substring(5));
		
		System.out.println(cname.substring(5, 10));
		System.out.println(cname.subSequence(5, 10));
		System.out.println(cname.indexOf('o'));
		System.out.println(cname.toLowerCase());
		System.out.println(cname.toUpperCase());
		System.out.println(cname.startsWith("w"));
		System.out.println(cname.endsWith("c"));
		System.out.println(cname.contains("ojas"));
		System.out.println(cname.isEmpty());
		System.out.println(cname.concat(cname2));
		System.out.println(cname.replace('w', 'e'));
		char []array=cname.toCharArray();
		System.out.println(array[5]);
	}

}
