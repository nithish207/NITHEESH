package Stringmethodes;

public class Revercestring {
	public static void main(String[] args) {
		String name="nitheesh";
		String rev="";
		System.out.println(name.length());
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
	System.out.println("revarce string "+rev);
	}

}
